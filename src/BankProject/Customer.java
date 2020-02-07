package BankProject;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;

public class Customer {
    private String firstName;
    private String lastName;
    private Account account;

    static UserIDManager manager = new UserIDManager();

    public Customer(String firstName, String lastName, String userName, String password) {
        this.firstName = firstName;
        this.lastName = lastName;
        if (manager.addUserName(userName) && manager.createPassword(userName, password)) {
            System.out.println("Username " + userName + " has been added to account.");
        }

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
        System.out.println("Balance: " + account.getBalance());

    }

    public Account getAccount() {
        return account;
    }

 public void deleteUserName(String userName){
        boolean deleted = manager.deleteAccount(userName);
     if(deleted)
         System.out.println("Username "+userName+ " has been deleted");
     else
         System.out.println("Username " + userName+ " doesn't  exists");
 }



}
