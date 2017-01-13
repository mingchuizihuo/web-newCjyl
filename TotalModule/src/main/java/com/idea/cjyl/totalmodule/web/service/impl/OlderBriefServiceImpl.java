package com.idea.cjyl.totalmodule.web.service.impl;

import com.idea.cjyl.core.generic.GenericDao;
import com.idea.cjyl.core.generic.GenericDaoMyself;
import com.idea.cjyl.core.generic.GenericServiceVOImpl;
import com.idea.cjyl.totalmodule.web.dao.OlderMapper;
import com.idea.cjyl.totalmodule.web.dao.myself.OlderBriefMapperMyself;
import com.idea.cjyl.totalmodule.web.dao.myself.OlderMapperMyself;
import com.idea.cjyl.totalmodule.web.domain.pojo.Older;
import com.idea.cjyl.totalmodule.web.domain.pojo.OlderExample;
import com.idea.cjyl.totalmodule.web.domain.vo.OlderBriefVO;
import com.idea.cjyl.totalmodule.web.domain.vo.OlderVO;
import com.idea.cjyl.totalmodule.web.service.OlderBriefService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by xiao on 2016/12/8.
 */
@Service
public class OlderBriefServiceImpl extends GenericServiceVOImpl<OlderBriefVO,Older,Long,OlderExample> implements OlderBriefService {


    @Autowired
    private OlderMapper olderMapper;
    @Autowired
    private OlderBriefMapperMyself olderBriefMapperMyself;

    @Override
    public GenericDao<Older, Long, OlderExample> getDao() {
        return olderMapper;
    }


    @Override
    public GenericDaoMyself<OlderBriefVO,Older, Long, OlderExample> getVODao() {
        return olderBriefMapperMyself;
    }

    @Override
    public OlderExample getModelExample(Older older) {
        OlderExample olderExample = new OlderExample();
        OlderExample.Criteria criteria = olderExample.createCriteria();
        if (older.getName() != null) {
            criteria.andNameLike(older.getName());
        }  if (older.getTel() != null) {
            criteria.andTelLike(older.getTel());
        }  if (older.getCardId() != null) {
            criteria.andCardIdLike(older.getCardId());
        }  if (older.getCheckInDate() != null) {
            criteria.andCheckInDateEqualTo(older.getCheckInDate());
        }
        return olderExample;
    }



}
