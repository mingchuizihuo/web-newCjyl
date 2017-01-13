package com.idea.cjyl.totalmodule.web.service;

import com.idea.cjyl.core.generic.GenericServiceLevel;
import com.idea.cjyl.core.generic.GenericService;

import com.idea.cjyl.totalmodule.web.domain.pojo.Login;
import com.idea.cjyl.totalmodule.web.domain.pojo.LoginExample;
public interface LoginService extends GenericService<Login,Long,LoginExample>{
    /**
     * 登陆
     * @param login
     * @return
     */
    public Login login(Login login);
}
