package com.rafaelshayashi.libraryspringwebflux.service;

import com.rafaelshayashi.libraryspringwebflux.controller.request.BookRequest;
import com.rafaelshayashi.libraryspringwebflux.model.Book;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface BookService {

    Flux<Book> list();

    Mono<Book> create(BookRequest request);
}
