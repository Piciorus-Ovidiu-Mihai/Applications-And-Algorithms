package Piciorus.Ovidiu.Lab8.ex2;


public class Compresor {
    boolean stare;

    void pornesteCompresor() {
        stare = true;
        System.out.println("Porneste compresor.");
    }

    void opresteCompresor() {
        stare = false;
        System.out.println("Opreste compresor.");
    }

    void afiseaza() {
        System.out.println("Starea compresorului este " + stare);
    }
}