package HomeWork;

public class StringH {
    public static void main(String[] args) {

        String myStatment = "I am a good programmer";
        System.out.println(myStatment.substring(12));

        String[] words = myStatment.split(" ");
        System.out.println(words.length);

        System.out.println(myStatment.replace("r","f"));

        String myName = "Eva";
        System.out.println(myName.indexOf('a')+1);

        String[] names = {"Mohammand", "John","Ferdous","Abul","Ratna", "Mareeha","Ruslan","Himani"};
        System.out.println(names[1].equals("John"));

        String[] myColleagues = new String[5];
        myColleagues[0]  = "Irena";
        myColleagues[1]  = "Halina";
        myColleagues[2]  = "Maria";
        myColleagues[3]  = "Kim";
        myColleagues[4]  = "Dana";

        int sizeMyColleagues = myColleagues.length;
        System.out.println(sizeMyColleagues);
        System.out.println(myColleagues[2]);

        System.out.println(myColleagues[0]);
        System.out.println(myColleagues[1]);
        System.out.println(myColleagues[2]);
        System.out.println(myColleagues[3]);
        System.out.println(myColleagues[4]);

        boolean name_check = myColleagues[2].startsWith("A");
        System.out.println(name_check);
    }
}
