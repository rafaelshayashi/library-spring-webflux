package com.rafaelshayashi.libraryspringwebflux.controller;

import com.rafaelshayashi.libraryspringwebflux.controller.request.BookRequest;
import com.rafaelshayashi.libraryspringwebflux.controller.response.BookResponse;
import com.rafaelshayashi.libraryspringwebflux.model.Book;
import com.rafaelshayashi.libraryspringwebflux.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/books")
public class BookController {

    private final BookService service;

    @Autowired
    public BookController(BookService service) {
        this.service = service;
    }

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public Flux<BookResponse> list(){
        return service.list()
                .map(BookResponse::new);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Mono<Book> create(@RequestBody BookRequest request) {
        return service.create(request);
    }
}
