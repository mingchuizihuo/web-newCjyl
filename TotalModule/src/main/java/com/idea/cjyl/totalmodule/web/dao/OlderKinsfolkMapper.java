package com.idea.cjyl.totalmodule.web.dao;

import com.idea.cjyl.core.generic.GenericDao;
import com.idea.cjyl.totalmodule.web.domain.pojo.OlderKinsfolk;
import com.idea.cjyl.totalmodule.web.domain.pojo.OlderKinsfolkExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OlderKinsfolkMapper extends GenericDao {
    int countByExample(OlderKinsfolkExample example);

    int deleteByExample(OlderKinsfolkExample example);

    int deleteByPrimaryKey(Long id);

    int insert(OlderKinsfolk record);

    int insertSelective(OlderKinsfolk record);

    List<OlderKinsfolk> selectByExample(OlderKinsfolkExample example);

    OlderKinsfolk selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") OlderKinsfolk record, @Param("example") OlderKinsfolkExample example);

    int updateByExample(@Param("record") OlderKinsfolk record, @Param("example") OlderKinsfolkExample example);

    int updateByPrimaryKeySelective(OlderKinsfolk record);

    int updateByPrimaryKey(OlderKinsfolk record);
}