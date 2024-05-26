package me.wonjunjang.springbootdeveloper.dto;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import me.wonjunjang.springbootdeveloper.domain.Comment;
import me.wonjunjang.springbootdeveloper.domain.Board;

import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Getter

public class BoardRequest {
    private Long boardId;
    private String boardTitle;
    private String boardAuthor;
    private String boardContent;
    private List<Comment> comments;

    public Board todEntity(){
        return Board.builder()
                .boardId(boardId)
                .boardAuthor(boardAuthor)
                .boardContent(boardContent)
                .comments(comments)
                .build();
    }
}
