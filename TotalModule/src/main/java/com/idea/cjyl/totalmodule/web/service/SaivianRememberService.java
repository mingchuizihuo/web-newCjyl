package com.idea.cjyl.totalmodule.web.service;

import com.idea.cjyl.core.generic.GenericService;
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
}