package com.example.s18ch.dto;

import java.util.List;

public record AuthorResponseWithBooks(List<BookResponse> responseList) {
}
