package Piciorus.Ovidiu.Lab8.ex2;

public class Controler {

    static final int V = 20;

    Senzor s;
    Compresor c;

    Controler(Senzor s, Compresor c) {
        this.s = s;
        this.c = c;
    }

    void control() {
        if (s.valoare > V)
            c.pornesteCompresor();
        else
            c.opresteCompresor();
    }
}