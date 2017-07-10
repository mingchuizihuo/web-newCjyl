package com.idea.cjyl.totalmodule.web.controller;

import com.idea.cjyl.core.common.ResultData;
import com.idea.cjyl.totalmodule.web.domain.pojo.User;
import com.idea.cjyl.totalmodule.web.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;

/**
 * Created by xiaolitong on 2017/6/17.
 */
@Controller
@RequestMapping
public class LoginController {
    @Autowired
    private UserService userService;

    @ResponseBody
    @RequestMapping("login")
    public ResultData login(String loginName, String loginPassword, HttpSession session) {


        User user = userService.login(loginName,loginPassword);
        if(user==null){
            return ResultData.build().login();
        }
        session.setAttribute("user",user);
        return ResultData.build().parseaDateBean(user);
    }
}
