package me.wonjunjang.springbootdeveloper.dto;
import me.wonjunjang.springbootdeveloper.domain.Board;
import me.wonjunjang.springbootdeveloper.domain.Comment;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Getter

public class CommentRequest {
    private Long commentId;
    private String commentAuthor;
    private String commentContent;
    private List<Board> board;

    public Board todEntity(){
        return Board.builder()
                .commentId(commentId)
                .commentAuthor(commentAuthor)
                .commentContent(commentContent)
                .board(board)
                .build();
    }
}