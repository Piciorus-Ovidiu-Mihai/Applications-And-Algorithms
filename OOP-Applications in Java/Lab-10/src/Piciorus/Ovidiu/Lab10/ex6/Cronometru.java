package Piciorus.Ovidiu.Lab10.ex6;



import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Cronometru implements ActionListener {
    static int milisec = 0;
    static int sec = 0;
    static int min = 0;
    static int ore = 0;
    JLabel ore1, min1, sec1, milisec1;
    JButton start, stop, reset;
    private JFrame frame;
    private JPanel panel = new JPanel ();
    static boolean state = true;

    Cronometru () {
        frame = new JFrame ("Cronometru");
        frame.add (panel);
        frame.setDefaultCloseOperation (WindowConstants.EXIT_ON_CLOSE);
        frame.setSize (400, 200);
        frame.setLocation (400, 400);
        panel.setLayout (null);
        init ();
        frame.setVisible (true);
    }

    public void init () {
        int width = 60;
        int height = 20;
        ore1 = new JLabel ("00:");

        ore1.setBounds (20, 20, width, height);
        ore1.setFont (new Font ("Arial", Font.PLAIN, 25));
        panel.add (ore1);
        min1 = new JLabel ("00:");
        min1.setFont (new Font ("Arial", Font.PLAIN, 25));
        min1.setBounds (60, 20, width, height);
        panel.add (min1);
        sec1 = new JLabel ("00:");
        sec1.setBounds (100, 20, width, height);
        sec1.setFont (new Font ("Arial", Font.PLAIN, 25));
        panel.add (sec1);
        milisec1 = new JLabel ("00");
        milisec1.setBounds (140, 20, width, height);
        milisec1.setFont (new Font ("Arial", Font.PLAIN, 15));
        panel.add (milisec1);


        start = new JButton ("Start");
        start.setBounds (20, 50, 70, 20);
        panel.add (start);
        stop = new JButton ("Stop");
        stop.setBounds (100, 50, 70, 20);
        panel.add (stop);
        reset = new JButton ("Reset");
        reset.setBounds (180, 50, 70, 20);
        panel.add (reset);
        start.addActionListener (this);
        stop.addActionListener (this);
        reset.addActionListener (this);


    }

    public void actionPerformed (ActionEvent e) {
        if (e.getSource () == start) {
            state = true;
            Thread t = new Thread () {
                public void run () {

                    for (; ; ) {
                        if (state == true) {
                            try {
                                Thread.sleep (1);
                                milisec++;
                                if (milisec > 634) {
                                    milisec = 0;
                                    sec++;
                                }
                                if (sec > 59) {
                                    sec = 0;
                                    min++;
                                }
                                if (min > 59) {
                                    min = 0;
                                    ore++;
                                }
                                milisec1.setText (":" + milisec);
                                sec1.setText (":" + sec);
                                min1.setText (":" + min);
                                ore1.setText ("" + ore);

                            } catch (Exception e) {
                            }
                        } else {
                            break;
                        }
                    }
                }
            };
            t.start ();
        }
        if (e.getSource () == stop) {
            state = false;
        }
        if (e.getSource () == reset) {

            milisec = 0;
            sec = 0;
            min = 0;
            ore = 0;
            milisec1.setText ("00");
            sec1.setText ("00:");
            min1.setText ("00:");
            ore1.setText ("00:");

        }
    }

    public static void main (String[] args) {
        new Cronometru ();
    }

}

