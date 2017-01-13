package com.idea.cjyl.totalmodule.web.service.impl;


import com.idea.cjyl.core.generic.GenericDao;
import com.idea.cjyl.core.generic.GenericServiceImpl;

import com.idea.cjyl.totalmodule.web.dao.StaffMapper;
import com.idea.cjyl.totalmodule.web.domain.pojo.Staff;
import com.idea.cjyl.totalmodule.web.domain.pojo.StaffExample;
import com.idea.cjyl.totalmodule.web.service.StaffService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
    public class StaffServiceImpl extends GenericServiceImpl<Staff, Long,StaffExample> implements StaffService {

       @Autowired
       private StaffMapper staffDao;
       @Override
       public GenericDao<Staff, Long,StaffExample> getDao() {
       return staffDao;
       }


}
