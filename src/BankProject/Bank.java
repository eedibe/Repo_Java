package BankProject;

import ClassWork.GroupAccount;

import java.util.ArrayList;

public class Bank {

    public static void main(String[] args) {


        UserIDManager manager = new UserIDManager();

        Customer customer1 = null;
        Customer customer2 = null;
        Customer customer3 = null;


        Boolean userNameValid = manager.addUserName("evae");
        if (userNameValid) {
            Boolean passwordValid = manager.createPassword("Evae", "abc123a1");
            if (passwordValid) {
                customer1 = new Customer("Eva", "Edibe", "Evae");
                customer1.addAccount(1000);
                System.out.println("*****************************************************************");
            }

        }
        Boolean userNameValid2 = manager.addUserName("fhje");
        if (userNameValid2) {
            Boolean passwordValid = manager.createPassword("Fhje", "JV1234567");
            if (passwordValid) {
                customer2 = new Customer("anna", "smith", "fhje");
                customer2.addAccount(500);
                Account account2 = customer2.getAccount();
                account2.deposit(300);
                account2.withdraw(200);
                System.out.println("*****************************************************************");
            }


        }

        Boolean userNameValid3 = manager.addUserName("fhje");
        if (userNameValid3) {
            Boolean passwordValid = manager.createPassword("Fhje", "JV1234567");
            if (passwordValid) {
                customer3 = new Customer("anna", "smith", "fhje");
                customer3.addAccount(300);
                System.out.println("*****************************************************************");
            }


        }


    }
}


