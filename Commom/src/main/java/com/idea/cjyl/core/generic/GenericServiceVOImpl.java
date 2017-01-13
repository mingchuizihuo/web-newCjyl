package com.idea.cjyl.core.generic;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;

import java.util.List;


/**
 * Created by xiao on 2016/12/8.
 */
public abstract class GenericServiceVOImpl<ModelVO,Model, PK,ModelExample>  extends GenericServiceImpl<Model, PK,ModelExample> implements GenericServiceVO<ModelVO,Model, PK,ModelExample>  {



    public  abstract GenericDaoMyself<ModelVO,Model, PK,ModelExample> getVODao();

    public  ModelExample getModelExample(Model model){
        return null;
    };

    @Override
    public Page<ModelVO> findAllVO(Integer currentPage, Integer limit) {
        if (currentPage == null) {
            currentPage = 1;
        }
        if (limit == null) {
            limit = 10;
        }

        PageHelper.startPage(currentPage, limit);
        Page<ModelVO> list = (Page<ModelVO>) getVODao().findAllVO();
        return list;
    }



    /**
     * 通过条件查询
     * @param model
     * @param currentPage
     * @param limit
     * @return
     */
    @Override
    public Page<ModelVO> findVOByExapmle(Model model, Integer currentPage, Integer limit){
        if (currentPage == null) {
            currentPage = 1;
        }
        if (limit == null) {
            limit = 10;
        }

        PageHelper.startPage(currentPage, limit);
        Page<ModelVO> list = (Page<ModelVO>) getVODao().findVOByExapmle(getModelExample(model));
        return list;
    };

    /**
     * 通过id查询详情
     * @param id
     * @return
     */
    @Override
    public ModelVO selectVOByPrimaryKey(PK id){
      return getVODao().selectVOByPrimaryKey(id);
    };







}
