package com.kodcu.controller;

/**
 * Created with IntelliJ IDEA.
 * User: usta
 * Date: 2/13/13
 * Time: 11:35 PM
 * To change this template use File | Settings | File Templates.
 */
public class Book {

    private String name;
    private Double price;
    private String author;
    private Boolean visibility;

    public Book(String name, Double price, String author, Boolean visibility) {
        this.name = name;
        this.price = price;
        this.author = author;
        this.visibility = visibility;
    }

    public Book() {
    }

    public Boolean getVisibility() {
        return visibility;
    }

    public void setVisibility(Boolean visibility) {
        this.visibility = visibility;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
}
