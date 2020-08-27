package Piciorus.Ovidiu.Lab6.ex1;

import java.util.*;

public class BankAccount implements Comparator<BankAccount>, Comparable<BankAccount> {
    private String owner;
    private double balance;

    public void withdraw(double amount) {
        this.balance -= amount;
    }

    public void deposit(double amount) {
        this.balance += amount;
    }

    public BankAccount() {
    }

    public BankAccount(String owner, double balance) {
        this.owner = owner;
        this.balance = balance;
    }

    public String getOwner() {
        return owner;
    }

    public double getBalance() {
        return balance;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || !(o instanceof BankAccount))
            return false;
        BankAccount obj = (BankAccount) o;
        return (this.owner.equals(obj.owner)) && (this.balance == obj.balance);
    }

    @Override
    public int hashCode() {
        return owner.hashCode() + (int) balance;
    }

    @Override
    public String toString() {
        return "BankAccount{" +
                "owner='" + owner + '\'' +
                ", balance=" + balance +
                "} \n";
    }

    @Override
    public int compareTo(BankAccount o) {
        return (this.owner).compareTo(o.owner);
    }

    @Override
    public int compare(BankAccount o1, BankAccount o2) {
        return (int) (o1.balance - o2.balance);
    }
}
