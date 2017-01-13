package com.idea.cjyl.food.web.controller;


import com.idea.cjyl.core.common.ResultData;
import com.idea.cjyl.core.generic.GenericController;
import com.idea.cjyl.food.web.domain.pojo.FoodMeterial;
import com.idea.cjyl.food.web.service.FoodMeterialService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
* Created by 10238 on 2016/10/12.
*/
@Controller
@RequestMapping("serve/food_meterial")
public class FoodMeterialController extends GenericController {
    @Autowired
    private FoodMeterialService foodmeterialService;

    /**
        * 添加食材配料
        * @param foodmeterial
        * @return
    */
    @ResponseBody
    @RequestMapping(value="add" ,method = RequestMethod.POST)
    public ResultData add(FoodMeterial foodmeterial){

        try {
                    foodmeterialService.insertLevel(foodmeterial);


            }catch (Exception e){
                return ResultData.build().addErroe();
            }
        return ResultData.build();

    }

    /**
    * 删除食材配料
    * @param id
    * @return
    */
    @ResponseBody
    @RequestMapping(value="del" ,method = RequestMethod.POST)
    public ResultData del(Long id) {
        try {
                    foodmeterialService.deleteLevel(id);
            } catch (Exception e) {
                return ResultData.build().delError();
            }
        return ResultData.build();

    }

    /**
    * 修改食材配料
    * @param foodmeterial
    * @return
    */
    @ResponseBody
    @RequestMapping(value="update",method = RequestMethod.POST)
    public ResultData update(FoodMeterial foodmeterial){
        try {
            foodmeterialService.update(foodmeterial);

        } catch (Exception e){
            return ResultData.build().upDateError();
        }
        return ResultData.build();
    }

    /**
    * 分页查询所有食材配料
    * @param currentPage
    * @param limit
    * @return
    */
    @ResponseBody
    @RequestMapping(value="findAll",method = RequestMethod.GET)
    public ResultData findAll(Integer currentPage,Integer limit){
        return ResultData.build().
        parsePageBean(foodmeterialService.findAll(currentPage,limit));
    }


    /**
    * 按级别查询服务类别
    * @return
    */
    @ResponseBody
    @RequestMapping(value = "findTreeAll",method = RequestMethod.GET)
    public ResultData findTreeAll(){
        return ResultData.build().put("aaData",foodmeterialService.findTree());
    }

}