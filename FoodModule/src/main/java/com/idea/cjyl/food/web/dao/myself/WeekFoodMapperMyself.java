package com.idea.cjyl.food.web.dao.myself;


import com.idea.cjyl.core.generic.GenericDao;
import com.idea.cjyl.food.web.domain.vo.SelectVOWeekFood;
import com.idea.cjyl.food.web.domain.vo.WeekFoodVO;

import java.util.List;

public interface WeekFoodMapperMyself extends GenericDao {

    /**
     * 获取本周食谱
     * @param selectVOWeekFood
     * @return
     */
    public List<WeekFoodVO> findWeekFood(SelectVOWeekFood selectVOWeekFood);
}