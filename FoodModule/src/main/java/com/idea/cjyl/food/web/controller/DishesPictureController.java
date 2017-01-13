package com.idea.cjyl.food.web.controller;


import com.idea.cjyl.common.web.service.CommentPictureService;
import com.idea.cjyl.core.common.ResultData;
import com.idea.cjyl.core.common.SessionConstant;
import com.idea.cjyl.core.generic.GenericController;
import com.idea.cjyl.food.web.domain.pojo.DishesPicture;
import com.idea.cjyl.food.web.service.DishesPictureService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by 10238 on 2016/10/12.
 */
@Controller
@RequestMapping("serve/dishes_picture")
public class DishesPictureController extends GenericController {
    @Autowired
    private DishesPictureService dishespictureService;
    @Autowired
    private CommentPictureService commentPictureService;
    @Autowired
    private DishesPictureService dishesPictureService;

    /**
     * 添加菜品图片关系
     *
     * @param dishespicture
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "adds", method = RequestMethod.POST)
    public ResultData add(DishesPicture dishespicture, String pictureAddress) {

        try {
            //添加图片
            Long[] pictureIds = commentPictureService.insertPictures(pictureAddress, SessionConstant.PictureType.DISHESPICTURE.key);
            dishesPictureService.inserts(dishespicture.getDishesId(), pictureIds);
            dishespictureService.insert(dishespicture);

        } catch (Exception e) {
            return ResultData.build().addErroe();
        }
        return ResultData.build();

    }

    /**
     * 删除菜品图片关系
     *
     * @param id
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "del", method = RequestMethod.POST)
    public ResultData del(Long id) {
        try {
            dishespictureService.delete(id);
        } catch (Exception e) {
            return ResultData.build().delError();
        }
        return ResultData.build();

    }

    /**
     * 修改菜品图片关系
     *
     * @param dishespicture
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "update", method = RequestMethod.POST)
    public ResultData update(DishesPicture dishespicture, String pictureAddress) {
        try {

            Long[] pictureIds = commentPictureService.insertPictures(pictureAddress, SessionConstant.PictureType.DISHESPICTURE.key);
            for (Long pictureId : pictureIds
                    ) {
                dishespicture.setPictureId(pictureId);
                dishespictureService.update(dishespicture);
            }


        } catch (Exception e) {
            return ResultData.build().upDateError();
        }
        return ResultData.build();
    }

    /**
     * 分页查询所有菜品图片关系
     *
     * @param currentPage
     * @param limit
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "findAll", method = RequestMethod.GET)
    public ResultData findAll(Integer currentPage, Integer limit) {
        return ResultData.build().
                parsePageBean(dishespictureService.findAll(currentPage, limit));
    }

}