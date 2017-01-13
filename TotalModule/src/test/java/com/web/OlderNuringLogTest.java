package com.web;

import SupportTest.SupportTest;
import com.idea.cjyl.totalmodule.web.domain.pojo.OlderNurseLog;
import com.idea.cjyl.totalmodule.web.domain.vo.OlderNurseLogVO;
import com.idea.cjyl.totalmodule.web.service.OlderNurseLogService;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * Created by xiao on 2016/12/9.
 */
public class OlderNuringLogTest extends SupportTest{
    @Autowired
    private OlderNurseLogService olderNurseLogService;
    @Test
    public void findExampleTest(){
        OlderNurseLog olderNurseLog = new OlderNurseLog();
        olderNurseLog.setOlderId(1l);
        List<OlderNurseLogVO> olderNurseLogVOS =  olderNurseLogService.findVOByExapmle(olderNurseLog,1,10);
        for(OlderNurseLogVO olderNurseLogVO:olderNurseLogVOS){
            System.out.println(olderNurseLogVO);
        }
    }
}
