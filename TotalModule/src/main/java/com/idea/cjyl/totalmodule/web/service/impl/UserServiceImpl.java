package com.idea.cjyl.totalmodule.web.service.impl;


import com.idea.cjyl.core.generic.GenericDao;
import com.idea.cjyl.core.generic.GenericServiceImpl;

import com.idea.cjyl.totalmodule.web.dao.UserMapper;
import com.idea.cjyl.totalmodule.web.domain.pojo.User;
import com.idea.cjyl.totalmodule.web.domain.pojo.UserExample;
import com.idea.cjyl.totalmodule.web.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
    public class UserServiceImpl extends GenericServiceImpl<User, Long,UserExample> implements UserService {

       @Autowired
       private UserMapper userDao;
       @Override
       public GenericDao<User, Long,UserExample> getDao() {
       return userDao;
       }


}
