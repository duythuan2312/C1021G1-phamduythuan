package com.example.exercise.model;

import javax.persistence.*;
import java.util.Set;

@Entity
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String nameCustomer;
    @OneToMany(mappedBy = "customer")
    private Set<BookSavings> bookSavings;
    public Customer() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNameCustomer() {
        return nameCustomer;
    }

    public void setNameCustomer(String nameCustomer) {
        this.nameCustomer = nameCustomer;
    }

    public Set<BookSavings> getBookSavings() {
        return bookSavings;
    }

    public void setBookSavings(Set<BookSavings> bookSavings) {
        this.bookSavings = bookSavings;
    }
}
