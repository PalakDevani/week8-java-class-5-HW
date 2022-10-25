package java_week8_homework;
/*The method needs to find the first and the last digit of the parameter number passed to the method,
using a loop and return the sum of the first and the last digit of that number.
If the number is negative then the method needs to return -1 to indicate an invalid value.
*/


import java.util.Scanner;

public class FirstAndLastDigitSum {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number: "); // taking a number input from user
        int number = scan.nextInt();
        int temp = number; // storing the number value in a temporary variable called 'temp'
        int firstDigit = 0;
        int lastDigit = 0; // declaring two integer variable and initialising both with value as 0

        lastDigit = number % 10; // find last digit of number

        while (number != 0) {//continue the loop till the number becomes 0; inside loop variable firstDigit will give the first digit at the end of while loop
            int rem = number % 10;
            firstDigit = rem;
            number = number / 10;
        }
        System.out.println("Number is: " + temp);
        System.out.println("First digit of number: " + firstDigit);
        System.out.println("Last digit of number: " + lastDigit);
        System.out.println("Sum of first and last digit of number: " + (firstDigit + lastDigit));
        scan.close();
    }
}

// ref: https://btechgeeks.com/java-program-to-find-sum-of-first-and-last-digit-of-a-number/