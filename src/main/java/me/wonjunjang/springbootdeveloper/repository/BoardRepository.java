package me.wonjunjang.springbootdeveloper.repository;

import me.wonjunjang.springbootdeveloper.domain.Board;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BoardRepository extends JpaRepository<Board, Long> {
}
