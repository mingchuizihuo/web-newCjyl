package com.idea.cjyl.totalmodule.web.controller.page;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by 10238 on 2016/10/10.
 */
@Controller
@RequestMapping("/page")
public class LoginPageController {
    @RequestMapping("/login")
    public String login(){
        return "/mall/login/login";

    }

}
