package com.idea.cjyl.food.web.service;


import com.idea.cjyl.core.generic.GenericService;
import com.idea.cjyl.food.web.domain.pojo.DishesPicture;
import com.idea.cjyl.food.web.domain.pojo.DishesPictureExample;

public interface DishesPictureService extends GenericService<DishesPicture,Long,DishesPictureExample> {

    /**
     * 批量添加菜品图片
     * @param dishesId
     * @param pictureIds
     * @return
     */
    public boolean inserts(Long dishesId, Long[] pictureIds);
}
