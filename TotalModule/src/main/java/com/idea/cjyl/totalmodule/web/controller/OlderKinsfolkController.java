package com.idea.cjyl.totalmodule.web.controller;

import com.idea.cjyl.core.common.ResultData;
import com.idea.cjyl.core.generic.GenericController;
import com.idea.cjyl.totalmodule.web.domain.pojo.OlderKinsfolk;
import com.idea.cjyl.totalmodule.web.domain.pojo.OlderNurseLog;
import com.idea.cjyl.totalmodule.web.service.OlderKinsfolkService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
* Created by 10238 on 2016/10/12.
*/
@Controller
@RequestMapping("serve/older_kinsfolk")
public class OlderKinsfolkController extends GenericController {
    @Autowired
    private OlderKinsfolkService olderkinsfolkService;

    /**
        * 添加老人亲属信息
        * @param olderkinsfolk
        * @return
    */
    @ResponseBody
    @RequestMapping(value="add" ,method = RequestMethod.POST)
    public ResultData add(OlderKinsfolk olderkinsfolk){

        try {
                    olderkinsfolkService.insert(olderkinsfolk);


            }catch (Exception e){
                return ResultData.build().addErroe();
            }
        return ResultData.build();

    }

    /**
    * 删除老人亲属信息
    * @param id
    * @return
    */
    @ResponseBody
    @RequestMapping(value="del" ,method = RequestMethod.POST)
    public ResultData del(Long id) {
        try {
                    olderkinsfolkService.delete(id);
            } catch (Exception e) {
                return ResultData.build().delError();
            }
        return ResultData.build();

    }
    /**
    * 批量删除老人亲属信息
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
                olderkinsfolkService.delete(Long.parseLong(id));
            }

            } catch (Exception e) {
                return ResultData.build().delError();
            }
            return ResultData.build();

    }
    /**
    * 修改老人亲属信息
    * @param olderkinsfolk
    * @return
    */
    @ResponseBody
    @RequestMapping(value="update",method = RequestMethod.POST)
    public ResultData update(OlderKinsfolk olderkinsfolk){
        try {
            olderkinsfolkService.update(olderkinsfolk);

        } catch (Exception e){
            return ResultData.build().upDateError();
        }
        return ResultData.build();
    }

    /**
    * 分页查询所有老人亲属信息
    * @param currentPage
    * @param limit
    * @return
    */
    @ResponseBody
    @RequestMapping(value="findAll",method = RequestMethod.GET)
    public ResultData findAll(Integer currentPage,Integer limit){
        return ResultData.build().
        parsePageBean(olderkinsfolkService.findAll(currentPage,limit));
    }
    /**
     * 通过条件分页查询
     * @param olderKinsfolk
     * @param currentPage
     * @param limit
     * @return
     */
    @ResponseBody
    @RequestMapping(value="findByExample",method = RequestMethod.GET)
    public ResultData findByExample(OlderKinsfolk olderKinsfolk, Integer currentPage, Integer limit){
        return ResultData.build().
                parsePageBean(olderkinsfolkService.findVOByExapmle(olderKinsfolk,currentPage,limit));
    }

}