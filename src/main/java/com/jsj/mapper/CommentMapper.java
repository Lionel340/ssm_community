package com.jsj.mapper;

import com.jsj.bean.Comment;
import com.jsj.bean.CommentUser;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface CommentMapper extends BaseMapper<Comment> {

    List<CommentUser> getCommentsByInvitationId(int invitationId);

    List<CommentUser> getCommentByCinId(int cinId);

    int insert(Comment comment);

    int notice(@Param("recipientId") int recipientId, @Param("commentId") int commentId);
}
