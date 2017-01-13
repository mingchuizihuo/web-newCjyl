package com.idea.cjyl.totalmodule.web.service.impl;


import com.idea.cjyl.core.generic.GenericDao;
import com.idea.cjyl.core.generic.GenericServiceImpl;

import com.idea.cjyl.totalmodule.web.dao.FloorTierMapper;
import com.idea.cjyl.totalmodule.web.domain.pojo.FloorTier;
import com.idea.cjyl.totalmodule.web.domain.pojo.FloorTierExample;
import com.idea.cjyl.totalmodule.web.service.FloorTierService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
    public class FloorTierServiceImpl extends GenericServiceImpl<FloorTier, Long,FloorTierExample> implements FloorTierService {

       @Autowired
       private FloorTierMapper floortierDao;
       @Override
       public GenericDao<FloorTier, Long,FloorTierExample> getDao() {
       return floortierDao;
       }


}
