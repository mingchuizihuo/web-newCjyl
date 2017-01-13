package com.idea.cjyl.totalmodule.web.service;

import com.idea.cjyl.core.generic.GenericServiceVO;
import com.idea.cjyl.totalmodule.web.domain.pojo.Older;
import com.idea.cjyl.totalmodule.web.domain.pojo.OlderExample;
import com.idea.cjyl.totalmodule.web.domain.vo.MonthChargeCharVO;
import com.idea.cjyl.totalmodule.web.domain.vo.OlderAgeVO;
import com.idea.cjyl.totalmodule.web.domain.vo.OlderIntoInfoVO;
import com.idea.cjyl.totalmodule.web.domain.vo.OlderVO;

import java.util.List;
import java.util.Map;

public interface OlderService extends GenericServiceVO<OlderVO,Older, Long,OlderExample> {
    /**
     * 获取老人入住情况
     * @return
     */
    public OlderIntoInfoVO getIntoInfo();

    /**
     * 获取老人护理级别
     * @return
     */
    public List<MonthChargeCharVO> getMonthChargeCharVO();

    /**
     * 获取老人年龄
     * @return
     */
    public Map<String,OlderAgeVO> getOlderAgeVO();
}
