package com.graphql.controller;


import com.graphql.dto.BookDTO;
import com.graphql.entity.Book;
import com.graphql.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import java.util.List;
import java.util.Optional;


@Controller
public class BookController {

    private final String getAllBooks = "allBooks";
    private final String getBookById = "getBook";
    private final String createBook = "createBook";

    private final BookService bookService;

    @Autowired
    public BookController(BookService bookService) {
        this.bookService = bookService;
    }

    @QueryMapping(getAllBooks)
    public List<Book> getAllBook() {
        return bookService.getAllBooks();
    }

    @MutationMapping(createBook)
    public Book addBook(@Argument BookDTO book) {
        Book b = new Book();
        b.setTitle(book.getTitle());
        b.setDesc(book.getDesc());
        b.setPrice(book.getPrice());
        b.setAuthor(book.getAuthor());
        b.setPages(book.getPages());
        return bookService.create(b);
    }


    @QueryMapping(getBookById)
    public Optional<Book> getBookById(@Argument int bookId) {
        return bookService.getBookById(bookId);
    }

}
