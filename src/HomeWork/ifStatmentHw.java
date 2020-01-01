package HomeWork;

import java.util.Scanner;

public class ifStatmentHw {
    public static void main(String[] args) {
        //1. If all guests are vegan server vegan menu, and if one guest is vegan server combo menu
        // otherwise serve regular menu
        boolean isGuestOneVegan = true;
        boolean isGuestTwoVegan = true;

        if (isGuestOneVegan && isGuestTwoVegan) {
            System.out.println(" Here is our vegan menu");
        } else if (isGuestOneVegan == true || isGuestTwoVegan == true)  {
            System.out.println("Here is our combo menu");
        } else {
            System.out.println("Here is our regular menu");
        }

        //2. Checking car mode;
        char mode = 'R';
        String parking = "parallel";
        // if car mode is P and parking is parallel you can park car
        if (mode == 'P' && parking == "parallel") {
            System.out.println("I can park between two cars");
            // if car mode is D drive car and and you can switch type
        } else if (mode == 'D') {
            System.out.println("I can put drive type to snow type, sport type or regular type");
            // if car mode is N you can put car in car wash
        } else if (mode == 'N') {
            System.out.println("I can put car in car wash station");
            //if car mode is R you can revere the car
        } else if (mode == 'R') {
            System.out.println("I can only reverse the car and car will activate camera");
            //if mode is incorrect
        } else {
            System.out.println("Invalid mode type");
        }

        //3. store variable
        int num = 95;
        int remainder = num % 15;
        //If there the remainder  is 0 printout divisible by 15 otherwise print out the remainder
        if (remainder == 0){
            System.out.println("Divisible by 15");
        } else{
            System.out.println("Remainder when you divide "+ num + " by 15 is: " + remainder);
        }

        //4. Store your name if name length is greater than 8
        String myName = "Eva Edibe";
        //count the lenght of myName
        int count = myName.toCharArray().length;
        //if name lenght is greater than 8 replace 'a' with 'A' otherwise display name in uppercase
        if (count > 8) {
            System.out.println(myName.replace("a", "A"));
        } else {
            System.out.println(myName.toUpperCase());
        }

        //5. calculate the average of 5 values.
        int[] value = new int[5];
        value[0] = 5;
        value[1] = 10;
        value[2] = 15;
        value[3] = 20;
        value[4] = 25;


        int average = (value[0] + value[1] + value[2] + value[3] + value[4]) / 5;
        //if the average is bigger 25 display  values from first index to last index
        if (average > 25) {
            System.out.println("Stored numbers are greater than 25: " + String.valueOf(value[0])+ "," + String.valueOf(value[1]) + "," + String.valueOf(value[2]) +
                    String.valueOf(value[3]) + "," + String.valueOf(value[4]));
        } else {
            //if the average less than 25 display values order from the last index to first index
            System.out.println("Stored numbers are less than 25: " + String.valueOf(value[4]) + ","+ String.valueOf(value[3]) + ","+ String.valueOf(value[2]) + ","+
                    String.valueOf(value[1]) +","+ String.valueOf(value[0]));
        }
        //6.Create a supermartket item finder
        String item;
        System.out.println("Enter your item: ");
        Scanner itemInput = new Scanner(System.in);
        item = itemInput.nextLine();

        switch (item.toLowerCase()) {
            case "milk":
            case "eggs":
            case "donut":
                System.out.println("Aisle Eight");
                break;
            case "french Fries":
            case "frozen Pizza":
                System.out.println("Aisle Seven");
                break;
            case "candy":
                System.out.println("Aisle Three");
                break;
            case "apple":
            case "orange":
                System.out.println("Aisle Two");
                break;
            case "diapers":
                System.out.println("Aisle One");
                break;
            default:
                System.out.println("Item out of stock");
        }

    }
}
