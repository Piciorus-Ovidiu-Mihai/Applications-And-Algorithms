package Piciorus.Ovidiu.Lab6.ex2;

import Piciorus.Ovidiu.Lab6.ex1.BankAccount;

public class Main {
    public static void main(String[] args) {
        Bank bankAccount = new Bank();
        bankAccount.addAccount("ovasd", 30332);
        bankAccount.addAccount("guista", 210);
        bankAccount.addAccount("mami", 420);
        bankAccount.addAccount("Ovi", 455514);
        bankAccount.addAccount("ovidel", 121231);
        bankAccount.addAccount("stole", 41324);
        bankAccount.addAccount("simi", 421143);
        bankAccount.addAccount("vlad", 231);

        bankAccount.printAccounts();
        System.out.println("------------------------------------");
        bankAccount.printAccounts(1000, 4000);
        System.out.println("------------------------------------");
        BankAccount ovi = bankAccount.getAccount("Ovi");
        System.out.println("------------------------------------");
        System.out.println(ovi.toString());
        System.out.println("------------------------------------");

    }
}
