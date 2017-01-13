package com.idea.cjyl.food.web.service.impl;


import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.idea.cjyl.common.web.dao.CommentPictureMapper;
import com.idea.cjyl.common.web.domain.pojo.CommentPicture;
import com.idea.cjyl.common.web.domain.pojo.CommentPictureExample;
import com.idea.cjyl.core.generic.GenericDao;
import com.idea.cjyl.core.generic.GenericServiceImpl;
import com.idea.cjyl.food.web.domain.pojo.Dishes;

import com.idea.cjyl.food.web.dao.DishesMapper;
import com.idea.cjyl.food.web.dao.DishesPictureMapper;
import com.idea.cjyl.food.web.dao.myself.DishesMapperMyself;
import com.idea.cjyl.food.web.domain.pojo.DishesExample;
import com.idea.cjyl.food.web.domain.pojo.DishesPicture;
import com.idea.cjyl.food.web.domain.pojo.DishesPictureExample;
import com.idea.cjyl.food.web.domain.vo.DishesVO;
import com.idea.cjyl.food.web.service.DishesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

import java.util.List;


@Service
public class DishesServiceImpl extends GenericServiceImpl<Dishes, Long,DishesExample> implements DishesService {
    @Autowired
    private DishesMapper dishesDao;
    @Autowired
    private DishesMapperMyself dishesMapperMyself;
    @Autowired
    private DishesPictureMapper dishesPictureMapper;
    @Autowired
    private CommentPictureMapper commentPictureMapper;
    @Override
    public GenericDao<Dishes, Long,DishesExample> getDao() {
        return dishesDao;
    }





    @Override
    public Page<DishesVO> findAllVO(Integer currentPage, Integer limit) {

        if(currentPage==null){
            currentPage=1;
        }
        if(limit==null){
            limit=10;
        }
        PageHelper.startPage(currentPage,limit);
        Page<DishesVO> dishesVOs = (Page<DishesVO>) dishesMapperMyself.findAllVO();
        System.out.println(dishesVOs.getResult().get(0).getMainPicture().getPictureAddress()+"===========");
        return dishesVOs;

    }

    @Override
    public List<CommentPicture> showAllPicture(Long dishesId) {

        DishesPictureExample servicesPictureExample =  new DishesPictureExample();
        servicesPictureExample.createCriteria().andDishesIdEqualTo(dishesId);
        List<DishesPicture> dishesPictures =dishesPictureMapper.selectByExample(servicesPictureExample);

        if(dishesPictures.size()==0){
            return new ArrayList<CommentPicture>();
        }
        /**
         * 分解出图片id
         */
        List<Long> pictureIdList = new ArrayList<>();
        for (DishesPicture dishesPicture:dishesPictures
                ) {
            pictureIdList.add(dishesPicture.getPictureId());
        }

        /**
         * 根据图片id 查询图片
         */
        CommentPictureExample commentPictureExample = new CommentPictureExample();
        commentPictureExample.createCriteria().andIdIn(pictureIdList);

        return  commentPictureMapper.selectByExample(commentPictureExample);
    }


}
