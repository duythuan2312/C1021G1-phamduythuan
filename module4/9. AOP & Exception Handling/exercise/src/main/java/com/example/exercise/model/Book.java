package com.example.exercise.model;

import javax.persistence.*;

@Entity
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String tile;
    private String author;
    private String producer;
    private String yearProducer;
    private Integer bookNumber;
   @OneToOne(cascade = CascadeType.ALL)
   @JoinColumn(name = "book_id",referencedColumnName = "id")
   private BookCode bookCode;


    public Integer getBookNumber() {
        return bookNumber;
    }

    public void setBookNumber(Integer bookNumber) {
        this.bookNumber = bookNumber;
    }

    public Book() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTile() {
        return tile;
    }

    public void setTile(String tile) {
        this.tile = tile;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public String getYearProducer() {
        return yearProducer;
    }

    public void setYearProducer(String yearProducer) {
        this.yearProducer = yearProducer;
    }

    public BookCode getBookCode() {
        return bookCode;
    }

    public void setBookCode(BookCode bookCode) {
        this.bookCode = bookCode;
    }
}
