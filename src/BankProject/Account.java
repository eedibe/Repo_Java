package BankProject;

import java.util.Date;

public class Account {
    private double balance;
    private String accountId;
    private static int NEXTID = 0;
    public static final int ROUTING_NUMBER = 12345;

    Date date = new Date();

    public Account(double initialBalance) {
        balance = initialBalance;
    }


    public void deposit(double amount) {
        balance = balance + amount;
        System.out.println("Deposited " + "$" + amount + " on " + date);
    }

    public void withdraw(double amount) {
        if (amount > balance) {
            System.out.println("You cannot withdrow money. Insufficient funds in your account. " + "on " + date);
        } else
            System.out.println("$" + amount + " withdraw from your account " + "on " + date);
        balance = balance - amount;


    }


    public double getBalance() {
        if (balance <= 0) {
            return 0;
        }
       // System.out.println("Balance on your account is " + balance + " " + date);
        return balance;
    }

    public void displayAccountDetails() {
        System.out.println("****************** Account Information **************************");
        System.out.println("ID: " + accountId);
        System.out.println("Routing Number " + ROUTING_NUMBER);
       // System.out.println("Balance: " + balance);


    }

    public void setAccountId(String accountId) {

        this.accountId = accountId;
    }

    public static String getNextId() {
        return "ACCT# " + Account.NEXTID++;
    }


}
