package me.wonjunjang.springbootdeveloper.controller;

import lombok.RequiredArgsConstructor;
import lombok.*;
import me.wonjunjang.springbootdeveloper.domain.Board;
import me.wonjunjang.springbootdeveloper.dto.BoardRequest;
import me.wonjunjang.springbootdeveloper.service.BoardService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@RestController
public class BoardController {
    private final BoardService boardService;

    @PostMapping("/api/board/create")
    public ResponseEntity<Board> createBoard(@RequestBody BoardRequest request){
        Board createdBoard = boardService.createBoard(request.getUsername(),request.getBoardname,request.getBoardContent());
        return new ResponseEntity<>(createdBoard, HttpStatus.CREATED);
    }

    @GetMapping("/api/board")
    public ResponseEntity<List<Board>> totalselectBoard(){
        List<Board> boards = boardService.getAllBoards();
        return new ResponseEntity<>(boards, HttpStatus.OK);
    }

    @GetMapping("/api/board/boardId/{boardID}")
    public ResponseEntity<Board> oneselectBoard(@PathVariable Long boardId){
        Board board = boardService.getBoardById(boardId);
        return new ResponseEntity<>(board, HttpStatus.OK);
    }

    @GetMapping("/api/board/boardAuthor/{boardAuthor}")
    public ResponseEntity<List<Board>> usertotalselecctBoard(@RequestParam String boardAuthor){
        List<Board> boards = boardService.getBoardByAuthor(boardAuthor);
        return new ResponseEntity<>(boards,HttpStatus.OK);
    }



}
