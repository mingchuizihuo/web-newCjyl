package com.idea.cjyl.totalmodule.web.service;

import com.idea.cjyl.core.generic.GenericServiceVO;
import com.idea.cjyl.totalmodule.web.domain.vo.ArrearageNoteVO;

import java.util.List;

/**
 * Created by xiao on 2016/12/13.
 */
public interface ArrearageNoteService {
    /**
     * 查询所有欠费老人
     * @param state
     * @param currentPage
     * @param limit
     * @return
     */

    public List<ArrearageNoteVO> findAllVO(Long state,Integer currentPage,Integer limit);
}
