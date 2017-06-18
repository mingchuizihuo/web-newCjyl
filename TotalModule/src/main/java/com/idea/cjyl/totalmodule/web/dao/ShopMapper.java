package com.idea.cjyl.totalmodule.web.dao;

import com.idea.cjyl.core.generic.GenericDao;
import com.idea.cjyl.totalmodule.web.domain.pojo.Shop;
import com.idea.cjyl.totalmodule.web.domain.pojo.ShopExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ShopMapper extends GenericDao {
    int countByExample(ShopExample example);

    int deleteByExample(ShopExample example);

    int deleteByPrimaryKey(Long id);

    int insert(Shop record);

    int insertSelective(Shop record);

    List<Shop> selectByExample(ShopExample example);

    Shop selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") Shop record, @Param("example") ShopExample example);

    int updateByExample(@Param("record") Shop record, @Param("example") ShopExample example);

    int updateByPrimaryKeySelective(Shop record);

    int updateByPrimaryKey(Shop record);
}