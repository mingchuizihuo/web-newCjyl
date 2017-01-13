package com.idea.cjyl.totalmodule.web.domain.vo;

import com.idea.cjyl.totalmodule.web.domain.pojo.DataDictionary;
import com.idea.cjyl.totalmodule.web.domain.pojo.OlderKinsfolk;
import com.idea.cjyl.totalmodule.web.globals.AnalysisConstant;
import org.springframework.beans.BeanUtils;

import java.util.List;

/**
 * Created by xiao on 2016/12/7.
 */
public class OlderKinsfolkVO {

    private Long id;

    private Long organizationLoginId;

    private String name;

    private Long relation;

    private String tel;

    private String cardId;

    private String jobName;

    private String homeAddress;

    private String accountFor;

    private String relationStr;

    public void data2String(List<DataDictionary> dataDictionaryList) {
        for (DataDictionary dataDictionary : dataDictionaryList
                ) {
            if (dataDictionary.getId() == this.getRelation()) {
                this.relationStr = dataDictionary.getDataName();
            }
        }
    }

    public OlderKinsfolkVO bean2VO(OlderKinsfolk olderKinsfolk){
        BeanUtils.copyProperties(olderKinsfolk,this);
        return this;
    }
    @Override
    public String toString() {
        return "OlderKinsfolkVO{" +
                "id=" + id +
                ", organizationLoginId=" + organizationLoginId +
                ", name='" + name + '\'' +
                ", relation=" + relation +
                ", tel='" + tel + '\'' +
                ", cardId='" + cardId + '\'' +
                ", jobName='" + jobName + '\'' +
                ", homeAddress='" + homeAddress + '\'' +
                ", accountFor='" + accountFor + '\'' +
                ", relationStr='" + relationStr + '\'' +
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
        this.tel = tel;
    }

    public String getCardId() {
        return cardId;
    }

    public void setCardId(String cardId) {
        this.cardId = cardId;
    }

    public String getJobName() {
        return jobName;
    }

    public void setJobName(String jobName) {
        this.jobName = jobName;
    }

    public String getHomeAddress() {
        return homeAddress;
    }

    public void setHomeAddress(String homeAddress) {
        this.homeAddress = homeAddress;
    }

    public String getAccountFor() {
        return accountFor;
    }

    public void setAccountFor(String accountFor) {
        this.accountFor = accountFor;
    }

    public String getRelationStr() {
        return relationStr;
    }

    public void setRelationStr(String relationStr) {
        this.relationStr = relationStr;
    }
}
