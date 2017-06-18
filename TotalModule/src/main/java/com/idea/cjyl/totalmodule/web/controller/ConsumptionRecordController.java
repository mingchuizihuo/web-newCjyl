package com.idea.cjyl.totalmodule.web.controller;

import com.idea.cjyl.core.common.ResultData;
import com.idea.cjyl.core.generic.GenericController;
import com.idea.cjyl.totalmodule.web.domain.pojo.ConsumptionRecord;
import com.idea.cjyl.totalmodule.web.service.ConsumptionRecordService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
* Created by 10238 on 2016/10/12.
*/
@Controller
@RequestMapping("serve/consumption_record")
public class ConsumptionRecordController extends GenericController {
    @Autowired
    private ConsumptionRecordService consumptionrecordService;

    /**
        * 添加消费记录
        * @param consumptionrecord
        * @return
    */
    @ResponseBody
    @RequestMapping(value="add" ,method = RequestMethod.POST)
    public ResultData add(ConsumptionRecord consumptionrecord){

        try {
                    consumptionrecordService.insert(consumptionrecord);


            }catch (Exception e){
                return ResultData.build().addErroe();
            }
        return ResultData.build();

    }

    /**
    * 删除消费记录
    * @param id
    * @return
    */
    @ResponseBody
    @RequestMapping(value="del" ,method = RequestMethod.POST)
    public ResultData del(Long id) {
        try {
                    consumptionrecordService.delete(id);
            } catch (Exception e) {
                return ResultData.build().delError();
            }
        return ResultData.build();

    }
    /**
    * 批量删除消费记录
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
                consumptionrecordService.delete(Long.parseLong(id));
            }

            } catch (Exception e) {
                return ResultData.build().delError();
            }
            return ResultData.build();

    }
    /**
    * 修改消费记录
    * @param consumptionrecord
    * @return
    */
    @ResponseBody
    @RequestMapping(value="update",method = RequestMethod.POST)
    public ResultData update(ConsumptionRecord consumptionrecord){
        try {
            consumptionrecordService.update(consumptionrecord);

        } catch (Exception e){
            return ResultData.build().upDateError();
        }
        return ResultData.build();
    }

    /**
    * 分页查询所有消费记录
    * @param currentPage
    * @param limit
    * @return
    */
    @ResponseBody
    @RequestMapping(value="findAll",method = RequestMethod.GET)
    public ResultData findAll(Integer currentPage,Integer limit){
        return ResultData.build().
        parsePageBean(consumptionrecordService.findAll(currentPage,limit));
    }


}