package com.idea.cjyl.core.generic;

/**
 * 所有自定义Service的顶级接口,封装常用的增删查改操作
 * <p/>
 * Model : 代表数据库中的表 映射的Java对象类型
 * PK :代表对象的主键类型
 *
 * @author StarZou
 * @since 2014年6月9日 下午6:14:06
 */
public interface GenericServiceRelation<Model, PK, ModelExample> extends GenericService<Model, PK, ModelExample> {
    /**
     * 删除关系型
     * @param model
     * @return
     */
    int deleteRelation(Model model);

}
