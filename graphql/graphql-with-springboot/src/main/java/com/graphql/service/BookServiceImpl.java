package com.graphql.service;

import com.graphql.entity.Book;
import com.graphql.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
public class BookServiceImpl implements BookService {

    private final BookRepository bookRepository;

    @Autowired
    public BookServiceImpl(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    @Override
    public Book create(Book book) {
        return this.bookRepository.save(book);
    }

    @Override
    public List<Book> getAllBooks() {
        return this.bookRepository.findAll();
    }

    public Optional<Book> getBookById(int bookId) {
        return this.bookRepository.findById(bookId);
    }
}
