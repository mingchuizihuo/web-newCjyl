package com.idea.cjyl.core.generic;

import com.github.pagehelper.Page;

import java.util.List;

/**
 * Created by xiao on 2016/12/8.
 */
public interface GenericServiceVO<ModelVO,Model,PK,ModelExample> extends GenericService<Model, PK,ModelExample> {

    /**
     * 查询详情
     * @return
     */
    public Page<ModelVO> findAllVO(Integer currentPage,Integer limit);

    /**
     * 通过条件查询
      * @param model
     * @param currentPage
     * @param limit
     * @return
     */
    public Page<ModelVO> findVOByExapmle(Model model, Integer currentPage, Integer limit);

    /**
     * 通过id查询详情
     * @param id
     * @return
     */
    public ModelVO selectVOByPrimaryKey(PK id);
}
