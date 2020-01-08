package HomeWork;

import java.util.Scanner;

public class LessonHomework107ValidationUserAccount {

        public static void main(String[] args) {


            Scanner scan = new Scanner(System.in);
            System.out.println("Please enter username:");
            //Enter user name, input from console. Storing value in userName variable
            String enterUserName = scan.nextLine();
            //setting expected user name which is associated with user accounthlh
            String activeUserName = "eedibe";
            //Tell user to enter password
            System.out.println("Please enter your password");
            //takes input from console and storing the value into actualPassword variable
            String enterPassword = scan.nextLine();
            //setting expected password which is associated with user account details in database
            String activePassword = "technosoft";


            //Creating for loop to give user max tries to enter valid password and log the user to system if
            //correct password is entered
            for (int i = 0; i < 5; i++) {
                //if user enters correct user name and password, then let user enter into the home page
                if (enterUserName.equalsIgnoreCase(activeUserName) && enterPassword.equals(activePassword)) {
                    System.out.println("Welcome to home page");
                    break;
                // checking if active username and activepassword is not equal to entered username and entered password
                } else if (!enterUserName.equalsIgnoreCase(activeUserName) || !enterPassword.equals(activePassword)) {
                    //subtracting the count by iteration so user will have less tries (-1 every miss tries)
                    int count = 5 - i;

                    //console message to user to enter valid password
                    System.out.println("Please enter the valid username and password");
                    //console message to let user know how many more tries he has left with
                    System.out.println("You have " + count + " more tries");
                    //console message to enter new username
                    System.out.println("username:" );
                    enterUserName = scan.nextLine();
                    //console message to enter new password
                    System.out.println("password:");
                    enterPassword  = scan.nextLine();
                    //if count equals to 4, then notifying user with custom message
                    if (i == 4) {
                        System.out.println("Your account will be locked for 10 min");
                    }


                }
            }
        }
    }
/**
 * Test Cases
 * 1. Verify username & password is correct scenario
 * 2. verify if username is correct and password is incorrect
 * 3. verify that user name is incorrect and password is correct
 * 4. verify that username is incorrect and password is incorrect
 * 5. verify that user can have 5 tries to login to the account,  before the account gets locked
 * 6. verify that after 2nd or 3rd fail to login when the user enters correct login info is logged into Home page
 * 7. verify that account gets locked for 10 min after trying 5 times to login to account
 *
 */