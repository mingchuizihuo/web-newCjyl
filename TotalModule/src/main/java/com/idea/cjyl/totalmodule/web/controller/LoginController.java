package com.idea.cjyl.totalmodule.web.controller;

import com.github.pagehelper.Page;
import com.idea.cjyl.core.common.ResultData;
import com.idea.cjyl.totalmodule.web.domain.pojo.Login;
import com.idea.cjyl.totalmodule.web.domain.pojo.OrganizationLogin;
import com.idea.cjyl.totalmodule.web.globals.AnalysisConstant;
import com.idea.cjyl.totalmodule.web.service.LoginService;
import com.idea.cjyl.totalmodule.web.service.OrganizationLoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import sun.misc.Contended;
import sun.rmi.log.LogInputStream;

import javax.servlet.http.HttpSession;
import java.util.List;

/**
 * Created by xiao on 2016/12/11.
 */
@Controller
@RequestMapping("serve/login/")
public class LoginController {

    @Autowired
    private LoginService loginService;

    @Autowired
    private OrganizationLoginService organizationLoginService;

    /**
     * 添加子账号
     *
     * @param login
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "add", method = RequestMethod.POST)
    public ResultData add(Login login) {
        try {
            loginService.insert(login);


        } catch (Exception e) {

            return ResultData.build().addErroe();
        }
        return ResultData.build();

    }


    /**
     * 批量删除
     * @param dels 多个删除id（1，2）
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "dels", method = RequestMethod.POST)
    public ResultData dels(String dels){
        try{
                loginService.dels(dels);

        }catch(Exception e){
            return ResultData.build().delError();
        }
        return ResultData.build();
    }

    /**
     * 查询子账号
     *
     * @param currentPage
     * @param limit
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "findAll", method = RequestMethod.GET)
    public ResultData findAll(Integer currentPage, Integer limit) {

        Page<Login> logins = loginService.findAll(currentPage, limit);

        return ResultData.build().
                parsePageBean(logins);
    }

    /**
     * 登陆
     *
     * @param login
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "login", method = RequestMethod.GET)
    public ResultData login(Login login, HttpSession session) {
        Login login1 = (Login) session.getAttribute("loginInfo");
        if(login1==null){
            AnalysisConstant.selectState = 1;
            if (loginService.login(login).getId() == null) {
                AnalysisConstant.selectState = 3;
                return ResultData.build().put("result", false);
            } else {

                login = loginService.login(login);
                AnalysisConstant.login = login;
                AnalysisConstant.selectState = 3;
                session.setAttribute("loginInfo", login);
                return ResultData.build().parseBean(login);

            }

        }else{
            return ResultData.build().parseBean(login1);
        }




    }

    /**
     * 登出
     *
     * @param session
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "loginOut", method = RequestMethod.GET)
    public ResultData loginOut(HttpSession session) {
        session.removeAttribute("loginInfo");
        AnalysisConstant.login = null;
        AnalysisConstant.selectState = 3;
        return ResultData.build().put("result", true);
    }

    /**
     * 模糊查询机构名
     *
     * @param organizationName
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "likeGetOrganizationName", method = RequestMethod.GET)
    public ResultData likeGetOrganizationName(String organizationName) {

        AnalysisConstant.selectState = 2;
        List<OrganizationLogin> organizationLogins = organizationLoginService.likeGetOrganizationName(organizationName);

        AnalysisConstant.selectState = 3;
        return ResultData.build().parseList(organizationLogins);
    }

    /**
     * 查询所有
     */
    @ResponseBody
    @RequestMapping(value = "findAllOrganizationName", method = RequestMethod.GET)
    public ResultData findAllOrganizationName() {
        AnalysisConstant.selectState = 2;
        Page<OrganizationLogin> organizationLogins = organizationLoginService.findAll(1, 1000000);
        AnalysisConstant.selectState = 3;
        return ResultData.build().parsePageBean(organizationLogins);
    }
}
