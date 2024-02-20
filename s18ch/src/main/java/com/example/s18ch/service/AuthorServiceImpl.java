package com.example.s18ch.service;

import com.example.s18ch.entity.Author;
import com.example.s18ch.repository.AuthorRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AuthorServiceImpl implements AuthorService{
    private final AuthorRepository authorRepository;

    public AuthorServiceImpl(AuthorRepository authorRepository){
        this.authorRepository = authorRepository;
    }

    @Override
    public List<Author> findAll() {
        return authorRepository.findAll();
    }

    @Override
    public Author find(long id) {

        Optional<Author> authorOptional = authorRepository.findById(id);
        if(authorOptional != null){
            return authorOptional.get();
        }

        return null;
    }

    @Override
    public Author save(Author author) {
            return authorRepository.save(author);
    }

    @Override
    public Author delete(long id) {
        Author author = find(id);
        if(author != null){
            authorRepository.delete(author);
        }

        return null;
    }
}
