package com.idea.cjyl.common.web.service;

import com.idea.cjyl.core.generic.GenericService;
import com.idea.cjyl.common.web.domain.pojo.CommentPicture;
import com.idea.cjyl.common.web.domain.pojo.CommentPictureExample;

public interface CommentPictureService extends GenericService<CommentPicture,Long,CommentPictureExample>{

    public Long[] insertPictures(String pictures,byte pictureType);

}
