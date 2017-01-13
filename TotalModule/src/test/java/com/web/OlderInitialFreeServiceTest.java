package com.web;

import SupportTest.SupportTest;
import com.idea.cjyl.totalmodule.web.domain.pojo.OlderInitialFee;
import com.idea.cjyl.totalmodule.web.domain.vo.OlderInitialFeeVO;
import com.idea.cjyl.totalmodule.web.service.OlderInitialFeeService;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * Created by xiao on 2016/12/9.
 */
public class OlderInitialFreeServiceTest extends SupportTest{

    @Autowired
    private OlderInitialFeeService olderInitialFeeService;
    @Test
    public void FindByOlderIdTest(){
        OlderInitialFee olderInitialFee = new OlderInitialFee();
        olderInitialFee.setOlderId(1l);
        List<OlderInitialFeeVO> olderInitialFeeVOS =  olderInitialFeeService.findVOByExapmle(olderInitialFee,1,10);
        for (OlderInitialFeeVO ol:olderInitialFeeVOS
             ) {
            System.out.println(ol);
        }
    }
}
