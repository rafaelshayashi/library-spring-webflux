package com.rafaelshayashi.libraryspringwebflux.controller.response;

import com.rafaelshayashi.libraryspringwebflux.model.Book;

public class BookResponse {

    private final String uuid;
    private final String title;
    private final String subTitle;
    private final String isbn;
    private final String description;

    public BookResponse(Book book){
        this.uuid = book.getUuid().toString();
        this.title = book.getTitle();
        this.subTitle = book.getSubTitle();
        this.isbn = book.getIsbn();
        this.description = book.getDescription();
    }

    public String getUuid() {
        return uuid;
    }

    public String getTitle() {
        return title;
    }

    public String getSubTitle() {
        return subTitle;
    }

    public String getIsbn() {
        return isbn;
    }

    public String getDescription() {
        return description;
    }
}
