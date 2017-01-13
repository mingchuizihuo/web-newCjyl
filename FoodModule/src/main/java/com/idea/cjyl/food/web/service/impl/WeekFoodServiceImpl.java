package com.idea.cjyl.food.web.service.impl;


import com.idea.cjyl.core.generic.GenericDao;
import com.idea.cjyl.core.generic.GenericServiceImpl;
import com.idea.cjyl.core.util.DateConversion;
import com.idea.cjyl.food.web.dao.WeekFoodMapper;
import com.idea.cjyl.food.web.dao.myself.WeekFoodMapperMyself;
import com.idea.cjyl.food.web.domain.pojo.WeekFoodExample;
import com.idea.cjyl.food.web.domain.vo.SelectVOWeekFood;
import com.idea.cjyl.food.web.domain.vo.WeekFoodOneEarlyVO;
import com.idea.cjyl.food.web.domain.vo.WeekFoodShowVO;
import com.idea.cjyl.food.web.domain.vo.WeekFoodVO;
import com.idea.cjyl.food.web.service.WeekFoodService;

import com.idea.cjyl.food.web.domain.pojo.WeekFood;

import org.apache.commons.collections.map.HashedMap;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.*;




@Service
public class WeekFoodServiceImpl extends GenericServiceImpl<WeekFood, Long, WeekFoodExample> implements WeekFoodService {
    @Autowired
    private WeekFoodMapper weekfoodDao;
    @Autowired
    private WeekFoodMapperMyself weekFoodMapperMyself;

    @Override
    public GenericDao<WeekFood, Long, WeekFoodExample> getDao() {
        return weekfoodDao;
    }


    public void insert(SelectVOWeekFood selectVOWeekFood) {
        //获取本周时间数组
        Date[] weekDateList = DateConversion.getWeekByYearWeek(selectVOWeekFood.getStartDate(), selectVOWeekFood.getEndDate());
        int week = 0;
        int endweek = 52;
        for(Date fdate:weekDateList){
            Calendar cl = Calendar.getInstance();
            cl.setTime(fdate);
            week = cl.get(Calendar.WEEK_OF_YEAR);




            for (int j = 1; j <= 3; j++) {
                WeekFood weekFood = new WeekFood();
                weekFood.setDishesList("");
                weekFood.setFoodDate(fdate);
                weekFood.setOneEarly((byte) j);
                weekFood.setWeekDate((byte) week);
                weekfoodDao.insert(weekFood);
            }
        }


    }

    @Override
    public WeekFoodShowVO findWeekVO(SelectVOWeekFood selectVOWeekFood) {

        List<WeekFoodVO> weekFoodVOList = weekFoodMapperMyself.findWeekFood(selectVOWeekFood);

        if(weekFoodVOList.size()==0){
            insert(selectVOWeekFood);
            weekFoodVOList = weekFoodMapperMyself.findWeekFood(selectVOWeekFood);
        }

        //获取本周时间数组
        Date[] weekDateList = DateConversion.getWeekByYearWeek(selectVOWeekFood.getStartDate(), selectVOWeekFood.getEndDate());

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        //封装返回数据
        WeekFoodShowVO weekFoodShow = new WeekFoodShowVO();
        weekFoodShow.setWeekStartDate(weekDateList[0]);
        weekFoodShow.setWeekEndDate(weekDateList[6]);
        Calendar cl = Calendar.getInstance();
        cl.setTime(selectVOWeekFood.getStartDate());
        int  week = cl.get(Calendar.WEEK_OF_YEAR);
        weekFoodShow.setWeek(week);

        List<WeekFoodOneEarlyVO> weekFoodOneEarlyVOListList =  new ArrayList<>();
        for (Date date : weekDateList) {

            WeekFoodOneEarlyVO weekFoodOneEarlyVO = new WeekFoodOneEarlyVO();
            weekFoodOneEarlyVO.setFoodDate(date);
            for (WeekFoodVO weekFoodVO : weekFoodVOList) {

                if (sdf.format(date).equals(sdf.format(weekFoodVO.getFoodDate()))) {


                    if (weekFoodVO.getOneEarly() == 1) {


                        Map<String, Object> morningDishes = new HashedMap();
                        morningDishes.put("id", weekFoodVO.getId());
                        morningDishes.put("dishesList", weekFoodVO.getDishesVOList());
                        weekFoodOneEarlyVO.setMorningDishes(morningDishes);

                    }
                    if (weekFoodVO.getOneEarly() == 2) {


                        Map<String, Object> noonDishes = new HashedMap();
                        noonDishes.put("id", weekFoodVO.getId());
                        noonDishes.put("dishesList", weekFoodVO.getDishesVOList());
                        weekFoodOneEarlyVO.setNoonDishes(noonDishes);
                    }
                    if (weekFoodVO.getOneEarly() == 3) {


                        Map<String, Object> nightDishes = new HashedMap();
                        nightDishes.put("id", weekFoodVO.getId());
                        nightDishes.put("dishesList", weekFoodVO.getDishesVOList());
                        weekFoodOneEarlyVO.setNightDishes(nightDishes);
                    }



                }

            }

            weekFoodOneEarlyVOListList.add(weekFoodOneEarlyVO);
        }
        weekFoodShow.setWeekFoodOneEarlyVOs(weekFoodOneEarlyVOListList);
        return weekFoodShow;
    }
}
