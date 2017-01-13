package com.idea.cjyl.totalmodule.web.controller;

import com.idea.cjyl.core.common.ResultData;
import com.idea.cjyl.core.generic.GenericController;
import com.idea.cjyl.totalmodule.web.domain.pojo.OlderInitialFee;
import com.idea.cjyl.totalmodule.web.service.OlderInitialFeeService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
* Created by 10238 on 2016/10/12.
*/
@Controller
@RequestMapping("serve/older_initial_fee")
public class OlderInitialFeeController extends GenericController {
    @Autowired
    private OlderInitialFeeService olderinitialfeeService;

    /**
        * 添加老人入住初始费用关系
        * @param olderinitialfee
        * @return
    */
    @ResponseBody
    @RequestMapping(value="add" ,method = RequestMethod.POST)
    public ResultData add(OlderInitialFee olderinitialfee){

        try {
                    olderinitialfeeService.insert(olderinitialfee);


            }catch (Exception e){
                return ResultData.build().addErroe();
            }
        return ResultData.build();

    }

    /**
    * 删除老人入住初始费用关系
    * @param id
    * @return
    */
    @ResponseBody
    @RequestMapping(value="del" ,method = RequestMethod.POST)
    public ResultData del(Long id) {
        try {
                    olderinitialfeeService.delete(id);
            } catch (Exception e) {
                return ResultData.build().delError();
            }
        return ResultData.build();

    }
    /**
    * 批量删除老人入住初始费用关系
    *
    * @param ids
    * @return
    */
    @ResponseBody
    @RequestMapping(value = "dels", method = RequestMethod.POST)
    public ResultData del(String ids) {
        try {
            String[] idsArray = ids.split(",");
            for (String id : idsArray) {
                olderinitialfeeService.delete(Long.parseLong(id));
            }

            } catch (Exception e) {
                return ResultData.build().delError();
            }
            return ResultData.build();

    }
    /**
    * 修改老人入住初始费用关系
    * @param olderinitialfee
    * @return
    */
    @ResponseBody
    @RequestMapping(value="update",method = RequestMethod.POST)
    public ResultData update(OlderInitialFee olderinitialfee){
        try {
            olderinitialfeeService.update(olderinitialfee);

        } catch (Exception e){
            return ResultData.build().upDateError();
        }
        return ResultData.build();
    }

    /**
    * 分页查询所有老人入住初始费用关系
    * @param currentPage
    * @param limit
    * @return
    */
    @ResponseBody
    @RequestMapping(value="findAll",method = RequestMethod.GET)
    public ResultData findAll(Integer currentPage,Integer limit){
        return ResultData.build().
        parsePageBean(olderinitialfeeService.findAll(currentPage,limit));
    }

    /**
     * 通过条件分页查询
     * @param olderInitialFee
     * @param currentPage
     * @param limit
     * @return
     */
    @ResponseBody
    @RequestMapping(value="findByExample",method = RequestMethod.GET)
    public ResultData findByExample(OlderInitialFee olderInitialFee,Integer currentPage,Integer limit){
        return ResultData.build().
                parsePageBean(olderinitialfeeService.findVOByExapmle(olderInitialFee,currentPage,limit));
    }
}