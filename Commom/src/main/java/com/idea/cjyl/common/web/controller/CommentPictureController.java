package com.idea.cjyl.common.web.controller;

import com.idea.cjyl.common.web.domain.pojo.CommentPicture;
import com.idea.cjyl.common.web.service.CommentPictureService;
import com.idea.cjyl.core.common.ResultData;
import com.idea.cjyl.core.generic.GenericController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
* Created by 10238 on 2016/10/12.
*/
@Controller
@RequestMapping("serve/comment_picture")
public class CommentPictureController extends GenericController {
    @Autowired
    private CommentPictureService commentpictureService;

    /**
        * 添加图片
        *
        * @param commentpicture
        * @return
    */
    @ResponseBody
    @RequestMapping(value="add" ,method = RequestMethod.POST)
    public ResultData add(CommentPicture commentpicture){

        try {
                commentpictureService.insert(commentpicture);

            }catch (Exception e){
                return ResultData.build().addErroe();
            }
        return ResultData.build();

    }

    /**
     * 通过id获取图片地址
     * @param pictureId
     * @return
     */
    @ResponseBody
    @RequestMapping(value="getById" ,method = RequestMethod.GET)
    public String getById(Long pictureId){

       return commentpictureService.selectById(pictureId).getPictureAddress();
    }
    /**
    * 删除图片
    * @param id
    * @return
    */
    @ResponseBody
    @RequestMapping(value="del" ,method = RequestMethod.POST)
    public ResultData del(Long id) {
        try {
                commentpictureService.delete(id);
            } catch (Exception e) {
                return ResultData.build().delError();
            }
        return ResultData.build();

    }

    /**
    * 修改图片
    * @param commentpicture
    * @return
    */
    @ResponseBody
    @RequestMapping(value="update",method = RequestMethod.POST)
    public ResultData update(CommentPicture commentpicture){
        try {
            commentpictureService.update(commentpicture);

        } catch (Exception e){
            return ResultData.build().upDateError();
        }
        return ResultData.build();
    }

    /**
    * 分页查询所有图片
    * @param currentPage
    * @param limit
    * @return
    */
    @ResponseBody
    @RequestMapping(value="findAll",method = RequestMethod.GET)
    public ResultData findAll(Integer currentPage,Integer limit){
        return ResultData.build().
        parsePageBean(commentpictureService.findAll(currentPage,limit));
    }

}