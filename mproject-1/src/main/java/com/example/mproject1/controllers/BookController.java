package com.example.mproject1.controllers;

import com.example.mproject1.dtos.CreateBookRequest;
import com.example.mproject1.dtos.SearchBookRequest;
import com.example.mproject1.models.Book;
import com.example.mproject1.services.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
public class BookController {

    @Autowired
    BookService bookService;

    @PostMapping("/book")
    public void createBook(@RequestBody @Valid CreateBookRequest createBookRequest){
        //author  --> Book
        //book -->author -->map book to author

        bookService.createOrUpdate(createBookRequest.to());
    }

    @GetMapping("/book")
    public List<Book> getBooks(@RequestBody @Valid SearchBookRequest searchBookRequest) throws Exception {

        return bookService.find(
                searchBookRequest.getSearchKey(),
                searchBookRequest.getSearchValue()
        );

    }
}
