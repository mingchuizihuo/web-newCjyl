package com.idea.cjyl.food.web.service.impl;


import com.idea.cjyl.core.generic.GenericDao;
import com.idea.cjyl.core.generic.GenericServiceRelationImpl;
import com.idea.cjyl.food.web.dao.WeekFoodDishesMapper;
import com.idea.cjyl.food.web.domain.pojo.WeekFoodDishes;

import com.idea.cjyl.food.web.domain.pojo.WeekFoodDishesExample;
import com.idea.cjyl.food.web.service.WeekFoodDishesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class WeekFoodDishesServiceImpl extends GenericServiceRelationImpl<WeekFoodDishes, Long,WeekFoodDishesExample> implements WeekFoodDishesService {
    @Autowired
    private WeekFoodDishesMapper weekfooddishesDao;
    @Override
    public GenericDao<WeekFoodDishes, Long,WeekFoodDishesExample> getDao() {
        return weekfooddishesDao;
    }



    @Override
    public WeekFoodDishesExample getDelModelExample(WeekFoodDishes weekFoodDishes) {
        WeekFoodDishesExample weekFoodDishesExample = new WeekFoodDishesExample();
        if(weekFoodDishes.getDishesId()==null){
            weekFoodDishesExample.createCriteria().andWeekFoodIdEqualTo(weekFoodDishes.getWeekFoodId());
        }else{
            weekFoodDishesExample.createCriteria().andWeekFoodIdEqualTo(weekFoodDishes.getWeekFoodId()).
                    andDishesIdEqualTo(weekFoodDishes.getDishesId());
        }


        return weekFoodDishesExample;
    }
    @Override
    public String findDishesListByWeekFood(Long weekFoodId) {
        WeekFoodDishesExample example = new WeekFoodDishesExample();
        example.createCriteria().andWeekFoodIdEqualTo(weekFoodId);
        String dishesIds ="";
        List<WeekFoodDishes> weekFoodDishesList =  weekfooddishesDao.selectByExample(example);
        for (WeekFoodDishes weekFoodDishes: weekFoodDishesList
             ) {
            dishesIds+=weekFoodDishes.getDishesId()+",";
        }

        return dishesIds;
    }


}
