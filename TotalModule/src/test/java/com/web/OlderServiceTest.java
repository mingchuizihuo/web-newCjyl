package com.web;

import SupportTest.SupportTest;
import com.idea.cjyl.totalmodule.web.domain.pojo.DataDictionary;
import com.idea.cjyl.totalmodule.web.domain.pojo.Older;
import com.idea.cjyl.totalmodule.web.domain.vo.OlderBriefVO;
import com.idea.cjyl.totalmodule.web.domain.vo.OlderIntoInfoVO;
import com.idea.cjyl.totalmodule.web.domain.vo.OlderVO;
import com.idea.cjyl.totalmodule.web.globals.AnalysisConstant;
import com.idea.cjyl.totalmodule.web.service.OlderBriefService;
import com.idea.cjyl.totalmodule.web.service.OlderService;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractJUnit4SpringContextTests;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by xiao on 2016/12/6.
 */
@ContextConfiguration(locations = {"classpath*:/applicationContext-totalmodule.xml"})
public class OlderServiceTest extends AbstractJUnit4SpringContextTests {

    @Resource
    private OlderService olderService;
    @Autowired
    private OlderBriefService olderBriefService;

    @Test
    public void testgetIntoInfo(){
        OlderIntoInfoVO o = olderService.getIntoInfo();
        System.out.println(o);
    }

    @Test
    public void testFindAllVO() {
        List<DataDictionary> dataDictionaries = new ArrayList<>();
        DataDictionary dataDictionary = new DataDictionary();
        dataDictionary.setDataName("ceshi");
        dataDictionary.setDataLevel((byte) 1);
        dataDictionary.setOrganizationLoginId(1L);
        dataDictionary.setTid(0L);
        dataDictionary.setId(1L);
        dataDictionaries.add(dataDictionary);
        AnalysisConstant.dataDictionaryList = dataDictionaries;
        for (OlderVO olderVO : olderService.findAllVO(1, 10)) {
            System.out.println(olderVO);
        }
        System.out.println();
    }

    @Test
    public void testFindExample() {
        Older older = new Older();
        older.setId(1l);
        System.out.println(olderService.selectVOByPrimaryKey(1l));
    }

    @Test
    public void testOlderBriefTest() {
        List<OlderBriefVO> olderBriefVOS = olderBriefService.findAllVO(1, 10);
        for(OlderBriefVO olderBriefVO:olderBriefVOS){
            System.out.println(olderBriefVO);
        }
    }

    @Test
    public void getClassName() {
        OlderVO olderVO = new OlderVO();
        Class clazz = olderVO.getClass();
        System.out.println(clazz.getName());

    }
}
