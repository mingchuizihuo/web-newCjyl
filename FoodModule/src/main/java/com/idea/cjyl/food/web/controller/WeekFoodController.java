package com.idea.cjyl.food.web.controller;

import com.idea.cjyl.core.common.ResultData;
import com.idea.cjyl.core.generic.GenericController;
import com.idea.cjyl.food.web.domain.vo.SelectVOWeekFood;
import com.idea.cjyl.food.web.domain.vo.WeekFoodShowVO;
import com.idea.cjyl.food.web.service.WeekFoodService;

import com.idea.cjyl.food.web.domain.pojo.WeekFood;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Date;

/**
* Created by 10238 on 2016/10/12.
*/
@Controller
@RequestMapping("serve/week_food")
public class WeekFoodController extends GenericController {
    @Autowired
    private WeekFoodService weekfoodService;

    /**
        * 添加本周食谱
        * @param selectVOWeekFood
        * @return
    */
    @ResponseBody
    @RequestMapping(value="add" ,method = RequestMethod.POST)
    public ResultData add(SelectVOWeekFood selectVOWeekFood){

        try {
                weekfoodService.insert(selectVOWeekFood);

            }catch (Exception e){
                return ResultData.build().addErroe();
            }
        return ResultData.build();

    }

    /**
    * 删除本周食谱
    * @param id
    * @return
    */
    @ResponseBody
    @RequestMapping(value="del" ,method = RequestMethod.POST)
    public ResultData del(Long id) {
        try {
                weekfoodService.delete(id);
            } catch (Exception e) {
                return ResultData.build().delError();
            }
        return ResultData.build();

    }

    /**
    * 修改本周食谱
    * @param weekfood
    * @return
    */
    @ResponseBody
    @RequestMapping(value="update",method = RequestMethod.POST)
    public ResultData update(WeekFood weekfood){
        try {
            weekfoodService.update(weekfood);

        } catch (Exception e){
            return ResultData.build().upDateError();
        }
        return ResultData.build();
    }

    /**
    * 分页查询所有本周食谱
    * @param currentPage
    * @param limit
    * @return
    */
    @ResponseBody
    @RequestMapping(value="findAll",method = RequestMethod.GET)
    public ResultData findAll(Integer currentPage,Integer limit){
        return ResultData.build().
        parsePageBean(weekfoodService.findAll(currentPage,limit));
    }

    @ResponseBody
    @RequestMapping(value="findWeek",method = RequestMethod.GET)
    public ResultData findWeek(SelectVOWeekFood selectVOWeekFood){
        WeekFoodShowVO weekFoodShowVO = weekfoodService.findWeekVO(selectVOWeekFood);
        System.out.println(weekFoodShowVO);
        return ResultData.build().parseBean(weekfoodService.findWeekVO(selectVOWeekFood));
    }

}