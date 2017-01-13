package com.idea.cjyl.totalmodule.web.service.impl;


import com.idea.cjyl.core.generic.GenericDao;
import com.idea.cjyl.core.generic.GenericServiceImpl;

import com.idea.cjyl.totalmodule.web.dao.CheckInInitCostMapper;
import com.idea.cjyl.totalmodule.web.domain.pojo.CheckInInitCost;
import com.idea.cjyl.totalmodule.web.domain.pojo.CheckInInitCostExample;
import com.idea.cjyl.totalmodule.web.service.CheckInInitCostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
    public class CheckInInitCostServiceImpl extends GenericServiceImpl<CheckInInitCost, Long,CheckInInitCostExample> implements CheckInInitCostService {

       @Autowired
       private CheckInInitCostMapper checkininitcostDao;
       @Override
       public GenericDao<CheckInInitCost, Long,CheckInInitCostExample> getDao() {
       return checkininitcostDao;
       }


}
