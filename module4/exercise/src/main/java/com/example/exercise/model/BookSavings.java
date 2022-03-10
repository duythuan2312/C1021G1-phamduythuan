package com.example.exercise.model;

import javax.persistence.*;

@Entity
public class BookSavings {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String date;
    private String period;
    private double depositBook;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "customer_id",referencedColumnName = "id")
    private Customer customer;

    public BookSavings() {
    }

    public BookSavings(int id, String date, String period, double depositBook, Customer customer) {
        this.id = id;
        this.date = date;
        this.period = period;
        this.depositBook = depositBook;
        this.customer = customer;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getPeriod() {
        return period;
    }

    public void setPeriod(String period) {
        this.period = period;
    }

    public double getDepositBook() {
        return depositBook;
    }

    public void setDepositBook(double depositBook) {
        this.depositBook = depositBook;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }
}
