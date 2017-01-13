package com.idea.cjyl.common.web.domain.pojo;

public class CommentPicture {
    private Long id;

    private String pictureAddress;

    private Byte pictureType;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPictureAddress() {
        return pictureAddress;
    }

    public void setPictureAddress(String pictureAddress) {
        this.pictureAddress = pictureAddress == null ? null : pictureAddress.trim();
    }

    public Byte getPictureType() {
        return pictureType;
    }

    public void setPictureType(Byte pictureType) {
        this.pictureType = pictureType;
    }
}