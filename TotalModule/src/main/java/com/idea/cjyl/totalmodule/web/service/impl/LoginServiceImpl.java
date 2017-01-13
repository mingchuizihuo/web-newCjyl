package com.idea.cjyl.totalmodule.web.service.impl;


import com.idea.cjyl.core.generic.GenericDao;
import com.idea.cjyl.core.generic.GenericServiceImpl;

import com.idea.cjyl.totalmodule.web.dao.LoginMapper;
import com.idea.cjyl.totalmodule.web.domain.pojo.Login;
import com.idea.cjyl.totalmodule.web.domain.pojo.LoginExample;
import com.idea.cjyl.totalmodule.web.globals.AnalysisConstant;
import com.idea.cjyl.totalmodule.web.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class LoginServiceImpl extends GenericServiceImpl<Login, Long, LoginExample> implements LoginService {

    @Autowired
    private LoginMapper loginDao;

    @Override
    public GenericDao<Login, Long, LoginExample> getDao() {
        return loginDao;
    }


    @Override
    public Login login(Login login) {

        LoginExample loginExample = new LoginExample();
        loginExample.createCriteria().
                andOrganizationLoginIdEqualTo(login.getOrganizationLoginId()).
                andLoginNameEqualTo(login.getLoginName())
                .andLoginPasswordEqualTo(login.getLoginPassword());

        List<Login> logins = getDao().selectByExample(loginExample);
        if (logins.size() == 0) {
            new Login();
        } else {
            login = logins.get(0);
            AnalysisConstant.login = login;
        }
        return login;
    }
}
