package com.idea.cjyl.totalmodule.web.domain.vo;

/**
 * Created by lgengjiajun on 2016/12/16.
 */
public class OlderAgeVO {
    private int recipient;//女
    private int creator;//男

    @Override
    public String toString() {
        return "OlderAgeVO{" +
                "recipient=" + recipient +
                ", creator=" + creator +
                '}';
    }

    public int getRecipient() {
        return recipient;
    }

    public void setRecipient(int recipient) {
        this.recipient = recipient;
    }

    public int getCreator() {
        return creator;
    }

    public void setCreator(int creator) {
        this.creator = creator;
    }
}
