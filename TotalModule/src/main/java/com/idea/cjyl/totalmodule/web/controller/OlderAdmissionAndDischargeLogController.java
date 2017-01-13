package com.idea.cjyl.totalmodule.web.controller;

import com.idea.cjyl.core.common.ResultData;
import com.idea.cjyl.core.generic.GenericController;
import com.idea.cjyl.totalmodule.web.domain.pojo.OlderAdmissionAndDischargeLog;
import com.idea.cjyl.totalmodule.web.service.OlderAdmissionAndDischargeLogService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
* Created by 10238 on 2016/10/12.
*/
@Controller
@RequestMapping("serve/older_admission_and_discharge_log")
public class OlderAdmissionAndDischargeLogController extends GenericController {
    @Autowired
    private OlderAdmissionAndDischargeLogService olderadmissionanddischargelogService;

    /**
        * 添加老人出入院日志表
        * @param olderadmissionanddischargelog
        * @return
    */
    @ResponseBody
    @RequestMapping(value="add" ,method = RequestMethod.POST)
    public ResultData add(OlderAdmissionAndDischargeLog olderadmissionanddischargelog){

        try {
                    olderadmissionanddischargelogService.insert(olderadmissionanddischargelog);


            }catch (Exception e){
                return ResultData.build().addErroe();
            }
        return ResultData.build();

    }

    /**
    * 删除老人出入院日志表
    * @param id
    * @return
    */
    @ResponseBody
    @RequestMapping(value="del" ,method = RequestMethod.POST)
    public ResultData del(Long id) {
        try {
                    olderadmissionanddischargelogService.delete(id);
            } catch (Exception e) {
                return ResultData.build().delError();
            }
        return ResultData.build();

    }
    /**
    * 批量删除老人出入院日志表
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
                olderadmissionanddischargelogService.delete(Long.parseLong(id));
            }

            } catch (Exception e) {
                return ResultData.build().delError();
            }
            return ResultData.build();

    }
    /**
    * 修改老人出入院日志表
    * @param olderadmissionanddischargelog
    * @return
    */
    @ResponseBody
    @RequestMapping(value="update",method = RequestMethod.POST)
    public ResultData update(OlderAdmissionAndDischargeLog olderadmissionanddischargelog){
        try {
            olderadmissionanddischargelogService.update(olderadmissionanddischargelog);

        } catch (Exception e){
            return ResultData.build().upDateError();
        }
        return ResultData.build();
    }

    /**
    * 分页查询所有老人出入院日志表
    * @param currentPage
    * @param limit
    * @return
    */
    @ResponseBody
    @RequestMapping(value="findAll",method = RequestMethod.GET)
    public ResultData findAll(Integer currentPage,Integer limit){
        return ResultData.build().
        parsePageBean(olderadmissionanddischargelogService.findAll(currentPage,limit));
    }


}