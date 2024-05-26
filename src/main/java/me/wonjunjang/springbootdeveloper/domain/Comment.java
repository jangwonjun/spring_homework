package me.wonjunjang.springbootdeveloper.domain;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.util.List;


@Entity
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Comment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Column(name = "commentId", updatable = false)
    private Long commentId;

    @Column(name = "commentAuthor", nullable = false)
    private String commentAuthor;

    @Column(name = "commentContent", nullable = false)
    private String commentContent;

    @ManyToOne
    private Board board;

    @Builder
    public Comment(Long commentId, String commentAuthor, String commentContent, Board board) {
        this.commentId = commentId;
        this.commentAuthor = commentAuthor;
        this.commentContent = commentContent;
        this.board = board;
    }


}


