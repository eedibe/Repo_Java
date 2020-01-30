package BankProject;

import java.util.ArrayList;

public class Customer {
    private String firstName;
    private String lastName;
    private Account account;
    private String username;

    public Customer(String firstName, String lastName, String username) {
        this.firstName = firstName;
        this.lastName = lastName;
    }
    public void addAccount(double initialBalance) {
        account = new Account(initialBalance);
        account.setAccountId(Account.getNextId());
        customerDetails();

    }
    private void customerDetails() {
        account.displayAccountDetails();
        System.out.println("First Name: " + firstName);
        System.out.println("Last Name: " + lastName);
        System.out.println("Balance: "+account.getBalance());

    }
    public Account getAccount(){
        return account;
    }

    public void deleteAccount(String accountId){
        account = null;
    }
}
