package HomeWork;

import java.sql.SQLOutput;

public class PrinterTemplate {

    //field variables
    private int tonerLevel = 100;
    private int printerPaper = 100;
    private int totalNumberOfPagesPrinted;



    //print pages
    public int printPages(int printPage, boolean isSinglePage) {
        //check for maximum of page to be printed
        if (printPage > 100) {
            System.out.println("Maximum pages to print is 100");
            //checking if there is a paper int the printer
        } else if (printerPaper == 0) {
            System.out.println("No paper in the printer.");
            //checking for level of toner
        } else if (tonerLevel < 1) {
            System.out.println("Toner is low. Please add more toner.");
            //checking if there is enough toner to print all pages
        } else if (printPage > tonerLevel) {
            printPage = printPage - tonerLevel;
            tonerLevel = printPage - tonerLevel;
            System.out.println("Number of pages printed " + printPage + " \nPlease add more toner,not enough toner in printer.");
            //selecting single pages to be printed
        } else if (isSinglePage) {
            printerPaper = printerPaper - printPage;
            tonerLevel = tonerLevel - printPage;
            totalNumberOfPagesPrinted = totalNumberOfPagesPrinted +printPage;
            System.out.println("Number of pages printed " + printPage);
            //selecting double pages to be printed
        } else {
            printerPaper = printerPaper - (printPage / 2);
            tonerLevel = tonerLevel - printPage;
            totalNumberOfPagesPrinted= totalNumberOfPagesPrinted +(printPage/2);
            System.out.println("Number of pages printed " + printPage / 2);


        }
        return printPage;
    }
    //check for total pages were printed
    public int checkNumberofPagesPrinted(){
        System.out.println("Total number of pages printed "+ totalNumberOfPagesPrinted);
        return totalNumberOfPagesPrinted;
    }

    // check the level of toner
    public int checkLevelOfToner() {
        if (tonerLevel < 0)
            System.out.println("No toner in the printer");
        else {
            System.out.println("Level of toner is " + tonerLevel);
        }
        return tonerLevel;
    }


}
