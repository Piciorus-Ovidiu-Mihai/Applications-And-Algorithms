package Piciorus.Ovidiu.Lab9.ex2;


import javax.swing.*;

import java.awt.*;
import java.awt.event.*;


public class CounterBuntton implements ActionListener {

    JButton countBtn = new JButton("Count");
    JFrame frm = new JFrame();
    JTextField displayTF = new JTextField(15);

    int i = 0;


    public CounterBuntton() {

        displayTF.setText("" + i);
        frm.setTitle("Counter Button");
        frm.setVisible(true);
        frm.setSize(200, 100);
        frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frm.setLayout(new FlowLayout());
        frm.add(displayTF);
        frm.add(countBtn);
        countBtn.addActionListener(this);
    }


    @Override
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == countBtn) {
            i++;
            displayTF.setText("" + i);
        }

    }

    public static void main(String args[]) {
        new CounterBuntton();
    }


}