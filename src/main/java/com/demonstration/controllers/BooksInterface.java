package com.demonstration.controllers;

import java.util.List;

import com.demonstration.entities.Books;



public interface BooksInterface {
public List<Books> getAllBooks();
public Books getOne(long id);
public void deleteBook(long id);
public Books addOneBook(Books books);
}
