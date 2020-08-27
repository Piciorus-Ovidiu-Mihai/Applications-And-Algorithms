package Piciorus.Ovidiu.Lab8.ex1;


public class ContBancar {
    Persoana titular;
    double suma;
    double dobanda;

    ContBancar(Persoana p, double d) {
        this.titular = p;
        this.dobanda = d;
    }

    void depunere(double s) {
        suma += s;
    }

    void retragere(double s) {
        if (s < suma)
            suma = suma - s;
    }

    void actualizare() {
        suma = suma + suma * dobanda;
    }

    void detalii() {
        System.out.println("Cont Titular:" + titular.n + " disponibil=" + suma);
    }
}


