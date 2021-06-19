package com.rafaelshayashi.libraryspringwebflux.controller.request;

import com.rafaelshayashi.libraryspringwebflux.model.Book;

public class BookRequest {

    private String title;
    private String subTitle;
    private String currency;
    private Integer amountInCents;
    private String isbn;
    private String description;

    public String getTitle() {
        return title;
    }

    public String getSubTitle() {
        return subTitle;
    }

    public String getCurrency() {
        return currency;
    }

    public Integer getAmountInCents() {
        return amountInCents;
    }

    public String getIsbn() {
        return isbn;
    }

    public String getDescription() {
        return description;
    }

    public Book toModel() {
        return Book.BookBuilder.aBook()
                .withTitle(title)
                .withSubTitle(subTitle)
                .withCurrency(currency)
                .withAmountInCents(amountInCents)
                .withIsbn(isbn)
                .withDescription(description)
                .withCreatedBy("user_librarian")
                .withUpdatedBy("user_librarian")
                .build();
    }
}
