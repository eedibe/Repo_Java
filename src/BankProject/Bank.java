package BankProject;

import ClassWork.GroupAccount;

import java.util.ArrayList;

public class Bank {

    public static void main(String[] args) {

        //Execute code
        Customer customer1 = new Customer("Marta", "Smith","martasmith","moll65545");
       Customer customer2 = new Customer("Jerry", "Doe","jdj","avc665545");
   //  Customer customer3 = new Customer("Ewa", "Smith","eve","kkkc34555");
       //Customer customer4 = new Customer("Peter", "Broker","pbroker","123");

        customer1.deleteUserName("martasmith");


    }
}








