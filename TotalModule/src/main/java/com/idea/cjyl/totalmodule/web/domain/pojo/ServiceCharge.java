package com.idea.cjyl.totalmodule.web.domain.pojo;

public class ServiceCharge {
    private Long id;

    private Long organizationLoginId;

    private String item;

    private Integer money;

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

    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item == null ? null : item.trim();
    }

    public Integer getMoney() {
        return money;
    }

    public void setMoney(Integer money) {
        this.money = money;
    }

    public String getAccountFor() {
        return accountFor;
    }

    public void setAccountFor(String accountFor) {
        this.accountFor = accountFor == null ? null : accountFor.trim();
    }
}