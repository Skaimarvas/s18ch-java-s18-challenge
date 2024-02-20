package com.example.s18ch.dto;

public record BookResponse(long id, String name, String categoryName, AuthorResponse authorResponse) {
}
