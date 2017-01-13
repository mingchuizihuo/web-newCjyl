package com.idea.cjyl.totalmodule.web.domain.pojo;

public class FloorTier {
    private Long id;

    private Long organizationLoginId;

    private Long mansionId;

    private String floorTier;

    private String accountFor;

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
        this.floorTier = floorTier == null ? null : floorTier.trim();
    }

    public String getAccountFor() {
        return accountFor;
    }

    public void setAccountFor(String accountFor) {
        this.accountFor = accountFor == null ? null : accountFor.trim();
    }
}