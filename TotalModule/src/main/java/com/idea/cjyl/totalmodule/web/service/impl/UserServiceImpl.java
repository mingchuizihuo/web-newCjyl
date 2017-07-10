package com.idea.cjyl.totalmodule.web.service.impl;


import com.idea.cjyl.core.generic.GenericDao;
import com.idea.cjyl.core.generic.GenericServiceImpl;

import com.idea.cjyl.totalmodule.web.dao.UserMapper;
import com.idea.cjyl.totalmodule.web.domain.pojo.User;
import com.idea.cjyl.totalmodule.web.domain.pojo.UserExample;
import com.idea.cjyl.totalmodule.web.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class UserServiceImpl extends GenericServiceImpl<User, Long, UserExample> implements UserService {

    @Autowired
    private UserMapper userDao;

    @Override
    public GenericDao<User, Long, UserExample> getDao() {
        return userDao;
    }


    @Override
    public User login(String loginName, String loginPassword) {
        UserExample example = new UserExample();
        example.createCriteria().andUserNameEqualTo(loginName).andUserPasswdEqualTo(loginPassword);
        List<User> users = userDao.selectByExample(example);
        if (users.size() == 0) {
            return null;
        }
        return users.get(0);
    }
}
