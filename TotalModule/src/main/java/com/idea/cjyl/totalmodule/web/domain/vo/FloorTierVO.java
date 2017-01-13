package com.idea.cjyl.totalmodule.web.domain.vo;

import com.idea.cjyl.totalmodule.web.domain.pojo.Room;

import java.util.List;

/**
 * Created by Administrator on 2016/12/2.楼层对象
 */
public class FloorTierVO {

    private Long id;//id

    private Long organizationLoginId;//登录id

    private Long mansionId;//大厦id

    private String floorTier;//楼层

    private String accountFor;//说明

    private List<RoomVO> roomList;//房间集合

    @Override
    public String toString() {
        return "FloorTierVO{" +
                "id=" + id +
                ", organizationLoginId=" + organizationLoginId +
                ", mansionId=" + mansionId +
                ", floorTier='" + floorTier + '\'' +
                ", accountFor='" + accountFor + '\'' +
                ", roomList=" + roomList +
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

    public Long getMansionId() {
        return mansionId;
    }

    public void setMansionId(Long mansionId) {
        this.mansionId = mansionId;
    }

    public String getFloorTier() {
        return floorTier;
    }

    public void setFloorTier(String floorTier) {
        this.floorTier = floorTier;
    }

    public String getAccountFor() {
        return accountFor;
    }

    public void setAccountFor(String accountFor) {
        this.accountFor = accountFor;
    }

    public List<RoomVO> getRoomList() {
        return roomList;
    }

    public void setRoomList(List<RoomVO> roomList) {
        this.roomList = roomList;
    }
}
