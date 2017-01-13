package com.idea.cjyl.totalmodule.web.dao;

import com.idea.cjyl.core.generic.GenericDao;
import com.idea.cjyl.totalmodule.web.domain.pojo.Bed;
import com.idea.cjyl.totalmodule.web.domain.pojo.BedExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BedMapper extends GenericDao {
    int countByExample(BedExample example);

    int deleteByExample(BedExample example);

    int deleteByPrimaryKey(Long id);

    int insert(Bed record);

    int insertSelective(Bed record);

    List<Bed> selectByExample(BedExample example);

    Bed selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") Bed record, @Param("example") BedExample example);

    int updateByExample(@Param("record") Bed record, @Param("example") BedExample example);

    int updateByPrimaryKeySelective(Bed record);

    int updateByPrimaryKey(Bed record);
}