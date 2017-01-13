package com.idea.cjyl.totalmodule.web.service.impl;


import com.idea.cjyl.core.generic.GenericDao;
import com.idea.cjyl.core.generic.GenericServiceImpl;

import com.idea.cjyl.totalmodule.web.dao.BedMapper;
import com.idea.cjyl.totalmodule.web.domain.pojo.Bed;
import com.idea.cjyl.totalmodule.web.domain.pojo.BedExample;
import com.idea.cjyl.totalmodule.web.service.BedService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
    public class BedServiceImpl extends GenericServiceImpl<Bed, Long,BedExample> implements BedService {

       @Autowired
       private BedMapper bedDao;
       @Override
       public GenericDao<Bed, Long,BedExample> getDao() {
       return bedDao;
       }


}
