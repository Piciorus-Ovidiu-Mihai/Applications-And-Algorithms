package Piciorus.Ovidiu.Lab6.ex2;


import Piciorus.Ovidiu.Lab6.ex1.BankAccount;

import java.util.*;

public class Bank {
    private List<BankAccount> accounts = new ArrayList<>();

    public void addAccount(String owner, double balance) {
        BankAccount var = new BankAccount(owner, balance);
        accounts.add(var);

    }

    public void printAccounts() {
        Collections.sort(accounts, new BankAccount());
        for (BankAccount i : accounts
        ) {
            System.out.println(i.toString());
            int n = accounts.size();
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
        Collections.sort(accounts);
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
        BankAccount nul = new BankAccount("False", 0);

        return nul;
    }
}
