package com.idea.cjyl.totalmodule.web.service.impl;


import com.idea.cjyl.core.generic.GenericDao;
import com.idea.cjyl.core.generic.GenericServiceImpl;

import com.idea.cjyl.totalmodule.web.dao.StaffLeaveLogMapper;
import com.idea.cjyl.totalmodule.web.domain.pojo.StaffLeaveLog;
import com.idea.cjyl.totalmodule.web.domain.pojo.StaffLeaveLogExample;
import com.idea.cjyl.totalmodule.web.service.StaffLeaveLogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
    public class StaffLeaveLogServiceImpl extends GenericServiceImpl<StaffLeaveLog, Long,StaffLeaveLogExample> implements StaffLeaveLogService {

       @Autowired
       private StaffLeaveLogMapper staffleavelogDao;
       @Override
       public GenericDao<StaffLeaveLog, Long,StaffLeaveLogExample> getDao() {
       return staffleavelogDao;
       }


}
