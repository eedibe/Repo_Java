package HomeWork;

public class AppMidTerm {


    public static void main(String[] args) {

        MidTerm a1 = new MidTerm();

        int speed = 85;
        int pointsleft = a1.checkPoints(speed);
        if(a1.hasLicense())
            System.out.println("You still have "+ pointsleft+ " points " );
        else
            System.out.println("you lost your license");


        int [] array = {32, 14, 24, 98, 24, 56, 148, 24, 78};
        System.out.print("Old array is: ");
        for(int i = 0;i<array.length;i++){
            System.out.print(array[i] + ",");
        }
        System.out.println("");

        int numb = 24;
        int[] newarray = a1.removeNumber(numb,array);

        System.out.print("New array is: ");
        for(int i = 0;i<newarray.length;i++){
            System.out.print(newarray[i] + ",");
        }

        int [] number = {1,3,5,4,2,7};
        a1.getSmallestNumber(number);
        System.out.println("\nSmallest missing number in array is: "+a1.getSmallestNumber(number));



    }

    }

