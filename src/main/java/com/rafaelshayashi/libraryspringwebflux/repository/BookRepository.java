package com.rafaelshayashi.libraryspringwebflux.repository;

import com.rafaelshayashi.libraryspringwebflux.model.Book;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import reactor.core.publisher.Mono;



public interface BookRepository extends ReactiveCrudRepository<Book, Long> {
    Mono<Book> findByIsbn(String isbn);
}
