package com.idea.cjyl.totalmodule.web.domain.pojo;

public class Room {
    private Long id;

    private Long organizationLoginId;

    private Long floorTierId;

    private String roomNum;

    private Byte roomType;

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

    public Long getFloorTierId() {
        return floorTierId;
    }

    public void setFloorTierId(Long floorTierId) {
        this.floorTierId = floorTierId;
    }

    public String getRoomNum() {
        return roomNum;
    }

    public void setRoomNum(String roomNum) {
        this.roomNum = roomNum == null ? null : roomNum.trim();
    }

    public Byte getRoomType() {
        return roomType;
    }

    public void setRoomType(Byte roomType) {
        this.roomType = roomType;
    }
}