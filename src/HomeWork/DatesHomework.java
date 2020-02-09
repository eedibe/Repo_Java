package HomeWork;
import java.text.SimpleDateFormat;
import  java.util.Date;
public class DatesHomework {

    public static void main(String[] args) {

        /**
         * Homework:
         * 1. Convert this date into string format "Fri, June 7 2013"
         * 2. Convert this date into string format "Friday, Jun 7, 2013 12:10:56 PM"
         *
         */

        Date date = new Date();
        SimpleDateFormat simpleFormat = new SimpleDateFormat("EEE, MMM d yyyy");
        String dateFormat = simpleFormat.format(date);
        System.out.println("Today's date is: " +dateFormat);


        Date date1 = new Date();
        SimpleDateFormat simpleFormat1 = new SimpleDateFormat("EEEEEE, MMM d yyyy HH:mm:ss a");
        String dateFormat1 = simpleFormat1.format(date1);
        System.out.println("Today's date is: " +dateFormat1);



    }
}
