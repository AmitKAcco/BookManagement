package com.example.demo.Service;

import com.example.demo.Pojo.Book;
import com.example.demo.Pojo.Userr;

import java.util.List;

public interface BookInterface {
    Book createBook(Book book);
    Book updateBook(Book book);
    List<Book> getAllBook();
    Book getBookById(long id);
//    Book assigAuthtoBook(Long bookId, Long authId);

    void deleteBook(long id);
}
