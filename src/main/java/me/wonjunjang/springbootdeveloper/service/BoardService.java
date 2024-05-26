package me.wonjunjang.springbootdeveloper.service;

import lombok.RequiredArgsConstructor;
import me.wonjunjang.springbootdeveloper.domain.Board;
import me.wonjunjang.springbootdeveloper.dto.BoardRequest;
import me.wonjunjang.springbootdeveloper.repository.BoardRepository;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service

public class BoardService {
    private final BoardRepository boardRepository;

    public Board save(BoardRequest request){
        return boardRepository.save(request.todEntity());
    }
}
