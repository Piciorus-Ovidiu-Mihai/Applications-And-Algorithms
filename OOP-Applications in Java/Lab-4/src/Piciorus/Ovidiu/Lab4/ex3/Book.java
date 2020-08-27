package Piciorus.Ovidiu.Lab4.ex3;


import Piciorus.Ovidiu.Lab4.ex2.Author;

public class Book {
    private String name;
    private Author author;
    private double price;
    private int qtyInStock;

    public Book() {
        this.qtyInStock = 0;
    }

    public Book(String name, Author author, double price) {
        super();
        this.name = name;
        this.author = author;
        this.price = price;
    }

    public Book(String name, Author author, double price, int qtyInStock) {
        super();
        this.name = name;
        this.author = author;
        this.price = price;
        this.qtyInStock = qtyInStock;
    }

    public String getName() {
        return name;
    }

    public Author getAuthor() {
        return author;
    }

    public double getPrice() {
        return price;
    }

    public void setQtyInStock(int qtyInStock) {
        this.qtyInStock = qtyInStock;
    }

    public int getQtyInStock() {
        return qtyInStock;
    }
}
