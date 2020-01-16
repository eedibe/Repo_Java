package HomeWork;

public class ArraysManipulator {

        /*1. Reverse a string  Eg: Input to method : Sample*/
        public String getReversedString(String str) {
            String reversedStr = "";
            char[] strArr = str.toCharArray();

            for (int i = strArr.length - 1; i >= 0; i--) {
                reversedStr = reversedStr + strArr[i];
            }
            return reversedStr;
        }

        // 2. Reverse an array (fyi: length of input array can vary)
        public int[] getReversedArrays(int[] nums) {
            int[] reversedArr = new int[nums.length];
            for (int i = nums.length - 1; i >= 0; i--) {
                reversedArr[i] = nums[nums.length - 1 - i];
            }
            return reversedArr;

        }

        public void printArray(int [] arr){

            for(int i = 0; i< arr.length; i ++){
                System.out.print(arr[i]+",");
            }
        }

        /* 3. Add all numbers in a given array (fyi: length of input array can vary)*/
        public int getSumOfArrays(int[] nums) {
            int sum = 0;
            for (int i = 0; i < nums.length - 1; i++) {
                sum = sum + nums[i];
            }
            return sum;


        }
        //4.  This is what I have for sort array but it is not working for me....
        // 4. *Sort an array
        //Sorry try to solve the sort array but no success, here is what I got so far;
        /*   int[] nums4 = {20, 10,100,89,2,88,9,1, 40, 44};

            for (int i = 0; i < nums4.length - 1; i++) {
                int min = nums4[i];
               for (int j = i; j < nums4.length - 1; j++) {
                    if (nums4[j] < min) {
                        min = nums4[i];
                        nums4[i] = nums4[j];
                        nums4[i] = min;
                   }
               }
           }
           System.out.println("question number 4:");
            for(int i = 0; i< nums4.length;i++)
               System.out.print(nums4[i]+",");
               */


        //   5. Find Average of a given array
        public double getArrayAverage(double[] nums5) {
            double sums = 0;

            for (int i = 0; i <= nums5.length - 1; i++) {
                sums = sums + nums5[i];
            }
            double average = sums / nums5.length;
            return average;

        }

        /* 6. Find maximum number in given array*/
        public int getMaxNumber(int[] nums6) {
            int maxNum = nums6[0];
            for(int i = 0; i <=nums6.length -1;i++){
                if (nums6[i] > maxNum) {
                    maxNum = nums6[i];
                }
            }
            return maxNum;
        }

        /* 7. Find minimum number in given array*/
        public int getMinNumber(int[] nums7) {
            int minNum = nums7[0];
            for (int i = 0; i <= nums7.length - 1; i++) {
                if (nums7[i] < minNum) {
                    minNum = nums7[i];
                }
            }
            return minNum;
        }
        /*8. Create abbreviation for any string*/
        public String getAbbreviation(String statments) {
            String[] words = statments.split(" ");
            String abbrev = "";
            for (int i = 0; i <= words.length - 1; i++) {
                abbrev = abbrev + words[i].substring(0, 1).toUpperCase();
            }
            return abbrev;
        }
        //10.Given two arrays, one contains total marks of 11 students of a class; second array contains their names in same order as marks-array.
        public String getStudentWithMaxGrade(double [] grades, String[] names) {
            int maxindex = 0;
            double maxGrade= grades[0];
            for (int i = 0; i <= grades.length - 1; i++) {
                if (maxGrade < grades[i]) {
                    maxGrade = grades[i];
                    maxindex = i;
                }
            }
            return names[maxindex];
        }
//11.  11. Create a method to add numbers from 0 to given number, and return the result
//*    Example : addUpto(5) -> method should return 15 (bcz, 0+1+2+3+4+5 = 15)

        public int getAddedNumbes( int nums11){
            int results = 0;
            for (int i =0; i <=nums11; i++){
                results = results+i;
            }
            return results;
        }

    }



