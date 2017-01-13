package com.idea.cjyl.totalmodule.web.domain.vo;

import com.idea.cjyl.totalmodule.web.domain.pojo.FloorTier;

import java.util.List;

/**
 * Created by Administrator on 2016/12/2.大厦
 */
public class MansionVO {

    private Long id;//id

    private Long organizationLoginId;//登录id

    private String name;//大厦名

    private String accountFor;//说明

    private List<FloorTierVO> floorTierierList;//楼层对象集合

    @Override
    public String toString() {
        return "MansionVO{" +
                "id=" + id +
                ", organizationLoginId=" + organizationLoginId +
                ", name='" + name + '\'' +
                ", accountFor='" + accountFor + '\'' +
                ", floorTierierList=" + floorTierierList +
                '}';
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getOrganizationLoginId() {
        return organizationLoginId;
    }

    public void setOrganizationLoginId(Long organizationLoginId) {
        this.organizationLoginId = organizationLoginId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAccountFor() {
        return accountFor;
    }

    public void setAccountFor(String accountFor) {
        this.accountFor = accountFor;
    }

    public List<FloorTierVO> getFloorTierierList() {
        return floorTierierList;
    }

    public void setFloorTierierList(List<FloorTierVO> floorTierierList) {
        this.floorTierierList = floorTierierList;
    }
}
