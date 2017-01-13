package com.idea.cjyl.core.generic;

import com.github.pagehelper.Page;
import org.springframework.ui.Model;

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
public interface GenericService<Model, PK,ModelExample> {

    /**
     * 插入对象
     *
     * @param model 对象
     */
    Model insert(Model model);


    /**
     * 更新对象
     *
     * @param model 对象
     */
    int update(Model model);

    /**
     * 通过主键, 删除对象
     *
     * @param id 主键
     */
    int delete(PK id);



    /**
     * 通过主键, 查询对象
     *
     * @param id 主键
     * @return model 对象
     */
    Model selectById(PK id);


    /**
     * 查询单个对象
     *
     * @return 对象
     */
    Model selectOne();


    /**
     * 查询多个对象
     *
     * @return 对象集合
     */
    List<Model> selectList(ModelExample example);

    /**
     * 分页查询所有
     * @param currentPage
     * @param limit
     * @return
     */
    Page<Model> findAll(Integer currentPage, Integer limit);

    /**
     * 批量删除
     * @param dels
     * @return
     */
    Integer dels(String dels);



}
