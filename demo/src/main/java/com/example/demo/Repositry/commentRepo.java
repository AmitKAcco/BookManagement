package com.example.demo.Repositry;

import com.example.demo.Pojo.Comment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface commentRepo extends JpaRepository<Comment, Long> {
}
