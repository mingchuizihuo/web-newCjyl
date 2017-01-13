package com.idea.cjyl.common.web.controller;

import com.idea.cjyl.core.common.ResultData;
import com.idea.cjyl.core.generic.GenericController;
import com.idea.cjyl.common.web.domain.pojo.CommentRichText;
import com.idea.cjyl.common.web.service.CommentRichTextService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
* Created by 10238 on 2016/10/12.
*/
@Controller
@RequestMapping("serve/comment_rich_text")
public class CommentRichTextController extends GenericController {
    @Autowired
    private CommentRichTextService commentrichtextService;

    /**
        * 添加富文本
        * @param commentrichtext
        * @return
    */
    @ResponseBody
    @RequestMapping(value="add" ,method = RequestMethod.POST)
    public ResultData add(CommentRichText commentrichtext){

        try {
            commentrichtext =   commentrichtextService.insert(commentrichtext);

            }catch (Exception e){
                return ResultData.build().addErroe();
            }
        return ResultData.build().put("id",commentrichtext.getId());

    }

    /**
    * 删除富文本
    * @param id
    * @return
    */
    @ResponseBody
    @RequestMapping(value="del" ,method = RequestMethod.POST)
    public ResultData del(Long id) {
        try {
                commentrichtextService.delete(id);
            } catch (Exception e) {
                return ResultData.build().delError();
            }
        return ResultData.build();

    }

    /**
    * 修改富文本
    * @param commentrichtext
    * @return
    */
    @ResponseBody
    @RequestMapping(value="update",method = RequestMethod.POST)
    public ResultData update(CommentRichText commentrichtext){
        try {
            commentrichtextService.update(commentrichtext);

        } catch (Exception e){
            return ResultData.build().upDateError();
        }
        return ResultData.build();
    }

    /**
    * 分页查询所有富文本
    * @param currentPage
    * @param limit
    * @return
    */
    @ResponseBody
    @RequestMapping(value="findAll",method = RequestMethod.GET)
    public ResultData findAll(Integer currentPage,Integer limit){
        return ResultData.build().
        parsePageBean(commentrichtextService.findAll(currentPage,limit));
    }

}