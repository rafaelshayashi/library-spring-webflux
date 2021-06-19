package com.rafaelshayashi.libraryspringwebflux.model;

import org.springframework.data.annotation.Id;

import java.time.LocalDateTime;
import java.util.UUID;

public class Book {

    @Id
    private long id;
    private UUID uuid;
    private String title;
    private String subTitle;
    private String currency;
    private Integer amountInCents;
    private String description;
    private String isbn;
    private LocalDateTime createdAt;
    private String createdBy;
    private LocalDateTime updatedAt;
    private String updatedBy;

    public Book(String title,
                String subTitle,
                String currency,
                Integer amountInCents,
                String description,
                String isbn,
                String createdBy,
                String updatedBy) {

        this.uuid = UUID.randomUUID();
        this.title = title;
        this.subTitle = subTitle;
        this.currency = currency;
        this.amountInCents = amountInCents;
        this.description = description;
        this.isbn = isbn;
        this.createdAt = LocalDateTime.now();
        this.createdBy = createdBy;
        this.updatedAt = LocalDateTime.now();
        this.updatedBy = updatedBy;
    }


    public long getId() {
        return id;
    }

    public UUID getUuid() {
        return uuid;
    }

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

    public String getDescription() {
        return description;
    }

    public String getIsbn() {
        return isbn;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public LocalDateTime getUpdatedAt() {
        return updatedAt;
    }

    public String getUpdatedBy() {
        return updatedBy;
    }

    public static final class BookBuilder {
        private String title;
        private String subTitle;
        private String currency;
        private Integer amountInCents;
        private String description;
        private String isbn;
        private String createdBy;
        private String updatedBy;

        private BookBuilder() {
        }

        public static BookBuilder aBook() {
            return new BookBuilder();
        }

        public BookBuilder withTitle(String title) {
            this.title = title;
            return this;
        }

        public BookBuilder withSubTitle(String subTitle) {
            this.subTitle = subTitle;
            return this;
        }

        public BookBuilder withCurrency(String currency) {
            this.currency = currency;
            return this;
        }

        public BookBuilder withAmountInCents(Integer amountInCents) {
            this.amountInCents = amountInCents;
            return this;
        }

        public BookBuilder withDescription(String description) {
            this.description = description;
            return this;
        }

        public BookBuilder withIsbn(String isbn) {
            this.isbn = isbn;
            return this;
        }

        public BookBuilder withCreatedBy(String createdBy) {
            this.createdBy = createdBy;
            return this;
        }

        public BookBuilder withUpdatedBy(String updatedBy) {
            this.updatedBy = updatedBy;
            return this;
        }

        public Book build() {
            return new Book(title, subTitle, currency, amountInCents, description, isbn, createdBy, updatedBy);
        }
    }
}
