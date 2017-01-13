package com.idea.cjyl.totalmodule.web.domain.pojo;

public class Mansion {
    private Long id;

    private Long organizationLoginId;

    private String name;

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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getAccountFor() {
        return accountFor;
    }

    public void setAccountFor(String accountFor) {
        this.accountFor = accountFor == null ? null : accountFor.trim();
    }
}