package com.idea.cjyl.food.web.controller;

import com.idea.cjyl.core.common.ResultData;
import com.idea.cjyl.core.generic.GenericController;
import com.idea.cjyl.food.web.domain.pojo.FoodMeterialNutriment;
import com.idea.cjyl.food.web.service.FoodMeterialNutrimentService;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
* Created by 10238 on 2016/10/12.
*/
@Controller
@RequestMapping("serve/food_meterial_nutriment")
public class FoodMeterialNutrimentController extends GenericController {
    @Autowired
    private FoodMeterialNutrimentService foodmeterialnutrimentService;

    /**
        * 添加食材配料和营养物质关系
        * @param foodmeterialnutriment
        * @return
    */
    @ResponseBody
    @RequestMapping(value="add" ,method = RequestMethod.POST)
    public ResultData add(FoodMeterialNutriment foodmeterialnutriment){

        try {
                    foodmeterialnutrimentService.insert(foodmeterialnutriment);


            }catch (Exception e){
                return ResultData.build().addErroe();
            }
        return ResultData.build();

    }

    /**
    * 删除食材配料和营养物质关系
    * @param id
    * @return
    */
    @ResponseBody
    @RequestMapping(value="del" ,method = RequestMethod.POST)
    public ResultData del(Long id) {
        try {
                    foodmeterialnutrimentService.delete(id);
            } catch (Exception e) {
                return ResultData.build().delError();
            }
        return ResultData.build();

    }

    /**
    * 修改食材配料和营养物质关系
    * @param foodmeterialnutriment
    * @return
    */
    @ResponseBody
    @RequestMapping(value="update",method = RequestMethod.POST)
    public ResultData update(FoodMeterialNutriment foodmeterialnutriment){
        try {
            foodmeterialnutrimentService.update(foodmeterialnutriment);

        } catch (Exception e){
            return ResultData.build().upDateError();
        }
        return ResultData.build();
    }

    /**
    * 分页查询所有食材配料和营养物质关系
    * @param currentPage
    * @param limit
    * @return
    */
    @ResponseBody
    @RequestMapping(value="findAll",method = RequestMethod.GET)
    public ResultData findAll(Integer currentPage,Integer limit){
        return ResultData.build().
        parsePageBean(foodmeterialnutrimentService.findAll(currentPage,limit));
    }


}