package com.idea.cjyl.totalmodule.web.controller;

import com.idea.cjyl.core.common.ResultData;
import com.idea.cjyl.core.generic.GenericController;
import com.idea.cjyl.totalmodule.web.domain.pojo.OlderKinsfolk;
import com.idea.cjyl.totalmodule.web.domain.pojo.OlderMonthCharge;
import com.idea.cjyl.totalmodule.web.service.OlderMonthChargeService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
* Created by 10238 on 2016/10/12.
*/
@Controller
@RequestMapping("serve/older_month_charge")
public class OlderMonthChargeController extends GenericController {
    @Autowired
    private OlderMonthChargeService oldermonthchargeService;

    /**
        * 添加老人月收费
        * @param oldermonthcharge
        * @return
    */
    @ResponseBody
    @RequestMapping(value="add" ,method = RequestMethod.POST)
    public ResultData add(OlderMonthCharge oldermonthcharge){

        try {
                    oldermonthchargeService.insert(oldermonthcharge);


            }catch (Exception e){
                return ResultData.build().addErroe();
            }
        return ResultData.build();

    }

    /**
    * 删除老人月收费
    * @param id
    * @return
    */
    @ResponseBody
    @RequestMapping(value="del" ,method = RequestMethod.POST)
    public ResultData del(Long id) {
        try {
                    oldermonthchargeService.delete(id);
            } catch (Exception e) {
                return ResultData.build().delError();
            }
        return ResultData.build();

    }
    /**
    * 批量删除老人月收费
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
                oldermonthchargeService.delete(Long.parseLong(id));
            }

            } catch (Exception e) {
                return ResultData.build().delError();
            }
            return ResultData.build();

    }
    /**
    * 修改老人月收费
    * @param oldermonthcharge
    * @return
    */
    @ResponseBody
    @RequestMapping(value="update",method = RequestMethod.POST)
    public ResultData update(OlderMonthCharge oldermonthcharge){
        try {
            oldermonthchargeService.update(oldermonthcharge);

        } catch (Exception e){
            return ResultData.build().upDateError();
        }
        return ResultData.build();
    }

    /**
    * 分页查询所有老人月收费
    * @param currentPage
    * @param limit
    * @return
    */
    @ResponseBody
    @RequestMapping(value="findAll",method = RequestMethod.GET)
    public ResultData findAll(Integer currentPage,Integer limit){
        return ResultData.build().
        parsePageBean(oldermonthchargeService.findAll(currentPage,limit));
    }
    /**
     * 通过条件分页查询
     * @param olderMonthCharge
     * @param currentPage
     * @param limit
     * @return
     */
    @ResponseBody
    @RequestMapping(value="findByExample",method = RequestMethod.GET)
    public ResultData findByExample(OlderMonthCharge olderMonthCharge, Integer currentPage, Integer limit){
        return ResultData.build().
                parsePageBean(oldermonthchargeService.findVOByExapmle(olderMonthCharge,currentPage,limit));
    }

}