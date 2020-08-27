package Piciorus.Ovidiu.Lab6.ex3;

import Piciorus.Ovidiu.Lab6.ex1.BankAccount;

import java.util.TreeSet;

public class Bank {
    private TreeSet<BankAccount> accounts;

    public void addAccount(String owner, double balance) {
        BankAccount var = new BankAccount(owner, balance);
        accounts.add(var);

    }

    public void printAccounts() {

        for (BankAccount i : accounts
        ) {
            System.out.println(i.toString());
        }
    }

    public void printAccounts(double bmin, double bmax) {
        for (BankAccount i : accounts
        ) {
            if (i.getBalance() > bmin && i.getBalance() < bmax) {
                System.out.println(i.toString());
            }
        }
    }

    public BankAccount getAccount(String owner) {
        for (BankAccount j : accounts
        ) {
            System.out.println(j.toString());
        }
        for (BankAccount i : accounts
        ) {
            if (i.getOwner().equals(owner)) {
                return i;
            }
        }
        BankAccount nul = new BankAccount("invalid", 0);

        return nul;
    }
}
