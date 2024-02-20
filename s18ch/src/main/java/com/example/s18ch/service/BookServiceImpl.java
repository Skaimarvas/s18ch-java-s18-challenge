package com.example.s18ch.service;

import com.example.s18ch.entity.Book;
import com.example.s18ch.repository.BookRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BookServiceImpl implements BookService{
    private final BookRepository bookRepository;

    public BookServiceImpl(BookRepository bookRepository){
        this.bookRepository = bookRepository;
    }


    @Override
    public List<Book> findAll() {
        return bookRepository.findAll();
    }

    @Override
    public Book find(long id) {
        Optional<Book> optionalBook = bookRepository.findById(id);
        if(optionalBook != null){
            optionalBook.get();
        }
        return null;
    }

    @Override
    public Book save(Book book) {
        return bookRepository.save(book);
    }

    @Override
    public Book delete(long id) {
        Book book = find(id);
        if(book != null){
            bookRepository.delete(book);
        }
        return null;
    }
}
