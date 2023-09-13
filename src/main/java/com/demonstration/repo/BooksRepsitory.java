package com.demonstration.repo;

import org.springframework.data.repository.reactive.ReactiveCrudRepository;

import com.demonstration.entities.Books;

public interface BooksRepsitory extends ReactiveCrudRepository<Books, Long> {

}
