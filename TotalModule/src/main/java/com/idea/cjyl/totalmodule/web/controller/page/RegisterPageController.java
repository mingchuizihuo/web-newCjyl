package com.idea.cjyl.totalmodule.web.controller.page;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by horo on 2016/10/11.
 */
@Controller
@RequestMapping
public class RegisterPageController {
    @RequestMapping(value="/{url}/{url2}")
    public String register(@PathVariable String url ,@PathVariable String url2){

        return url+"/"+url2;
    }
    @RequestMapping(value="/{url}/{url2}/{url3}" ,method = RequestMethod.GET)
    public String register(@PathVariable String url ,@PathVariable String url2,@PathVariable String url3){

        return url+"/"+url2+"/"+url3;
    }


}
