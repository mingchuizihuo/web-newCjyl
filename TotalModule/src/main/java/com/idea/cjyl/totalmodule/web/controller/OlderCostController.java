package com.idea.cjyl.totalmodule.web.controller;

import com.idea.cjyl.core.common.ResultData;
import com.idea.cjyl.core.generic.GenericController;
import com.idea.cjyl.totalmodule.web.domain.pojo.OlderCost;
import com.idea.cjyl.totalmodule.web.service.OlderCostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
* Created by 10238 on 2016/10/12.
*/
@Controller
@RequestMapping("serve/older_cost")
public class OlderCostController extends GenericController {
    @Autowired
    private OlderCostService oldercostService;

    /**
        * 添加老人特殊费用
        * @param oldercost
        * @return
    */
    @ResponseBody
    @RequestMapping(value="add" ,method = RequestMethod.POST)
    public ResultData add(OlderCost oldercost){

        try {
                    oldercostService.insert(oldercost);


            }catch (Exception e){
                return ResultData.build().addErroe();
            }
        return ResultData.build();

    }

    /**
    * 删除老人特殊费用
    * @param id
    * @return
    */
    @ResponseBody
    @RequestMapping(value="del" ,method = RequestMethod.POST)
    public ResultData del(Long id) {
        try {
                    oldercostService.delete(id);
            } catch (Exception e) {
                return ResultData.build().delError();
            }
        return ResultData.build();

    }
    /**
    * 批量删除老人特殊费用
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
                oldercostService.delete(Long.parseLong(id));
            }

            } catch (Exception e) {
                return ResultData.build().delError();
            }
            return ResultData.build();

    }
    /**
    * 修改老人特殊费用
    * @param oldercost
    * @return
    */
    @ResponseBody
    @RequestMapping(value="update",method = RequestMethod.POST)
    public ResultData update(OlderCost oldercost){
        try {
            oldercostService.update(oldercost);

        } catch (Exception e){
            return ResultData.build().upDateError();
        }
        return ResultData.build();
    }

    /**
    * 分页查询所有老人特殊费用
    * @param currentPage
    * @param limit
    * @return
    */
    @ResponseBody
    @RequestMapping(value="findAll",method = RequestMethod.GET)
    public ResultData findAll(Integer currentPage, Integer limit){
        return ResultData.build().
        parsePageBean(oldercostService.findAll(currentPage,limit));
    }
    /**
     * 通过条件分页查询
     * @param olderCost
     * @param currentPage
     * @param limit
     * @return
     */
    @ResponseBody
    @RequestMapping(value="findByExample",method = RequestMethod.GET)
    public ResultData findByExample(OlderCost olderCost, Integer currentPage, Integer limit){
        return ResultData.build().
                parsePageBean(oldercostService.findVOByExapmle(olderCost,currentPage,limit));
    }



}