package com.idea.cjyl.common.web.domain.pojo;

public class CommentRichText {
    private Long id;

    private String richTextTitle;

    private String richTextHeadPicture;

    private String richTextBody;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getRichTextTitle() {
        return richTextTitle;
    }

    public void setRichTextTitle(String richTextTitle) {
        this.richTextTitle = richTextTitle == null ? null : richTextTitle.trim();
    }

    public String getRichTextHeadPicture() {
        return richTextHeadPicture;
    }

    public void setRichTextHeadPicture(String richTextHeadPicture) {
        this.richTextHeadPicture = richTextHeadPicture == null ? null : richTextHeadPicture.trim();
    }

    public String getRichTextBody() {
        return richTextBody;
    }

    public void setRichTextBody(String richTextBody) {
        this.richTextBody = richTextBody == null ? null : richTextBody.trim();
    }
}