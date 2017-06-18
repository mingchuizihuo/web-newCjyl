package com.idea.cjyl.totalmodule.web.dao;

import com.idea.cjyl.core.generic.GenericDao;
import com.idea.cjyl.totalmodule.web.domain.pojo.ConsumptionRecord;
import com.idea.cjyl.totalmodule.web.domain.pojo.ConsumptionRecordExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ConsumptionRecordMapper extends GenericDao {
    int countByExample(ConsumptionRecordExample example);

    int deleteByExample(ConsumptionRecordExample example);

    int deleteByPrimaryKey(Long id);

    int insert(ConsumptionRecord record);

    int insertSelective(ConsumptionRecord record);

    List<ConsumptionRecord> selectByExample(ConsumptionRecordExample example);

    ConsumptionRecord selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") ConsumptionRecord record, @Param("example") ConsumptionRecordExample example);

    int updateByExample(@Param("record") ConsumptionRecord record, @Param("example") ConsumptionRecordExample example);

    int updateByPrimaryKeySelective(ConsumptionRecord record);

    int updateByPrimaryKey(ConsumptionRecord record);
}