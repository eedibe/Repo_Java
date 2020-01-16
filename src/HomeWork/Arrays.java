package HomeWork;


public class Arrays {
    public static void main(String[] args) {
        ArraysManipulator a1 = new ArraysManipulator();
        String str = " Sample";
        System.out.println("Answer to question number 1: " + a1.getReversedString(str));

        int[] nums2 = {29, 25, 27, 40};
        ArraysManipulator a2 = new ArraysManipulator();
        int[] resultArr = a2.getReversedArrays(nums2);
        System.out.print("Answer to question number 2: ");
        a2.printArray(resultArr);


        System.out.println("");

        int[] nums3 = {20, 25, 30, 40};
        ArraysManipulator a3 = new ArraysManipulator();
        System.out.println("Answer to question number 3: " + a3.getSumOfArrays(nums3));


        int[] nums4 = {20, 25, 30, 40};
        String answer = "Not working, I will keep on trying....";
        ArraysManipulator a4 = new ArraysManipulator();
        System.out.println("Answer to question number 4: " + answer);

        ArraysManipulator a5 = new ArraysManipulator();
        double[] nums5 = {20, 20, 20, 20};
        System.out.println("Answer to question number 5: " + a5.getArrayAverage(nums5));


        int[] nums6 = {10, 10, 40, 44, 32};
        ArraysManipulator a6 = new ArraysManipulator();
        System.out.println("Answer to question number 6: " + a6.getMaxNumber(nums6));

        int[] nums7 = {2, 20, 10, 40, 44};
        ArraysManipulator a7 = new ArraysManipulator();
        System.out.println("Answer to question number 7: " + a7.getMinNumber(nums7));

        double[] grades = {90, 89, 91, 67, 87, 88, 93, 90, 100, 81, 54};
        String[] names = {"Happ", "Peace", "Jesse", "Kaitlin", "Amir", "Donald", "Steven", "Vicky", "Hannah", "David", "Gia"};
        ArraysManipulator a10 = new ArraysManipulator();
        System.out.println("Answer to question number 10 :" + a10.getStudentWithMaxGrade(grades, names));

        int nums11 = 5;
        ArraysManipulator a11 = new ArraysManipulator();
        System.out.println("Answer to question number 11: " + a11.getAddedNumbes(nums11));


    }
}
