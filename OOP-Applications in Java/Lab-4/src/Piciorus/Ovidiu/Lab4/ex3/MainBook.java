package Piciorus.Ovidiu.Lab4.ex3;

import Piciorus.Ovidiu.Lab4.ex2.Author;

public class MainBook {
    public static void main(String[] args) {
        Author a = new Author("Maria", "email@user.com", 'f');
        Book b = new Book("Casa", a, 23);
        Book b2 = new Book("masa", a, 45, 2);
        b.setQtyInStock(5);
        System.out.println(b.getAuthor().toString() + ' ' + b.getName() + ' ' + b.getPrice() + ' ' + b.getQtyInStock());
    }
}