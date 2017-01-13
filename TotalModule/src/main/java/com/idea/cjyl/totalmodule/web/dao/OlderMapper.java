package com.idea.cjyl.totalmodule.web.dao;

import com.idea.cjyl.core.generic.GenericDao;
import com.idea.cjyl.totalmodule.web.domain.pojo.Older;
import com.idea.cjyl.totalmodule.web.domain.pojo.OlderExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OlderMapper extends GenericDao {
    int countByExample(OlderExample example);

    int deleteByExample(OlderExample example);

    int deleteByPrimaryKey(Long id);

    int insert(Older record);

    int insertSelective(Older record);

    List<Older> selectByExample(OlderExample example);

    Older selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") Older record, @Param("example") OlderExample example);

    int updateByExample(@Param("record") Older record, @Param("example") OlderExample example);

    int updateByPrimaryKeySelective(Older record);

    int updateByPrimaryKey(Older record);
}