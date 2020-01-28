package HomeWork;

import java.util.Arrays;
public class AppPrinter {
    public static void main(String[] args) {

        PrinterTemplate p = new PrinterTemplate();


        p.checkLevelOfToner();
        p.printPages(60,true);

        p.printPages(20,false);
        p.checkLevelOfToner();
        p.checkNumberofPagesPrinted();





    }
}
