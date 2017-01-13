package com.web;

import SupportTest.SupportTest;
import com.idea.cjyl.totalmodule.web.domain.pojo.Login;
import com.idea.cjyl.totalmodule.web.domain.pojo.OrganizationLogin;
import com.idea.cjyl.totalmodule.web.globals.AnalysisConstant;
import com.idea.cjyl.totalmodule.web.service.LoginService;
import com.idea.cjyl.totalmodule.web.service.OrganizationLoginService;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by xiao on 2016/12/11.
 */
public class LoginTest extends SupportTest {
    @Autowired
    private LoginService loginService;
    @Autowired
    private OrganizationLoginService organizationLoginService;

    @Test
    public void testLogin(){
        System.out.println(organizationLoginService.likeGetOrganizationName("爱"));

    }
}
