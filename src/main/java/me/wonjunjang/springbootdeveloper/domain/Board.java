package me.wonjunjang.springbootdeveloper.domain;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.NoArgsConstructor;

import java.util.List;
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Board {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="boardId")
    private Long boardId;

    @Column(name="boardTitle")
    private String boardTitle;

    @Column(name="boardAuthor")
    private String boardAuthor;

    @Column(name="boardContent")
    private String boardContent;

    @OneToMany(mappedBy = "board", cascade = CascadeType.ALL)
    private List<Comment> comments;

    @Builder
    public Board(Long boardId, String boardTitle, String boardAuthor, String boardContent, List<Comment> comments){
        this.boardId = boardId;
        this.boardTitle = boardTitle;
        this.boardAuthor = boardAuthor;
        this.boardContent = boardContent;
        this.comments = comments;
    }

    public static Object builder() {
    }


    public Long getBoardId() {
        return null;
    }

    public String getBoardTitle() {
        return null;
    }

    public String getBoardAuthor() {
        return null;
    }

    public String getBoardContent() {
        return null;
    }

    public List<Comment> getComments() {
        return null;
    }
}
