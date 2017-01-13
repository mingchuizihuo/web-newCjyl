package com.idea.cjyl.common.web.service.impl;


import com.idea.cjyl.core.generic.GenericDao;
import com.idea.cjyl.core.generic.GenericServiceImpl;
import com.idea.cjyl.common.web.dao.CommentRichTextMapper;
import com.idea.cjyl.common.web.domain.pojo.CommentRichText;
import com.idea.cjyl.common.web.domain.pojo.CommentRichTextExample;
import com.idea.cjyl.common.web.service.CommentRichTextService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
public class CommentRichTextServiceImpl extends GenericServiceImpl<CommentRichText, Long,CommentRichTextExample> implements CommentRichTextService {
    @Autowired
    private CommentRichTextMapper commentrichtextDao;
    @Override
    public GenericDao<CommentRichText, Long,CommentRichTextExample> getDao() {
        return commentrichtextDao;
    }

}
