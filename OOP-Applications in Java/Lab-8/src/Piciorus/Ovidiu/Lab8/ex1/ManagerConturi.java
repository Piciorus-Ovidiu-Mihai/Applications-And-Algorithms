package Piciorus.Ovidiu.Lab8.ex1;


import java.util.*;

public class ManagerConturi {

    ArrayList<ContBancar> conturi = new ArrayList<ContBancar>();

    void depunereInCont(String a, double suma) {
        for (int i = 0; i < conturi.size(); i++) {
            ContBancar x = conturi.get(i);
            if (x.titular.n.equals(a)) {
                x.depunere(suma);
            }
        }
    }

    void creareCont(Persoana p, double d) {
        ContBancar b = new ContBancar(p, d);
        conturi.add(b);
    }

    void afiseaza() {
        for (int i = 0; i < conturi.size(); i++) {
            ContBancar cb = conturi.get(i);
            cb.detalii();
        }
    }

    void calculeazaDobanda() {
        for (int i = 0; i < conturi.size(); i++) {
            ContBancar cb = conturi.get(i);
            cb.actualizare();
        }
    }
}