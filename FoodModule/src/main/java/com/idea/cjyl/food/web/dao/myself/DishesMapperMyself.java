package com.idea.cjyl.food.web.dao.myself;

import com.idea.cjyl.common.web.domain.pojo.CommentPicture;
import com.idea.cjyl.core.generic.GenericDao;
import com.idea.cjyl.food.web.domain.vo.DishesVO;


import java.util.List;

public interface DishesMapperMyself extends GenericDao {
    /**
     * 查询所有菜品带图片
     * @return
     */
    public List<DishesVO> findAllVO();

    /**
     * 查询本菜品所有图片
     * @param dishesId
     * @return
     */
    public List<CommentPicture> selectAllPicture(Long dishesId);
}