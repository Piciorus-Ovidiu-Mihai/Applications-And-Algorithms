package Piciorus.Ovidiu.Lab9.ex1;

import javax.swing.JFrame;

public class SimpleApp extends JFrame{

    SimpleApp(){
        setTitle("Titlul ferestrei");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(1980,1080);
        setVisible(true);
    }

    public static void main(String[] args) {
        SimpleApp a = new SimpleApp();
    }

}