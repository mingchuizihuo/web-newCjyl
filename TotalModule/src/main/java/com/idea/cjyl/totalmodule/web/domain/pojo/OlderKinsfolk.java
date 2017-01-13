package com.idea.cjyl.totalmodule.web.domain.pojo;

public class OlderKinsfolk {
    private Long id;

    private Long organizationLoginId;

    private Long olderId;

    private String name;

    private Long relation;

    private String tel;

    private String cardId;

    private String jobName;

    private String homeAddress;

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

    public Long getOlderId() {
        return olderId;
    }

    public void setOlderId(Long olderId) {
        this.olderId = olderId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Long getRelation() {
        return relation;
    }

    public void setRelation(Long relation) {
        this.relation = relation;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel == null ? null : tel.trim();
    }

    public String getCardId() {
        return cardId;
    }

    public void setCardId(String cardId) {
        this.cardId = cardId == null ? null : cardId.trim();
    }

    public String getJobName() {
        return jobName;
    }

    public void setJobName(String jobName) {
        this.jobName = jobName == null ? null : jobName.trim();
    }

    public String getHomeAddress() {
        return homeAddress;
    }

    public void setHomeAddress(String homeAddress) {
        this.homeAddress = homeAddress == null ? null : homeAddress.trim();
    }

    public String getAccountFor() {
        return accountFor;
    }

    public void setAccountFor(String accountFor) {
        this.accountFor = accountFor == null ? null : accountFor.trim();
    }
}