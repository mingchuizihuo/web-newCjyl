package com.idea.cjyl.food.web.controller;

import com.idea.cjyl.core.common.ResultData;
import com.idea.cjyl.core.generic.GenericController;
import com.idea.cjyl.food.web.domain.pojo.DishesType;

import com.idea.cjyl.food.web.service.DishesTypeService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
* Created by 10238 on 2016/10/12.
*/
@Controller
@RequestMapping("serve/dishes_type")
public class DishesTypeController extends GenericController {
    @Autowired
    private DishesTypeService dishestypeService;

    /**
        * 添加菜品类别
        * @param dishestype
        * @return
    */
    @ResponseBody
    @RequestMapping(value="add" ,method = RequestMethod.POST)
    public ResultData add(DishesType dishestype){

        try {
                    dishestypeService.insertLevel(dishestype);


            }catch (Exception e){
                return ResultData.build().addErroe();
            }
        return ResultData.build();

    }

    /**
    * 删除菜品类别
    * @param id
    * @return
    */
    @ResponseBody
    @RequestMapping(value="del" ,method = RequestMethod.POST)
    public ResultData del(Long id) {
        try {
                    dishestypeService.deleteLevel(id);
            } catch (Exception e) {
                return ResultData.build().delError();
            }
        return ResultData.build();

    }

    /**
    * 修改菜品类别
    * @param dishestype
    * @return
    */
    @ResponseBody
    @RequestMapping(value="update",method = RequestMethod.POST)
    public ResultData update(DishesType dishestype){
        try {
            dishestypeService.update(dishestype);

        } catch (Exception e){
            return ResultData.build().upDateError();
        }
        return ResultData.build();
    }

    /**
    * 分页查询所有菜品类别
    * @param currentPage
    * @param limit
    * @return
    */
    @ResponseBody
    @RequestMapping(value="findAll",method = RequestMethod.GET)
    public ResultData findAll(Integer currentPage,Integer limit){
        return ResultData.build().
        parsePageBean(dishestypeService.findAll(currentPage,limit));
    }


    /**
    * 按级别查询服务类别
    * @return
    */
    @ResponseBody
    @RequestMapping(value = "findTreeAll",method = RequestMethod.GET)
    public ResultData findTreeAll(){
        return ResultData.build().put("aaData",dishestypeService.findTree());
    }

}