package com.idea.cjyl.totalmodule.web.dao;

import com.idea.cjyl.core.generic.GenericDao;
import com.idea.cjyl.totalmodule.web.domain.pojo.Mansion;
import com.idea.cjyl.totalmodule.web.domain.pojo.MansionExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MansionMapper extends GenericDao {
    int countByExample(MansionExample example);

    int deleteByExample(MansionExample example);

    int deleteByPrimaryKey(Long id);

    int insert(Mansion record);

    int insertSelective(Mansion record);

    List<Mansion> selectByExample(MansionExample example);

    Mansion selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") Mansion record, @Param("example") MansionExample example);

    int updateByExample(@Param("record") Mansion record, @Param("example") MansionExample example);

    int updateByPrimaryKeySelective(Mansion record);

    int updateByPrimaryKey(Mansion record);
}