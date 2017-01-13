package com.idea.cjyl.totalmodule.web.service;

import com.idea.cjyl.core.generic.GenericServiceLevel;
import com.idea.cjyl.core.generic.GenericService;

import com.idea.cjyl.totalmodule.web.domain.pojo.Mansion;
import com.idea.cjyl.totalmodule.web.domain.pojo.MansionExample;
import com.idea.cjyl.totalmodule.web.domain.vo.MansionVO;

import java.util.List;

public interface MansionService extends GenericService<Mansion,Long,MansionExample>{

    public void insert(Mansion mansion,int floorNum,int roomNum,int bedNum,Long loginId);

    public List<MansionVO> findAllVO();
}
