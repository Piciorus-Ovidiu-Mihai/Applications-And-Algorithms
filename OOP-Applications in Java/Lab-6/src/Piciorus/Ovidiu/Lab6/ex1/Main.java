package Piciorus.Ovidiu.Lab6.ex1;

public class Main {
    public static void main(String[] args) {
        BankAccount a = new BankAccount("Ovidiu", 1000);
        BankAccount a1 = new BankAccount("Ovidiu", 1000);
        System.out.println(a.equals(a1));
        System.out.println(a.hashCode() == a1.hashCode());


    }
}
