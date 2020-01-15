package HomeWork;

import ClassWork.ArraysManipulator;

public class Arrays {
    public static void main(String[] args) {
        ClassWork.ArraysManipulator a1 = new ClassWork.ArraysManipulator();
        String str = " Sample";
        System.out.println("Answer to question number 1: " + a1.getReversedString(str));

        int[] nums2 = {29, 25, 27, 40};
        ClassWork.ArraysManipulator a2 = new ClassWork.ArraysManipulator();
        System.out.println("Answer to question number 2: " + a2.getReversedArrays(nums2) + " I dont know how to fix this");

        int[] nums3 = {20, 25, 30, 40};
        ClassWork.ArraysManipulator a3 = new ClassWork.ArraysManipulator();
        System.out.println("Answer to question number 3: " + a3.getSumOfArrays(nums3));


        int[] nums4 = {20, 25, 30, 40};
        String answer = "Not working, I will keep on trying....";
        ClassWork.ArraysManipulator a4 = new ClassWork.ArraysManipulator();
        System.out.println("Answer to question number 4: " + answer);

        ClassWork.ArraysManipulator a5 = new ClassWork.ArraysManipulator();
        double[] nums5 = {20, 20, 20, 20};
        System.out.println("Answer to question number 5: " + a5.getArrayAverage(nums5));


        int[] nums6 = {10, 10, 40, 44, 32};
        ClassWork.ArraysManipulator a6 = new ClassWork.ArraysManipulator();
        System.out.println("Answer to question number 6: " + a6.getMaxNumber(nums6));

        int[] nums7 = {2, 20, 10, 40, 44};
        ClassWork.ArraysManipulator a7 = new ClassWork.ArraysManipulator();
        System.out.println("Answer to question number 7: " + a7.getMinNumber(nums7));

        double[] grades = {90, 89, 91, 67, 87, 88, 93, 90, 100, 81, 54};
        String[] names = {"Happ", "Peace", "Jesse", "Kaitlin", "Amir", "Donald", "Steven", "Vicky", "Hannah", "David", "Gia"};
        ClassWork.ArraysManipulator a10 = new ClassWork.ArraysManipulator();
        System.out.println("Answer to question number 10 :" + a10.getStudentWithMaxGrade(grades, names));

        int nums11 = 5;
        ClassWork.ArraysManipulator a11 = new ArraysManipulator();
        System.out.println("Answer to question number 11: " + a11.getAddedNumbes(nums11));


    }
}
