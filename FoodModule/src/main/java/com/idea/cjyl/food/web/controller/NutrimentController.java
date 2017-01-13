package com.idea.cjyl.food.web.controller;

import com.idea.cjyl.core.common.ResultData;
import com.idea.cjyl.core.generic.GenericController;
import com.idea.cjyl.food.web.domain.pojo.Nutriment;

import com.idea.cjyl.food.web.service.NutrimentService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
* Created by 10238 on 2016/10/12.
*/
@Controller
@RequestMapping("serve/nutriment")
public class NutrimentController extends GenericController {
    @Autowired
    private NutrimentService nutrimentService;

    /**
        * 添加营养物质
        * @param nutriment
        * @return
    */
    @ResponseBody
    @RequestMapping(value="add" ,method = RequestMethod.POST)
    public ResultData add(Nutriment nutriment){

        try {
                    nutrimentService.insertLevel(nutriment);


            }catch (Exception e){
                return ResultData.build().addErroe();
            }
        return ResultData.build();

    }

    /**
    * 删除营养物质
    * @param id
    * @return
    */
    @ResponseBody
    @RequestMapping(value="del" ,method = RequestMethod.POST)
    public ResultData del(Long id) {
        try {
                    nutrimentService.deleteLevel(id);
            } catch (Exception e) {
                return ResultData.build().delError();
            }
        return ResultData.build();

    }

    /**
    * 修改营养物质
    * @param nutriment
    * @return
    */
    @ResponseBody
    @RequestMapping(value="update",method = RequestMethod.POST)
    public ResultData update(Nutriment nutriment){
        try {
            nutrimentService.update(nutriment);

        } catch (Exception e){
            return ResultData.build().upDateError();
        }
        return ResultData.build();
    }

    /**
    * 分页查询所有营养物质
    * @param currentPage
    * @param limit
    * @return
    */
    @ResponseBody
    @RequestMapping(value="findAll",method = RequestMethod.GET)
    public ResultData findAll(Integer currentPage,Integer limit){
        return ResultData.build().
        parsePageBean(nutrimentService.findAll(currentPage,limit));
    }


    /**
    * 按级别查询服务类别
    * @return
    */
    @ResponseBody
    @RequestMapping(value = "findTreeAll",method = RequestMethod.GET)
    public ResultData findTreeAll(){
        return ResultData.build().put("aaData",nutrimentService.findTree());
    }

}