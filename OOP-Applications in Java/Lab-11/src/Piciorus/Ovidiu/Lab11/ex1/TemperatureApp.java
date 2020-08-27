package Piciorus.Ovidiu.Lab11.ex1;

import java.awt.BorderLayout;
import java.awt.Dimension;
import javax.swing.*;

public class TemperatureApp extends JFrame{

    TemperatureApp(TemperatureTextView tview){
        setLayout(new BorderLayout());
        add(tview,BorderLayout.NORTH);

        pack();
        setVisible(true);
    }

    public static void main(String[] args) {
        Thermometer t = new Thermometer();
        t.start();


        TemperatureTextView tview = new TemperatureTextView();
        TemperatureController tcontroler = new TemperatureController(t,tview);

        new TemperatureApp(tview);
    }
}