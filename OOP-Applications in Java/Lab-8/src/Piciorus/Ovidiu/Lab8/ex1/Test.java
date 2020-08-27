package Piciorus.Ovidiu.Lab8.ex1;


public class Test {
    public static void main(String[] args) {
        Persoana p1 = new Persoana("A", 10);
        ContBancar c = new ContBancar(p1, 0.1);

        c.detalii();
        c.depunere(200);
        c.actualizare();
        c.detalii();

        ManagerConturi mc = new ManagerConturi();

        Persoana a = new Persoana("alin", 23);
        Persoana b = new Persoana("dan", 18);
        Persoana e = new Persoana("adi", 29);

        mc.creareCont(a, 0.05);
        mc.creareCont(b, 0.06);
        mc.creareCont(e, 0.04);

        mc.afiseaza();
    }
}
