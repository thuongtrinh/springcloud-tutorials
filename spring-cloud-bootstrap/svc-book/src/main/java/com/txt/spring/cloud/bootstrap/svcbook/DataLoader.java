package com.txt.spring.cloud.bootstrap.svcbook;

import com.txt.spring.cloud.bootstrap.svcbook.book.Book;
import com.txt.spring.cloud.bootstrap.svcbook.book.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements ApplicationRunner {

    private BookService bookService;

    @Autowired
    public DataLoader(BookService bookService) {
        this.bookService = bookService;
    }

    @Override
    public void run(ApplicationArguments applicationArguments) throws Exception {
        this.bookService.createBook(new Book("Craig Walls", "Microservice with java"));
        this.bookService.createBook(new Book("George Orwell", "Spring 5 design pattern"));
    }
}
