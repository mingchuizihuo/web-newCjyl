package com.idea.cjyl.totalmodule.web.domain.pojo;

public class Login {
    private Long id;

    private Long organizationLoginId;

    private String loginName;

    private String loginPassword;

    private Long loginType;

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

    public String getLoginName() {
        return loginName;
    }

    public void setLoginName(String loginName) {
        this.loginName = loginName == null ? null : loginName.trim();
    }

    public String getLoginPassword() {
        return loginPassword;
    }

    public void setLoginPassword(String loginPassword) {
        this.loginPassword = loginPassword == null ? null : loginPassword.trim();
    }

    public Long getLoginType() {
        return loginType;
    }

    public void setLoginType(Long loginType) {
        this.loginType = loginType;
    }
}