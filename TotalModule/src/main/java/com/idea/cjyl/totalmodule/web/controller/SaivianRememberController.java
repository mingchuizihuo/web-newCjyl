package com.idea.cjyl.totalmodule.web.controller;

import com.idea.cjyl.core.common.ResultData;
import com.idea.cjyl.core.generic.GenericController;
import com.idea.cjyl.totalmodule.web.domain.pojo.SaivianRemember;
import com.idea.cjyl.totalmodule.web.service.SaivianRememberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
* Created by 10238 on 2016/10/12.
*/
@Controller
@RequestMapping("serve/saivian_remember")
public class SaivianRememberController extends GenericController {
    @Autowired
    private SaivianRememberService saivianrememberService;

    /**
        * 添加赛比安人员
        * @param saivianremember
        * @return
    */
    @ResponseBody
    @RequestMapping(value="add" ,method = RequestMethod.POST)
    public ResultData add(SaivianRemember saivianremember){

        try {
                    saivianrememberService.insert(saivianremember);


            }catch (Exception e){
                return ResultData.build().addErroe();
            }
        return ResultData.build();

    }

    /**
    * 删除赛比安人员
    * @param id
    * @return
    */
    @ResponseBody
    @RequestMapping(value="del" ,method = RequestMethod.POST)
    public ResultData del(Long id) {
        try {
                    saivianrememberService.delete(id);
            } catch (Exception e) {
                return ResultData.build().delError();
            }
        return ResultData.build();

    }
    /**
    * 批量删除赛比安人员
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
                saivianrememberService.delete(Long.parseLong(id));
            }

            } catch (Exception e) {
                return ResultData.build().delError();
            }
            return ResultData.build();

    }
    /**
    * 修改赛比安人员
    * @param saivianremember
    * @return
    */
    @ResponseBody
    @RequestMapping(value="update",method = RequestMethod.POST)
    public ResultData update(SaivianRemember saivianremember){
        try {
            saivianrememberService.update(saivianremember);

        } catch (Exception e){
            return ResultData.build().upDateError();
        }
        return ResultData.build();
    }

    /**
    * 分页查询所有赛比安人员
    * @param currentPage
    * @param limit
    * @return
    */
    @ResponseBody
    @RequestMapping(value="findAll",method = RequestMethod.GET)
    public ResultData findAll(Integer currentPage,Integer limit){
        return ResultData.build().
        parsePageBean(saivianrememberService.findAll(currentPage,limit));
    }


    /**
     * 根据用户id 获取旗下会员
     * @param userId
     * @return
     */
    @ResponseBody
    @RequestMapping(value="findAllByUser",method = RequestMethod.GET)
    public ResultData findAllByUser(Long userId){
        List<SaivianRemember> saivianRememberList = saivianrememberService.
                findAllByUser(userId);
        return ResultData.build().parseList(saivianRememberList);
    }
}