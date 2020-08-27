package Piciorus.Ovidiu.Lab4.ex4;

import Piciorus.Ovidiu.Lab4.ex2.Author;

import java.util.Arrays;

public class MainBook {
    public static void main(String[] args) {
        Author[] aut = new Author[3];
        aut[0] = new Author("Ovi1", "ovidel", 'm');
        aut[1] = new Author("OVi2", "ovidel", 'm');
        aut[2] = new Author("Ovi3", "ovidel", 'm');
        Book b = new Book("Car", aut, 11, 4);
        System.out.println(b.toString() + "\n");
        b.setPrice(45);
        b.setQtyInStock(56);
        b.printAuthors();
        System.out.println(Arrays.toString(b.getAuthor()) + " " + b.getName() + " " + b.getPrice() + " " + b.getQtyInStock());
    }
}