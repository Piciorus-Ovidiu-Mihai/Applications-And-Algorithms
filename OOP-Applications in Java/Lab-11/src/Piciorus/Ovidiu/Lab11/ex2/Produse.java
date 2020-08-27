package Piciorus.Ovidiu.Lab11.ex2;



import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Produse implements ActionListener {
    JFrame frame;
    JPanel panel = new JPanel ();
    JButton add, delete, schimbacant1;
    JTextField numeadd, pret, cantitate, numeinit, schimbacant;
    JTextArea areatext;
    JLabel nume, price, quan, schimba, numeprodus2, nouacantitate;
    JCheckBox da, nu;

    Produse () {
        frame = new JFrame ("Produse");
        frame.add (panel);
        frame.setSize (800, 400);
        frame.setLocation (400, 400);
        frame.setDefaultCloseOperation (WindowConstants.EXIT_ON_CLOSE);
        panel.setLayout (null);
        init ();
        frame.setVisible (true);
    }

    public void init () {
        final int weight = 150;
        final int height = 25;
        add = new JButton ("Adauga produs");
        add.setBounds (25, 25, weight, height);
        panel.add (add);
        delete = new JButton ("Sterge produs");
        delete.setBounds (25, 50, weight, height);
        panel.add (delete);
        nume = new JLabel ("Dati numele produsului:");
        nume.setBounds (25, 25, 150, 200);
        panel.add (nume);
        price = new JLabel ("Dati pretul produsului:");
        price.setBounds (25, 75, 150, 200);
        panel.add (price);
        quan = new JLabel ("Dati cant. produsului:");
        quan.setBounds (25, 125, 150, 200);
        panel.add (quan);
        numeadd = new JTextField ();
        numeadd.setBounds (25, 140, weight, height);
        panel.add (numeadd);
        pret = new JTextField ();
        pret.setBounds (25, 190, weight, height);
        panel.add (pret);
        cantitate = new JTextField ();
        cantitate.setBounds (25, 240, weight, height);
        panel.add (cantitate);
        areatext = new JTextArea ();
        areatext.setBounds (250, 25, 200, 200);
        areatext.setEditable (false);
        panel.add (areatext);
        schimba = new JLabel ("Vrei sa schimbi cantitatea?:");
        schimba.setBounds (500, 1, 180, 35);
        panel.add (schimba);
        da = new JCheckBox ("Da");
        da.setText ("Da");
        da.setBounds (660, 8, 20, 20);
        panel.add (da);
        numeinit = new JTextField ();
        numeinit.setBounds (500, 35, weight, height);
        panel.add (numeinit);
        schimbacant = new JTextField ();
        schimbacant.setBounds (500, 75, weight, height);
        panel.add (schimbacant);
        schimbacant1 = new JButton ("Schimba cant");
        schimbacant1.setBounds (500, 115, weight, height);
        panel.add (schimbacant1);
        numeinit.setEditable (false);
        schimbacant.setEditable (false);
        numeprodus2 = new JLabel ("Nume produs:");
        numeprodus2.setBounds (500, 1, 189, 55);
        panel.add (numeprodus2);
        nouacantitate = new JLabel ("Noua cantitate:");
        nouacantitate.setBounds (500, 1, 189, 130);
        panel.add (nouacantitate);
        schimbacant1.addActionListener (new ActionListener () {
            public void actionPerformed (ActionEvent e) {
                if (e.getSource () == schimbacant1) {
                    if (da.isSelected ()) {
                        if (numeinit.getText ().equals (numeadd.getText ()) == true)
                            areatext.setText ("Nume: " + numeadd.getText () + " \nPret: " + pret.getText () + "\nCantitatea:" + schimbacant.getText ());
                        numeinit.setText ("");
                        schimbacant.setText ("");
                    }
                }
            }
        });

        da.addActionListener (new ActionListener () {
            public void actionPerformed (ActionEvent e) {
                if (da.isSelected ()) {
                    numeinit.setEditable (true);
                    schimbacant.setEditable (true);
                } else {
                    numeinit.setEditable (false);
                    schimbacant.setEditable (false);
                }

            }
        });
        delete.addActionListener (new ActionListener () {
            public void actionPerformed (ActionEvent e) {
                if (e.getSource () == delete) {
                    areatext.setText ("");
                    numeadd.setText ("");
                    cantitate.setText ("");
                    pret.setText ("");
                }
            }
        });
        add.addActionListener (this);

    }

    public void actionPerformed (ActionEvent e) {
        if (e.getSource () == add) {
            areatext.setText ("Nume: " + numeadd.getText () + " \nPret: " + pret.getText () + "\nCantitatea:" + cantitate.getText ());
        }
    }

    public static void main (String[] args) {
        new Produse ();
    }
}


