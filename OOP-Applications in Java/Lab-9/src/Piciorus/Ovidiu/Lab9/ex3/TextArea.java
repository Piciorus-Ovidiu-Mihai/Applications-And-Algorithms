package Piciorus.Ovidiu.Lab9.ex3;


import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import java.util.*;

public class TextArea implements ActionListener {

    JButton buton = new JButton("Transfer");
    JFrame frm = new JFrame();
    JTextField text = new JTextField(15);
    JTextArea texta = new JTextArea(15, 15);

    public TextArea() {
        frm.setTitle("Copy");
        frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frm.setLayout(new FlowLayout());
        frm.setSize(400, 400);
        frm.setVisible(true);
        frm.add(buton);
        frm.add(texta);
        frm.add(text);
        buton.addActionListener(this);

    }

    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == buton) {
            texta.setText(text.getText());
        }

    }


    public static void main(String[] args) {
        new TextArea();
    }

}
