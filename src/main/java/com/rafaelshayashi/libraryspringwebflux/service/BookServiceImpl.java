package com.rafaelshayashi.libraryspringwebflux.service;

import com.rafaelshayashi.libraryspringwebflux.controller.request.BookRequest;
import com.rafaelshayashi.libraryspringwebflux.model.Book;
import com.rafaelshayashi.libraryspringwebflux.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.function.Consumer;

@Service
public class BookServiceImpl implements BookService {

    private final BookRepository repository;

    @Autowired
    public BookServiceImpl(BookRepository repository) {
        this.repository = repository;
    }

    @Override
    public Flux<Book> list() {
        return repository.findAll();
    }

    @Override
    public Mono<Book> create(BookRequest request) {

        Consumer<Book> insert = book -> repository.save(book);
        Consumer<String> printConsumer = t -> System.out.println(t);

        Mono<Book> byIsbn = repository.findByIsbn(request.getIsbn());

        // a partir do BookRequest transformar para um book
        // verificar se esse book ja existe
        // caso exista lançar expcetion
        // caso não exita inserir

        Mono<Book> bookAlreadyExists = Mono.error(() -> new RuntimeException("Book already exists"));
        Mono<BookRequest> just = Mono.just(request);
        Mono<Book> map = just.map(BookRequest::toModel);
        return map.flatMap(book -> repository.findByIsbn(book.getIsbn()).hasElement().then(bookAlreadyExists).or(repository.save(request.toModel())));

    }
}
