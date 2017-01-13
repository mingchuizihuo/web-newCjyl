package com.idea.cjyl.food.web.service;

import com.idea.cjyl.core.generic.GenericService;
import com.idea.cjyl.food.web.domain.vo.WeekFoodShowVO;

import com.idea.cjyl.food.web.domain.pojo.WeekFood;
import com.idea.cjyl.food.web.domain.pojo.WeekFoodExample;
import com.idea.cjyl.food.web.domain.vo.SelectVOWeekFood;


public interface WeekFoodService extends GenericService<WeekFood,Long,WeekFoodExample> {
    /**
     * 添加一星期食谱
     * @param selectVOWeekFood
     */
    public void insert(SelectVOWeekFood selectVOWeekFood);

    /**
     * 获取本周食谱
     * @param selectVOWeekFood
     * @return
     */
    public WeekFoodShowVO findWeekVO(SelectVOWeekFood selectVOWeekFood);

}
