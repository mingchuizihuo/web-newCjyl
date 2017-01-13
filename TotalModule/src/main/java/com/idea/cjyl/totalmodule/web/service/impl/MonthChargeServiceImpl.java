package com.idea.cjyl.totalmodule.web.service.impl;


import com.idea.cjyl.core.generic.GenericDao;
import com.idea.cjyl.core.generic.GenericServiceImpl;

import com.idea.cjyl.totalmodule.web.dao.MonthChargeMapper;
import com.idea.cjyl.totalmodule.web.domain.pojo.MonthCharge;
import com.idea.cjyl.totalmodule.web.domain.pojo.MonthChargeExample;
import com.idea.cjyl.totalmodule.web.service.MonthChargeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
    public class MonthChargeServiceImpl extends GenericServiceImpl<MonthCharge, Long,MonthChargeExample> implements MonthChargeService {

       @Autowired
       private MonthChargeMapper monthchargeDao;
       @Override
       public GenericDao<MonthCharge, Long,MonthChargeExample> getDao() {
       return monthchargeDao;
       }


}
