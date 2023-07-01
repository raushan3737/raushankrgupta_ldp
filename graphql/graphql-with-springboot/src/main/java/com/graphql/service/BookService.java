package com.graphql.service;

import com.graphql.entity.Book;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
public interface BookService {
    Book create(Book book);

    List<Book> getAllBooks();

    public Optional<Book> getBookById(int bookId);


}
