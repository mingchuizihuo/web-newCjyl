package com.idea.cjyl.common.web.dao;

import com.idea.cjyl.common.web.domain.pojo.CommentRichText;
import com.idea.cjyl.common.web.domain.pojo.CommentRichTextExample;
import java.util.List;

import com.idea.cjyl.core.generic.GenericDao;
import org.apache.ibatis.annotations.Param;

public interface CommentRichTextMapper extends GenericDao{
    int countByExample(CommentRichTextExample example);

    int deleteByExample(CommentRichTextExample example);

    int deleteByPrimaryKey(Long id);

    int insert(CommentRichText record);

    int insertSelective(CommentRichText record);

    List<CommentRichText> selectByExampleWithBLOBs(CommentRichTextExample example);

    List<CommentRichText> selectByExample(CommentRichTextExample example);

    CommentRichText selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") CommentRichText record, @Param("example") CommentRichTextExample example);

    int updateByExampleWithBLOBs(@Param("record") CommentRichText record, @Param("example") CommentRichTextExample example);

    int updateByExample(@Param("record") CommentRichText record, @Param("example") CommentRichTextExample example);

    int updateByPrimaryKeySelective(CommentRichText record);

    int updateByPrimaryKeyWithBLOBs(CommentRichText record);

    int updateByPrimaryKey(CommentRichText record);
}