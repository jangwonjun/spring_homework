package me.wonjunjang.springbootdeveloper.dto;

import lombok.Getter;
import me.wonjunjang.springbootdeveloper.domain.Board;
import me.wonjunjang.springbootdeveloper.domain.Comment;

import java.util.List;

@Getter
public class CommentResponse {
    private Long commentId;
    private String commentAuthor;
    private String commentContent;
    private Board board;

    public CommentResponse(Comment comment) {
        this.commentId = comment.getCommentId();
        this.commentAuthor = comment.getCommentAuthor();
        this.commentContent = comment.getCommentContent();
        this.board = comment.getBoard();
    }


}