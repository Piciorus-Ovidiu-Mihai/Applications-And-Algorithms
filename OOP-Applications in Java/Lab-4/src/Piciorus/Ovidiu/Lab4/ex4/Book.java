package Piciorus.Ovidiu.Lab4.ex4;

import Piciorus.Ovidiu.Lab4.ex2.Author;

import java.util.Arrays;

public class Book {
    private String name;
    private Author[] author;
    private double price;
    private int qtyInStock;

    public Book() {
        this.qtyInStock = 0;
    }

    public Book(String name, Author author[], double price) {
        super();
        this.name = name;
        this.author = author;
        this.price = price;
    }

    public Book(String name, Author author[], double price, int qtyInStock) {
        super();
        this.name = name;
        this.author = author;
        this.price = price;
        this.qtyInStock = qtyInStock;
    }

    public String getName() {
        return name;
    }

    public Author[] getAuthor() {
        return author;
    }

    public double getPrice() {
        return price;
    }

    public int getQtyInStock() {
        return qtyInStock;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setQtyInStock(int qtyInStock) {
        this.qtyInStock = qtyInStock;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", author=" + Arrays.toString(author) + ", price=" + price +
                ", qtyInStock=" + qtyInStock +
                '}';
    }

    public void printAuthors() {
        System.out.println(Arrays.toString(author));
    }
}
