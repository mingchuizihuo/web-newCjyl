package com.idea.cjyl.core.generic;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by 10238 on 2016/11/3.
 */
public abstract class GenericServiceLevelImpl<Model, PK,ModelExample> extends GenericServiceImpl<Model, PK,ModelExample> implements GenericServiceLevel<Model, PK,ModelExample>  {



    /**
     * 获取对象Mybataiss查询对象
     * @return
     */
    public abstract ModelExample getModelExamplTidEqualTo(PK tid);
    /**
     * 获取级别
     * @return
     */
    public abstract byte getLevel(Model model);

    /**
     * 获取父级id
     * @param model
     * @return
     */
    public abstract PK getTid(Model model);

    /**
     * 设置级别
     * @param model
     * @param level
     */
    public abstract void setLevel(Model model,Byte level);

    /**
     * 设置父级id
     * @param model

     */
    public abstract void setTid(Model model);



    /**
     * 添加服务级别
     * @param model
     * @return
     */

    @Override
    public Model insertLevel(Model model) {


        //获取父级类型
        Model serviceClassesSuper = selectById(getTid(model));
        if(!notNullObject(serviceClassesSuper)){

            setLevel(model,(byte)0);
            setTid(model);
        }else{
            setLevel(model,(byte)(getLevel(serviceClassesSuper)+1));
        }
        return insert(model);
    }



    /**
     * 通过主键删除级别
     * @param id
     * @return
     */
    @Override
    public int deleteLevel(PK id) {

        ModelExample serviceClassesExample = getModelExamplTidEqualTo(id);
        getDao().deleteByPrimaryKey(id);
        return getDao().deleteByExample(serviceClassesExample);


    }

    /**
     * 查询级别
     * @return
     */
    @Override
    public List<List<Model>> findTree() {

        List<List<Model>> result = new ArrayList<>();
        ModelExample example =null;
        List<Model> list = getDao().selectByExample(example);
        if(list.size()==0){
            return result;
        }
        int maxLeave = 0;
        /**
         * 找到最小级别
         */
        for (Model serviceClasses : list){
            if (getLevel(serviceClasses)>maxLeave){
                maxLeave=getLevel(serviceClasses);
            }
        }
        /**
         * 封装级别
         */
        for (int i=0;i<=maxLeave;i++){
            List<Model> leaveList = new ArrayList<>();
            for (Model serviceClasses:list
                    ) {
                if(getLevel(serviceClasses)==i){
                    leaveList.add(serviceClasses);
                }
            }
            result.add(leaveList);
        }

        return result;
    }

}
