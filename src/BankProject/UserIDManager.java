package BankProject;


import java.util.ArrayList;

public class UserIDManager {

    ArrayList<String> usersNameList = new ArrayList();

    public boolean addUserName(String userName) {

        userName = userName.toLowerCase();
        if (userName.length() < 3) {
            System.out.println("Invalid user name, username must be at leat 3 character long.");
            return false;
        } else if (usersNameList.contains(userName)) {
            System.out.println("This username already exist, please choose different username");
            return false;
        } else
            usersNameList.add(userName);
      //  System.out.println("Username '" + userName + "' has been created.");
        return true;
    }

    public boolean createPassword( String userName, String password) {


        boolean valid = true;
        if (password.length() < 8) {
            System.out.println("password length minimum 8 character ");
            valid = false;
        }
        if (!(password.matches("[a-zA-Z]+"))&& password.matches("[0-9]+")){
            System.out.println(" you must have an alpha numaric value:");
            valid = false;
        }
        if (password.equals(userName)) {
            System.out.println("Password can not be same as username, please change your password.");
            valid = false;
        }
        if (valid) {
          //  System.out.println("password is valid");
        }
        return valid;
    }

    public void removeUser(String userName) {
        usersNameList.remove(userName);
    }
}
