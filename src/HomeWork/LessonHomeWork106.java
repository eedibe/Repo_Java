package HomeWork;

public class LessonHomeWork106 {
    public static void main(String[] args) {

        //1.Students score, total possible score
        //Setting score and max score
        int score = 17;
        int maxScore = 20;
        //Calculating score to find out percentage
        int percent = (score * 100) / maxScore;
        // checking for grade and percentile
        // A 90-100, B 80-89, C 70-79, D 60-69, F 0-59
        if (percent < 60) {
            System.out.println("You got F " + "(" + percent + "%)");
        } else if (percent >= 60 && percent <= 69) {
            System.out.println("You got D " + "(" + percent + "%)");
        } else if (percent >= 70 && percent <= 79) {
            System.out.println("You got C " + "(" + percent + "%)");
        } else if (percent >= 80 && percent <= 89) {
            System.out.println("You got B " + "(" + percent + "%)");
        } else {
            System.out.println("You got A " + "(" + percent + "%)");
        }

        //2. Write a logic that prints multipication table of user provided number up to ten.
        int num = 8;
        for (int i = 1; i <= 10; i++) {
            System.out.println(num + " * " + i + " = " + (num * i));
        }

        //3.Prime numbers if remainder is 0 the number is not prime
        int num2 = 11;
        int remainder;
        boolean isprime = true;

        for (int i = 2; i < (num2-1); i++) {
            //calculate number
            remainder = num2 % i;
            //checking for remainder
            if (remainder == 0) {
                isprime = false;
            }
        }
        if (isprime) {
            System.out.println(num2 + " is prime number");
        } else {
            System.out.println(num2 + " is not prime number");
        }

    }
}

