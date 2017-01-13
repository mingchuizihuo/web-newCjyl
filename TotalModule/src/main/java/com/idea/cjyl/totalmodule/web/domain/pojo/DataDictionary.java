package com.idea.cjyl.totalmodule.web.domain.pojo;

public class DataDictionary {
    private Long id;

    private Long organizationLoginId;

    private String dataName;

    private Byte dataLevel;

    private Long tid;

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

    public String getDataName() {
        return dataName;
    }

    public void setDataName(String dataName) {
        this.dataName = dataName == null ? null : dataName.trim();
    }

    public Byte getDataLevel() {
        return dataLevel;
    }

    public void setDataLevel(Byte dataLevel) {
        this.dataLevel = dataLevel;
    }

    public Long getTid() {
        return tid;
    }

    public void setTid(Long tid) {
        this.tid = tid;
    }
}