package com.idea.cjyl.totalmodule.web.service.impl;


import com.idea.cjyl.core.generic.GenericDao;
import com.idea.cjyl.core.generic.GenericServiceImpl;

import com.idea.cjyl.totalmodule.web.dao.ServiceChargeMapper;
import com.idea.cjyl.totalmodule.web.domain.pojo.ServiceCharge;
import com.idea.cjyl.totalmodule.web.domain.pojo.ServiceChargeExample;
import com.idea.cjyl.totalmodule.web.service.ServiceChargeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
    public class ServiceChargeServiceImpl extends GenericServiceImpl<ServiceCharge, Long,ServiceChargeExample> implements ServiceChargeService {

       @Autowired
       private ServiceChargeMapper servicechargeDao;
       @Override
       public GenericDao<ServiceCharge, Long,ServiceChargeExample> getDao() {
       return servicechargeDao;
       }


}
