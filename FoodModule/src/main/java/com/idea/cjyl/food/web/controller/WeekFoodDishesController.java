package com.idea.cjyl.food.web.controller;

import com.idea.cjyl.core.common.ResultData;
import com.idea.cjyl.core.generic.GenericController;
import com.idea.cjyl.food.web.domain.pojo.WeekFoodDishes;
import com.idea.cjyl.food.web.service.WeekFoodService;

import com.idea.cjyl.food.web.domain.pojo.WeekFood;
import com.idea.cjyl.food.web.domain.pojo.WeekFoodDishes;
import com.idea.cjyl.food.web.service.WeekFoodDishesService;

import com.idea.cjyl.food.web.service.WeekFoodService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by 10238 on 2016/10/12.
 */
@Controller
@RequestMapping("serve/week_food_dishes")
public class WeekFoodDishesController extends GenericController {
    @Autowired
    private WeekFoodDishesService weekfooddishesService;
    @Autowired
    private WeekFoodService weekFoodService;


    /**
     * 添加本周食谱菜品关系
     *
     * @param weekfooddishes
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "add", method = RequestMethod.POST)
    public ResultData add(WeekFoodDishes weekfooddishes) {

        try {
            weekfooddishesService.insert(weekfooddishes);
            String dishesList = weekfooddishesService.findDishesListByWeekFood(weekfooddishes.getWeekFoodId());
            WeekFood weekFood = new WeekFood();
            weekFood.setId(weekfooddishes.getWeekFoodId());
            weekFood.setDishesList(dishesList);
            weekFoodService.update(weekFood);
        } catch (Exception e) {
            return ResultData.build().addErroe();
        }
        return ResultData.build();

    }

    /**
     * 批量添加
      * @param weekfooddishes
     * @param dishesIds
     * @return
     */
    @ResponseBody
    @RequestMapping(value="adds", method = RequestMethod.POST)
    public ResultData adds(WeekFoodDishes weekfooddishes,String dishesIds){
        try {
            weekfooddishesService.deleteRelation(weekfooddishes);
            String[] dishes = dishesIds.split(",");
            for(String str:dishes){
                weekfooddishes.setDishesId(Long.parseLong(str));
                weekfooddishesService.insert(weekfooddishes);
                String dishesList = weekfooddishesService.findDishesListByWeekFood(weekfooddishes.getWeekFoodId());
                WeekFood weekFood = new WeekFood();
                weekFood.setId(weekfooddishes.getWeekFoodId());
                weekFood.setDishesList(dishesList);
                weekFoodService.update(weekFood);
            }

        } catch (Exception e) {
            return ResultData.build().addErroe();
        }
        return ResultData.build();
    }
    /**
     * 删除本周食谱菜品关系
     *
     * @param weekfooddishes
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "del", method = RequestMethod.POST)
    public ResultData del(WeekFoodDishes weekfooddishes) {
        try {
            weekfooddishesService.deleteRelation(weekfooddishes);
            String dishesList = weekfooddishesService.findDishesListByWeekFood(weekfooddishes.getWeekFoodId());
            WeekFood weekFood = new WeekFood();
            weekFood.setId(weekfooddishes.getWeekFoodId());
            weekFood.setDishesList(dishesList);
            weekFoodService.update(weekFood);
        } catch (Exception e) {
            return ResultData.build().delError();
        }
        return ResultData.build();

    }

    /**
     * 修改本周食谱菜品关系
     *
     * @param weekfooddishes
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "update", method = RequestMethod.POST)
    public ResultData update(WeekFoodDishes weekfooddishes) {
        try {
            weekfooddishesService.update(weekfooddishes);

        } catch (Exception e) {
            return ResultData.build().upDateError();
        }
        return ResultData.build();
    }

    /**
     * 分页查询所有本周食谱菜品关系
     *
     * @param currentPage
     * @param limit
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "findAll", method = RequestMethod.GET)
    public ResultData findAll(Integer currentPage, Integer limit) {
        return ResultData.build().
                parsePageBean(weekfooddishesService.findAll(currentPage, limit));
    }

}