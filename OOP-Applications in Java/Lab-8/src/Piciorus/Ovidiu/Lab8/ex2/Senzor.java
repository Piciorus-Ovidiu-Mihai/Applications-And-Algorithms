package Piciorus.Ovidiu.Lab8.ex2;

public class Senzor {
    int valoare;

    Senzor(int a) {
        valoare = a;
    }

    void afiseaza() {
        System.out.println("Temperatura=" + valoare);
    }

    public static void main(String[] args) {
        Senzor s1 = new Senzor(25);
        Compresor z1 = new Compresor();
        Controler c1 = new Controler(s1, z1);
        c1.control();

    }
}