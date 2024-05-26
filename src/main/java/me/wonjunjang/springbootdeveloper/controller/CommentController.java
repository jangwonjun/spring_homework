package me.wonjunjang.springbootdeveloper.controller;

import lombok.RequiredArgsConstructor;
import me.wonjunjang.springbootdeveloper.domain.Comment;
import me.wonjunjang.springbootdeveloper.service.CommentService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@RestController
public class CommentController {
    private final CommentService commentService;

    @PostMapping("/api/board/{boardId}/comment/create")
    public ResponseEntity<Comment> createComment(@PathVariable Long boardId, @RequestParam String username, @RequestParam String commentContent){
        Comment createdComment = commentService.createComment(boardId, username, commentContent);
        return new ResponseEntity<>(createdComment, HttpStatus.CREATED);
    }

    @GetMapping("/api/board/{boardId}/comment")
    public ResponseEntity<List<Comment>> selectComment(@PathVariable Long boardId){
        List<Comment> comments = commentService.getCommentsByBoardId(boardId);
        return new ResponseEntity<>(comments, HttpStatus.OK);
    }


}
