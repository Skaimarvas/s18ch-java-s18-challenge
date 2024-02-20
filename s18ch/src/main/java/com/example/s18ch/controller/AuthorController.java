package com.example.s18ch.controller;

import com.example.s18ch.dto.AuthorResponse;
import com.example.s18ch.dto.AuthorResponseWithBooks;
import com.example.s18ch.dto.BookResponse;
import com.example.s18ch.entity.Author;
import com.example.s18ch.entity.Book;
import com.example.s18ch.service.AuthorService;
import com.example.s18ch.service.BookService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;


@AllArgsConstructor
@RestController
@RequestMapping("/workintech/author")
public class AuthorController {
    private final AuthorService authorService;
    private final BookService bookService;

    @PostMapping
    public Author save(@RequestBody Author author){
        return authorService.save(author);
    }
    @PostMapping("/{bookId}")
    public AuthorResponseWithBooks save(@RequestBody Author author, @PathVariable long bookId){
        Book book = bookService.find(bookId);
        author.addBook(book);
        authorService.save(author);
        List<BookResponse> responseList = new ArrayList<>();
        for(Book authorBook : author.getBooks()){
            responseList.add(new BookResponse(authorBook.getId(),authorBook.getBookName(), authorBook.getCategory().getCategoryName(),
                    new AuthorResponse(author.getId(), author.getFirstName() + " " + author.getLastName())));
        }
        return new AuthorResponseWithBooks(responseList);

    }
}
