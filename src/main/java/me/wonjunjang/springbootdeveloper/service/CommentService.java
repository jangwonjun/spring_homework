package me.wonjunjang.springbootdeveloper.service;

import lombok.RequiredArgsConstructor;
import me.wonjunjang.springbootdeveloper.domain.Board;
import me.wonjunjang.springbootdeveloper.repository.CommentRepository;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class CommentService {
    private final CommentRepository commentRepository;

    public Board save(CommentRepository request){
        return commentRepository.save(request.toEntity());
    }
}
