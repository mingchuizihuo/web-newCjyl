package com.web;

import com.idea.cjyl.totalmodule.web.service.BedService;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractJUnit4SpringContextTests;

/**
 * Created by Administrator on 2016/12/6.
 */
@ContextConfiguration(locations = {"classpath*:/applicationContext-totalmodule.xml"})
public class BedServiceTest extends AbstractJUnit4SpringContextTests {


    @Autowired
    private BedService bedService;
    @Test
    public void findAl(){
        System.out.println(bedService.findAll(1,10));
    }
}
