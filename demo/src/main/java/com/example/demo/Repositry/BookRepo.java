package com.example.demo.Repositry;

import com.example.demo.Pojo.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepo extends JpaRepository<Book, Long> {
}
