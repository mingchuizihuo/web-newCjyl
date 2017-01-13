package com.idea.cjyl.food.web.service.impl;


import com.idea.cjyl.core.generic.GenericDao;
import com.idea.cjyl.core.generic.GenericServiceImpl;
import com.idea.cjyl.food.web.dao.DishesMeterialMapper;
import com.idea.cjyl.food.web.domain.pojo.DishesMeterial;
import com.idea.cjyl.food.web.domain.pojo.DishesMeterialExample;
import com.idea.cjyl.food.web.service.DishesMeterialService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
    public class DishesMeterialServiceImpl extends GenericServiceImpl<DishesMeterial, Long,DishesMeterialExample> implements DishesMeterialService {

       @Autowired
       private DishesMeterialMapper dishesmeterialDao;
       @Override
       public GenericDao<DishesMeterial, Long,DishesMeterialExample> getDao() {
       return dishesmeterialDao;
       }


}
