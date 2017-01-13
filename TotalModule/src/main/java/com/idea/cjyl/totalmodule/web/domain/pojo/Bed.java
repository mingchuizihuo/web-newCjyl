package com.idea.cjyl.totalmodule.web.domain.pojo;

public class Bed {
    private Long id;

    private Long organizationLoginId;

    private Long roomId;

    private Byte bedNum;

    private Byte bedState;

    private Long olderId;

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

    public Long getRoomId() {
        return roomId;
    }

    public void setRoomId(Long roomId) {
        this.roomId = roomId;
    }

    public Byte getBedNum() {
        return bedNum;
    }

    public void setBedNum(Byte bedNum) {
        this.bedNum = bedNum;
    }

    public Byte getBedState() {
        return bedState;
    }

    public void setBedState(Byte bedState) {
        this.bedState = bedState;
    }

    public Long getOlderId() {
        return olderId;
    }

    public void setOlderId(Long olderId) {
        this.olderId = olderId;
    }
}