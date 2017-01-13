package com.idea.cjyl.core.generic;

import com.github.pagehelper.Page;

import java.util.List;

/**
 * 所有自定义Service的顶级接口,封装常用的增删查改操作
 * <p/>
 * Model : 代表数据库中的表 映射的Java对象类型
 * PK :代表对象的主键类型
 *
 * @author StarZou
 * @since 2014年6月9日 下午6:14:06
 */
public interface GenericServiceLevel<Model, PK, ModelExample> extends GenericService<Model, PK, ModelExample> {

    /**
     * 添加级别类型对象
     *
     * @param model
     * @return
     */
    Model insertLevel(Model model);

    /**
     * 通过主键 删除级别
     *
     * @param id
     * @return
     */
    public int deleteLevel(PK id);


    /**
     * 查询级别
     *
     * @return
     */
    List<List<Model>> findTree();

}
