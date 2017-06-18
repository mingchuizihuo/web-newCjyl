package com.idea.cjyl.totalmodule.web.controller;

import com.idea.cjyl.core.common.ResultData;
import com.idea.cjyl.core.generic.GenericController;
import com.idea.cjyl.totalmodule.web.domain.pojo.User;
import com.idea.cjyl.totalmodule.web.service.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
* Created by 10238 on 2016/10/12.
*/
@Controller
@RequestMapping("serve/user")
public class UserController extends GenericController {
    @Autowired
    private UserService userService;

    /**
        * 添加用户
        * @param user
        * @return
    */
    @ResponseBody
    @RequestMapping(value="add" ,method = RequestMethod.POST)
    public ResultData add(User user){

        try {
                    userService.insert(user);


            }catch (Exception e){
                return ResultData.build().addErroe();
            }
        return ResultData.build();

    }

    /**
    * 删除用户
    * @param id
    * @return
    */
    @ResponseBody
    @RequestMapping(value="del" ,method = RequestMethod.POST)
    public ResultData del(Long id) {
        try {
                    userService.delete(id);
            } catch (Exception e) {
                return ResultData.build().delError();
            }
        return ResultData.build();

    }
    /**
    * 批量删除用户
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
                userService.delete(Long.parseLong(id));
            }

            } catch (Exception e) {
                return ResultData.build().delError();
            }
            return ResultData.build();

    }
    /**
    * 修改用户
    * @param user
    * @return
    */
    @ResponseBody
    @RequestMapping(value="update",method = RequestMethod.POST)
    public ResultData update(User user){
        try {
            userService.update(user);

        } catch (Exception e){
            return ResultData.build().upDateError();
        }
        return ResultData.build();
    }

    /**
    * 分页查询所有用户
    * @param currentPage
    * @param limit
    * @return
    */
    @ResponseBody
    @RequestMapping(value="findAll",method = RequestMethod.GET)
    public ResultData findAll(Integer currentPage,Integer limit){
        return ResultData.build().
        parsePageBean(userService.findAll(currentPage,limit));
    }


}