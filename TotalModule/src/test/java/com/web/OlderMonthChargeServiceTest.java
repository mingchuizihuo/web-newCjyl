package com.web;

import SupportTest.SupportTest;
import com.idea.cjyl.totalmodule.web.domain.pojo.OlderMonthCharge;
import com.idea.cjyl.totalmodule.web.domain.vo.OlderMonthChargeVO;
import com.idea.cjyl.totalmodule.web.service.OlderMonthChargeService;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * Created by xiao on 2016/12/10.
 */
public class OlderMonthChargeServiceTest extends SupportTest {
    @Autowired
    private OlderMonthChargeService olderMonthChargeService;

    @Test
    public void testFindAllVO(){
        OlderMonthCharge olderMonthCharge = new OlderMonthCharge();
        olderMonthCharge.setOlderId(2l);
        olderMonthCharge.setOlderMonthChargeState(102l);
        List<OlderMonthChargeVO> olderMonthChargeVOS = olderMonthChargeService.findVOByExapmle(olderMonthCharge,1,10);
        for(OlderMonthChargeVO olderMonthChargeVO:olderMonthChargeVOS){
            System.out.println(olderMonthChargeVO);
        }
    }
}
