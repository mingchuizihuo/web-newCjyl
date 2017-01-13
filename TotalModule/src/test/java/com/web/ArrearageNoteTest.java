package com.web;

import SupportTest.SupportTest;
import com.idea.cjyl.totalmodule.web.domain.vo.ArrearageNoteVO;
import com.idea.cjyl.totalmodule.web.service.ArrearageNoteService;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * Created by xiao on 2016/12/13.
 */
public class ArrearageNoteTest extends SupportTest {
    @Autowired
    private ArrearageNoteService arrearageNoteService;
    @Test
    public void testfindAll(){
      List<ArrearageNoteVO> arrearageNoteVOS = arrearageNoteService.findAllVO(102l,1,10);

      for (ArrearageNoteVO arrearageNoteVO:arrearageNoteVOS){
          System.out.println(arrearageNoteVO);
      }
    }

}
