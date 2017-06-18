package com.idea.cjyl.totalmodule.web.dao;

import com.idea.cjyl.core.generic.GenericDao;
import com.idea.cjyl.totalmodule.web.domain.pojo.SaivianRemember;
import com.idea.cjyl.totalmodule.web.domain.pojo.SaivianRememberExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SaivianRememberMapper extends GenericDao {
    int countByExample(SaivianRememberExample example);

    int deleteByExample(SaivianRememberExample example);

    int deleteByPrimaryKey(Long id);

    int insert(SaivianRemember record);

    int insertSelective(SaivianRemember record);

    List<SaivianRemember> selectByExample(SaivianRememberExample example);

    SaivianRemember selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") SaivianRemember record, @Param("example") SaivianRememberExample example);

    int updateByExample(@Param("record") SaivianRemember record, @Param("example") SaivianRememberExample example);

    int updateByPrimaryKeySelective(SaivianRemember record);

    int updateByPrimaryKey(SaivianRemember record);
}