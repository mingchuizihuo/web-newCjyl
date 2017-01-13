package com.idea.cjyl.totalmodule.web.controller;

import com.idea.cjyl.core.common.ResultData;
import com.idea.cjyl.core.generic.GenericController;
import com.idea.cjyl.totalmodule.web.domain.pojo.OlderInitialFee;
import com.idea.cjyl.totalmodule.web.domain.pojo.OlderNurseLog;
import com.idea.cjyl.totalmodule.web.service.OlderNurseLogService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
* Created by 10238 on 2016/10/12.
*/
@Controller
@RequestMapping("serve/older_nurse_log")
public class OlderNurseLogController extends GenericController {
    @Autowired
    private OlderNurseLogService oldernurselogService;

    /**
        * 添加老人护理记录
        * @param oldernurselog
        * @return
    */
    @ResponseBody
    @RequestMapping(value="add" ,method = RequestMethod.POST)
    public ResultData add(OlderNurseLog oldernurselog){

        try {
                    oldernurselogService.insert(oldernurselog);


            }catch (Exception e){
                return ResultData.build().addErroe();
            }
        return ResultData.build();

    }

    /**
    * 删除老人护理记录
    * @param id
    * @return
    */
    @ResponseBody
    @RequestMapping(value="del" ,method = RequestMethod.POST)
    public ResultData del(Long id) {
        try {
                    oldernurselogService.delete(id);
            } catch (Exception e) {
                return ResultData.build().delError();
            }
        return ResultData.build();

    }
    /**
    * 批量删除老人护理记录
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
                oldernurselogService.delete(Long.parseLong(id));
            }

            } catch (Exception e) {
                return ResultData.build().delError();
            }
            return ResultData.build();

    }
    /**
    * 修改老人护理记录
    * @param oldernurselog
    * @return
    */
    @ResponseBody
    @RequestMapping(value="update",method = RequestMethod.POST)
    public ResultData update(OlderNurseLog oldernurselog){
        try {
            oldernurselogService.update(oldernurselog);

        } catch (Exception e){
            return ResultData.build().upDateError();
        }
        return ResultData.build();
    }

    /**
    * 分页查询所有老人护理记录
    * @param currentPage
    * @param limit
    * @return
    */
    @ResponseBody
    @RequestMapping(value="findAll",method = RequestMethod.GET)
    public ResultData findAll(Integer currentPage,Integer limit){
        return ResultData.build().
        parsePageBean(oldernurselogService.findAll(currentPage,limit));
    }
    /**
     * 通过条件分页查询
     * @param olderNurseLog
     * @param currentPage
     * @param limit
     * @return
     */
    @ResponseBody
    @RequestMapping(value="findByExample",method = RequestMethod.GET)
    public ResultData findByExample(OlderNurseLog olderNurseLog, Integer currentPage, Integer limit){
        return ResultData.build().
                parsePageBean(oldernurselogService.findVOByExapmle(olderNurseLog,currentPage,limit));
    }

}