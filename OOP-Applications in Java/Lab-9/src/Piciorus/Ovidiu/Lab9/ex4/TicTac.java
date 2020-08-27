package Piciorus.Ovidiu.Lab9.ex4;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;


class TicTacToe implements ActionListener {

    JCheckBox cb1= new JCheckBox("vs friend");
    JFrame jf= new JFrame("TicTacToe by Ovidiu");
    JButton jb[][]= new JButton[3][3];
    JButton reset= new JButton();
    JLabel xjl= new JLabel();
    JLabel ojl= new JLabel();
    JLabel xwin= new JLabel();
    JLabel owin= new JLabel();
    JMenu menu1, menu2;
    JMenuBar bar;
    JMenuItem i1,i2,i3;
    JTextArea tf;
    int corX=0, corY=0;
    int flag=0;
    int xScore=0;
    int oScore=0;
    int comp=0;
    public void selectGame() {
        jf.setLayout(null);
        jf.add(cb1);
        cb1.setBounds(100,50,100,100);
        jf.add(cb1);
        cb1.setBounds(100, 150, 100, 100);
        cb1.addItemListener(new ItemListener() {

            @Override
            public void itemStateChanged(ItemEvent e) {
                jf.remove(cb1);
                setUpFrame();

            }
        });

        jf.setSize(318, 510);
        jf.setVisible(true);

    }



    public void setUpFrame() {
        jf.setSize(500, 500);
        for(int i=0; i< 3; i++) {
            for(int j=0; j<3 ;j++) {
                jb[i][j]= new JButton(" ");
                jb[i][j].setSize(100, 100);
                jb[i][j].setBounds(corX, corY, 100, 100);
                jf.add(jb[i][j]);
                jb[i][j].addActionListener(this);


                corX=corX+100;
            }

            corX=0;
            corY=corY+100;
        }
        reset.setBounds(100, 350, 100, 50);
        xjl.setBounds(0,400,80,80);
        ojl.setBounds(200,400,80,80);
        xwin.setBounds(80,400,200,80);
        owin.setBounds(280,400, 200, 80);
        jf.setLayout(null);
        jf.setSize(318, 510);
        jf.setVisible(true);
        jf.add(ojl);
        jf.add(xjl);
        jf.add(xwin);
        jf.add(owin);
        reset.setText("Reset");
        reset.setBackground(Color.GREEN);
        bar= new JMenuBar();
        menu1= new JMenu("Game");
        menu2= new JMenu("Help");
        i1= new JMenuItem("New Game");
        i1.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                if(e.getSource()==i1) {
                    for(int i=0; i<3 ;i++) {
                        for(int j=0;j<3;j++) {
                            jb[i][j].setText(" ");
                        }
                    }
                    xwin.setText(" ");
                    owin.setText(" ");
                    xScore=0; oScore=0;
                    flag=0;
                }

            }
        });
        i2=new JMenuItem("Exit");
        i2.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                if(e.getSource()==i2) {
                    jf.dispose();
                }


            }
        });
        i3=new JMenuItem("Help");
        i3.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                if(e.getSource()==i3) {
                    help();
                }

            }
        });
        menu1.add(i1);
        menu1.add(i2);
        menu2.add(i3);

        bar.add(menu1);
        bar.add(menu2);
        jf.setJMenuBar(bar);

        reset.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {

                if(e.getSource()==reset) {
                    for(int i=0; i<3 ;i++) {
                        for(int j=0;j<3;j++) {
                            jb[i][j].setText(" ");
                        }
                    }
                    flag=0;
                }
            }
        });
        jf.add(reset);
        xjl.setText("XWINS: ");
        ojl.setText("O WINS:");
        String str= "THIS GAME IS DEVELOPED BY ANAND, THIS IS SIMPLE TIC TAC TOE \n 1)THERE ARE TWO PLAYERS X AND O"
                + "\n 2)IF WE PRESS THE BUTTON, WE GET X OR O DEPENDING ON PREVIOUS ACTION"
                + "\n 3) IF X IS PRINTED 3 TIMES IN A ROW IN ANY DIRECTION, X IS WINNER, SAME FOR 0";
        tf= new JTextArea();
        tf.setText(str);
        tf.setEditable(false);
        jf.add(tf);
        jf.setDefaultCloseOperation(jf.EXIT_ON_CLOSE);
    }

    public static void main(String args[]) {
        TicTacToe tt= new TicTacToe();
        tt.selectGame();


    }

    public void help() {
        JOptionPane.showMessageDialog(jf, tf);
    }
    public void winLogic() {


        boolean xwc1= jb[0][0].getText().equals("X")&&jb[1][1].getText().equals("X")&&jb[2][2].getText().equals("X")
                ?true:false;
        boolean xwc2=jb[0][2].getText().equals("X")&&jb[1][1].getText().equals("X")&&jb[2][0].getText().equals("X")
                ?true:false;
        boolean xwc3=jb[0][0].getText().equals("X")&&jb[1][0].getText().equals("X")&&jb[2][0].getText().equals("X")
                ?true:false;
        boolean xwc4=jb[0][0].getText().equals("X")&&jb[0][1].getText().equals("X")&&jb[0][2].getText().equals("X")
                ?true:false;
        boolean xwc5=jb[0][1].getText().equals("X")&&jb[1][1].getText().equals("X")&&jb[2][1].getText().equals("X")
                ?true:false;
        boolean xwc6=jb[0][2].getText().equals("X")&&jb[1][2].getText().equals("X")&&jb[2][2].getText().equals("X")
                ?true:false;
        boolean xwc7= jb[1][0].getText().equals("X")&&jb[1][1].getText().equals("X")&&jb[1][2].getText().equals("X")
                ?true:false;
        boolean xwc8=jb[2][0].getText().equals("X")&&jb[2][1].getText().equals("X")&&jb[2][2].getText().equals("X")
                ?true:false;


        boolean owc1= jb[0][0].getText().equals("O")&&jb[1][1].getText().equals("O")&&jb[2][2].getText().equals("O")
                ?true:false;
        boolean owc2=jb[0][2].getText().equals("O")&&jb[1][1].getText().equals("O")&&jb[2][0].getText().equals("O")
                ?true:false;
        boolean owc3=jb[0][0].getText().equals("O")&&jb[1][0].getText().equals("O")&&jb[2][0].getText().equals("O")
                ?true:false;
        boolean owc4=jb[0][0].getText().equals("O")&&jb[0][1].getText().equals("O")&&jb[0][2].getText().equals("O")
                ?true:false;
        boolean owc5=jb[0][1].getText().equals("O")&&jb[1][1].getText().equals("O")&&jb[2][1].getText().equals("O")
                ?true:false;
        boolean owc6=jb[0][2].getText().equals("O")&&jb[1][2].getText().equals("O")&&jb[2][2].getText().equals("O")
                ?true:false;
        boolean owc7= jb[1][0].getText().equals("O")&&jb[1][1].getText().equals("O")&&jb[1][2].getText().equals("O")
                ?true:false;
        boolean owc8=jb[2][0].getText().equals("O")&&jb[2][1].getText().equals("O")&&jb[2][2].getText().equals("O")
                ?true:false;
        boolean xw=xwc1||xwc2||xwc3||xwc4||xwc5||xwc6||xwc7||xwc8;
        boolean ow=owc1||owc2||owc3||owc4||owc5||owc6||owc7||owc8;
        if(flag!=2) {
            if(xwc1||xwc2||xwc3||xwc4||xwc5||xwc6||xwc7||xwc8) {
                JOptionPane.showMessageDialog(jf, "X WON...");
                xScore++;
                xwin.setText(""+xScore);
                flag=2;

            }
            else if(owc1||owc2||owc3||owc4||owc5||owc6||owc7||owc8) {
                JOptionPane.showMessageDialog(jf, "O WON...");
                oScore++;
                owin.setText(""+oScore);
                flag=2;
            }
        }
        int num=0;
        int X= xw?0:1;
        int O= ow?0:1;
        for(int i=0; i<3;i ++) {
            for(int j=0;j<3;j++) {
                if(!jb[i][j].getText().equals(" "))
                    num++;
            }
        }
        if((num==9)&&((X==1)&&(O==1))) {
            JOptionPane.showMessageDialog(jf, "DRAW");
            flag=2;

        }
    }
    @Override
    public void actionPerformed(ActionEvent e) {


        for(int i=0; i<3; i++) {
            for(int j=0 ;j<3; j++) {


                if(e.getSource()==jb[i][j]) {
                    if(jb[i][j].getText().equals(" ")) {
                        if(flag==0) {
                            jb[i][j].setText("X");
                            flag=1;

                        }
                        else if(flag==1){
                            jb[i][j].setText("O");
                            flag=0;
                        }
                        else if(flag==2) {
                            JOptionPane.showMessageDialog(jf, "This game is already over, please click reset!");
                        }
                    } else {
                        ;
                    }
                }
            }

        }
        winLogic();
    }


}