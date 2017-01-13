package com.idea.cjyl.core.generic;

/**
 * Created by 10238 on 2016/11/3.
 */
public abstract class GenericServiceRelationImpl<Model, PK,ModelExample> extends GenericServiceImpl<Model, PK,ModelExample> implements GenericServiceRelation<Model, PK,ModelExample>  {

    /**
     * 得到删除ModelExample;
     * @return
     */
    public abstract ModelExample getDelModelExample(Model model);

    /**
     * 删除关系型
     * @param model
     * @return
     */
    public int deleteRelation(Model model){
        ModelExample example = getDelModelExample(model);
        return getDao().deleteByExample(example);
    }


}
