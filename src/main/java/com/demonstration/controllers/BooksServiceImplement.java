package com.demonstration.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demonstration.entities.Books;
import com.demonstration.repo.BooksRepsitory;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class BooksServiceImplement implements BooksInterface {

	@Autowired
	BooksRepsitory bookRepository;
	@Override
	public Flux<Books> getAllBooks() {
		// TODO Auto-generated method stub
		return bookRepository.findAll();
	}

	@Override
	public Mono<Books> getOne(long id) {
		// TODO Auto-generated method stub
		return bookRepository.findById(id);
	}

	@Override
	public void deleteBook(long id) {
		// TODO Auto-generated method stub
		bookRepository.deleteById(id);

	}

	@Override
	public Mono<Books> addOneBook(Books books) {
		// TODO Auto-generated method stub
		return bookRepository.save(books);
	}


}
