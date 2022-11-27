package com.example.demo.Repositry;

import com.example.demo.Pojo.Review;
import org.springframework.data.jpa.repository.JpaRepository;

public interface reviewRepo extends JpaRepository<Review, Long> {
}
