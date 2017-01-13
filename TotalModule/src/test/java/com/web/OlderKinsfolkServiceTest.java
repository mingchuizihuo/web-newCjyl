package com.web;

import SupportTest.SupportTest;
import com.idea.cjyl.totalmodule.web.domain.pojo.OlderKinsfolk;
import com.idea.cjyl.totalmodule.web.domain.vo.OlderKinsfolkVO;
import com.idea.cjyl.totalmodule.web.service.OlderKinsfolkService;
import com.idea.cjyl.totalmodule.web.service.OlderService;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractJUnit4SpringContextTests;

import java.lang.annotation.Repeatable;
import java.util.List;

/**
 * Created by xiao on 2016/12/8.
 */
@ContextConfiguration(locations = {"classpath*:/applicationContext-totalmodule.xml"})
public class OlderKinsfolkServiceTest extends AbstractJUnit4SpringContextTests {
    @Autowired
    private OlderKinsfolkService olderKinsfolkService;
    @Autowired
    private OlderService olderService;
    @Test
    public void findByExample() {
        OlderKinsfolk olderKinsfolk = new OlderKinsfolk();
        olderKinsfolk.setOlderId(1l);
        List<OlderKinsfolkVO> olderKinsfolkVOS = olderKinsfolkService.findVOByExapmle(olderKinsfolk, 1, 10);
        for (OlderKinsfolkVO o:olderKinsfolkVOS
             ) {
            System.out.println(o);
        }

    }
}
