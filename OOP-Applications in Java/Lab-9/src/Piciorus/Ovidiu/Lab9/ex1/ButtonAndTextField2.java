package Piciorus.Ovidiu.Lab9.ex1;


import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import java.util.*;

public class ButtonAndTextField2 extends JFrame{

    HashMap accounts = new HashMap();

    JLabel user,pwd;
    JTextField tUser,tPwd;
    JTextArea tArea;
    JButton bLoghin;

    ButtonAndTextField2(){

        accounts.put("user1", "pwd1");
        accounts.put("user2", "pwd2");
        accounts.put("user3", "pwd3");

        setTitle("Test login");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        init();
        setSize(200,300);
        setVisible(true);
    }

    public void init(){

        this.setLayout(null);
        int width=80;int height = 20;

        user = new JLabel("User ");
        user.setBounds(10, 50, width, height);

        pwd = new JLabel("Pasword ");
        pwd.setBounds(10, 100,width, height);

        tUser = new JTextField();
        tUser.setBounds(70,50,width, height);

        tPwd = new JTextField();
        tPwd.setBounds(70,100,width, height);

        bLoghin = new JButton("Loghin");
        bLoghin.setBounds(10,150,width, height);

        bLoghin.addActionListener(new TratareButonLoghin());

        tArea = new JTextArea();
        tArea.setBounds(10,180,150,80);

        add(user);add(pwd);add(tUser);add(tPwd);add(bLoghin);
        add(tArea);

    }

    public static void main(String[] args) {
        new ButtonAndTextField2();
    }

    class TratareButonLoghin implements ActionListener{

        public void actionPerformed(ActionEvent e) {

            String usr = ButtonAndTextField2.this.tUser.getText();
            String pwd = ButtonAndTextField2.this.tPwd.getText();

            if(ButtonAndTextField2.this.accounts.containsKey(usr)){
                String correctPwd = (String)ButtonAndTextField2.this.accounts.get(usr);
                if(correctPwd.equals(pwd)){
                    //user and password correct
                    ButtonAndTextField2.this.tArea.append("Valid loghin\n");
                }
                else{
                    //invalid password
                    ButtonAndTextField2.this.tArea.append("Invalid password\n");
                }
            }else{
                //user not found
                ButtonAndTextField2.this.tArea.append("User not found\n");
            }

        }
    }
}