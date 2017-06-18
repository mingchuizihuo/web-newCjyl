package com.idea.cjyl.totalmodule.web.controller;

import com.idea.cjyl.core.common.ResultData;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by xiaolitong on 2017/6/17.
 */
@Controller
@RequestMapping
public class LoginController {

    @ResponseBody
    @RequestMapping("login")
    public ResultData login(){
        return ResultData.build();
    }
}
