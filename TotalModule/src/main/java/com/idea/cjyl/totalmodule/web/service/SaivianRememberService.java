package com.idea.cjyl.totalmodule.web.service;

import com.idea.cjyl.core.generic.GenericService;
import com.idea.cjyl.totalmodule.web.domain.Note;
import com.idea.cjyl.totalmodule.web.domain.pojo.ConsumptionRecord;
import com.idea.cjyl.totalmodule.web.domain.pojo.SaivianRemember;
import com.idea.cjyl.totalmodule.web.domain.pojo.SaivianRememberExample;
import com.idea.cjyl.totalmodule.web.domain.pojo.Shop;

import java.util.List;

public interface SaivianRememberService extends GenericService<SaivianRemember,Long,SaivianRememberExample>{


    /**
     * 根据用户ID 获取旗下会员
     * @param userId
     * @return
     */
    List<SaivianRemember> findAllByUser(Long userId);

    /**
     * 获取商店
     * @return
     */
    List<Shop> getShop();

    /**
     * 获取小票信息
     * @param saivianIds
     * @return
     */
    List<Note> getRecord(List<Long> saivianIds);

    //查看消费记录
    List<ConsumptionRecord> showRecord(Long saivianTableId);

    List<SaivianRemember> findByName(String saivianName);
    //修改赛比安时间数据
    void updateSaivianDate(SaivianRemember saivianRemember);

}
