package com.example.exercise.model;

import javax.persistence.*;
import java.util.Set;

@Entity
public class BookCode {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String bookCode;
    private Integer quantityBook;
    @OneToOne(mappedBy = "bookCode")
    private Book book;

    public BookCode() {
    }

    public Integer getQuantityBook() {
        return quantityBook;
    }

    public void setQuantityBook(Integer quantityBook) {
        this.quantityBook = quantityBook;
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getBookCode() {
        return bookCode;
    }

    public void setBookCode(String bookCode) {
        this.bookCode = bookCode;
    }
}
