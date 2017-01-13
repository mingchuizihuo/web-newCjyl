package com.idea.cjyl.totalmodule.web.controller;

import com.idea.cjyl.core.generic.GenericController;
import com.idea.cjyl.totalmodule.web.domain.vo.ArrearageNoteVO;
import com.idea.cjyl.totalmodule.web.service.ArrearageNoteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

/**
 * Created by xiao on 2016/12/13.
 */
@Controller
@RequestMapping("/statement/page/")
public class StatementController  extends GenericController {

    @Autowired
    private ArrearageNoteService arrearageNoteService;

    @RequestMapping(value = "arrearageNote" ,method = RequestMethod.GET)
    public ModelAndView  arrearageNote(Integer currentPage, Integer limit){

        List<ArrearageNoteVO> arrearageNoteVOS = arrearageNoteService.findAllVO(102l,currentPage,limit);

        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("arrearageNote",arrearageNoteVOS);

        modelAndView.setViewName("report/arrearageNote");

        return modelAndView;
    }
}
