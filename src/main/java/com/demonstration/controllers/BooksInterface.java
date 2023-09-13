package com.demonstration.controllers;

import java.util.List;

import com.demonstration.entities.Books;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface BooksInterface {
public Flux<Books> getAllBooks();
public Mono<Books> getOne(long id);
public void deleteBook(long id);
public Mono<Books> addOneBook(Books books);
}
