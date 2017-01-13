package com.idea.cjyl.core.generic;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import org.springframework.ui.Model;

import java.util.List;

/**
 * GenericService的实现类, 其他的自定义 ServiceImpl, 继承自它,可以获得常用的增删查改操作,
 * 未实现的方法有 子类各自实现
 * <p/>
 * Model : 代表数据库中的表 映射的Java对象类型
 * PK :代表对象的主键类型
 *
 * @author StarZou
 * @since 2014年6月9日 下午6:14:06
 */
public abstract class GenericServiceImpl<Model, PK,ModelExample> implements GenericService<Model, PK,ModelExample> {
    public boolean compare(int a) {
        if (a > 0) {
            return true;
        } else {
            return false;
        }
    }

    public boolean notNullAndZero(Long l) {
        if (l != null && l.intValue() != 0) {
            return true;
        } else {
            return false;
        }
    }

    public boolean notNullAndZero(Integer l) {
        if (l != null && l.intValue() != 0) {
            return true;
        } else {
            return false;
        }
    }

    public boolean notNullAndZero(Long[] ids) {
        if (ids != null && ids.length > 0) {
            return true;
        }
        return false;
    }

    public <E> E returnObject(List<E> list) {
        if (list.isEmpty()) {
            return null;
        } else {
            return list.get(0);
        }
    }

    public boolean notNullObject(Object object) {
        if (object != null) {
            return true;
        } else {
            return false;
        }
    }
    /**
     * 定义成抽象方法,由子类实现,完成dao的注入
     *
     * @return GenericDao实现类
     */
    public abstract GenericDao<Model, PK,ModelExample> getDao();


    /**
     * 插入对象
     *
     * @param model 对象
     */
    public Model insert(Model model) {
        getDao().insertSelective(model);
        return model;
    }



    /**
     * 更新对象
     *
     * @param model 对象
     */
    public int update(Model model) {
        return getDao().updateByPrimaryKeySelective(model);
    }

    /**
     * 通过主键, 删除对象
     *
     * @param id 主键
     */
    public int delete(PK id) {
        return getDao().deleteByPrimaryKey(id);
    }


    /**
     * 通过主键, 查询对象
     *
     * @param id 主键
     * @return
     */
    public Model selectById(PK id) {
        return getDao().selectByPrimaryKey(id);
    }


    @Override
    public Model selectOne() {
        return null;
    }

    @Override
    public List<Model> selectList(ModelExample example) {

        return getDao().selectByExample(example);
    }


    /**
     * 查询所有
     * @param currentPage
     * @param limit
     * @return
     */
    @Override
    public Page<Model> findAll(Integer currentPage,Integer limit){
        if(currentPage==null){
            currentPage=1;
        }
        if(limit==null){
            limit=10;
        }
        ModelExample example = null;
        PageHelper.startPage(currentPage, limit);
        Page<Model> list = (Page<Model>) getDao()
                .selectByExample(example);
        return list;

    }


    @Override
    public Integer dels(String dels) {
        String[] idsArray = dels.split(",");
        Long[] delIdLong = new Long[idsArray.length];
        Integer result = null;
        for (int i=0;i<idsArray.length;i++) {
            delIdLong[i] = Long.parseLong(idsArray[i]);
            result = getDao().deleteByPrimaryKey((PK)delIdLong[i]);
        }
        return result;
    }
}
