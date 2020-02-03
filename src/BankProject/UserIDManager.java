package BankProject;


import java.util.ArrayList;
import java.util.LinkedList;
import java.util.*;

public class UserIDManager {

    private static String[] userNames = null;


    public static String[] addToArray(String name) {
        int n;
        if (userNames == null) {
            String[] newArray = new String[1];
            newArray[0] = name;
            return newArray;
        } else
            n = userNames.length;
        String[] newArray = new String[n + 1];
        for (int i = 0; i < n; i++) {
            newArray[i] = userNames[i];
            newArray[n] = name;
        }
        return newArray;
    }


    public static boolean addUserName(String userName) {

        if (userName.length() < 3) {
            System.out.println("Invalid user name, username must be at leat 3 character long.");
            return false;
        }
        if (userNames != null) {
            for (String element : userNames) {
                if (element.equals(userName)) {
                    System.out.println("This username already exist, please choose different username");
                    return false;
                }
            }
        }
        userNames = addToArray(userName);

        return true;
    }


    public boolean createPassword(String userName, String password) {

        boolean valid = true;
        if (password.length() < 8) {
            System.out.println("A password must have at least eight characters..");
            valid = false;
        }
        if (!(password.matches("[a-zA-Z]+")) && password.matches("[0-9]+")) {
            System.out.println("A password consists of only letters and digits.");
            valid = false;
        }
        if (password.equals(userName)) {
            System.out.println("Password can not be same as username, please change your password.");
            valid = false;
        }
        if (valid) {

        }
        return valid;
    }

}
