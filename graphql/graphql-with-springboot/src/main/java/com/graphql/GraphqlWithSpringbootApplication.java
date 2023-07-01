package com.graphql;

import com.graphql.entity.Book;
import com.graphql.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GraphqlWithSpringbootApplication implements CommandLineRunner {

//    @Autowired
//    private BookService bookService;

    public static void main(String[] args) {
        SpringApplication.run(GraphqlWithSpringbootApplication.class, args);
    }


    // Will run each time the application
    @Override
    public void run(String... args) throws Exception {
//        Book book1 = new Book(1, "Book 1", "Description 1", "Author 1", 500, 700);
//        Book book2 = new Book(2, "Book 2", "Description 2", "Author 2", 350, 225);
//
//        this.bookService.create(book1);
//        this.bookService.create(book2);

        System.out.println("Hello World!");


    }
}
