package com.idea.cjyl.core.generic;

import org.springframework.ui.Model;

import java.util.List;

/**
 * 所有自定义Dao的顶级接口, 封装常用的增删查改操作,
 * 可以通过Mybatis Generator Maven 插件自动生成Dao,
 * 也可以手动编码,然后继承GenericDao 即可.
 * <p/>
 * Model : 代表数据库中的表 映射的Java对象类型
 * PK :代表对象的主键类型
 *
 * @author StarZou
 * @since 2014年6月9日 下午6:14:06
 */
public interface GenericDaoMyself<ModelVO,Model, PK,ModelExample> extends GenericDao<Model, PK,ModelExample> {

    /**
     * 查询详情
     * @return
     */
    public List<ModelVO> findAllVO();

    /**
     * 通过条件查询信息
     * @param example
     * @return
     */
    public List<ModelVO> findVOByExapmle(ModelExample example);

    /**
     * 通过id查询详情
     * @param id
     * @return
     */
    public ModelVO selectVOByPrimaryKey(PK id);
}
