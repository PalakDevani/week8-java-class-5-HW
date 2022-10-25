package java_week8_homework;

import java.util.Scanner;

public class PalindromeNumber {
    public static boolean isPalindrome(int number) {
        int reverse = 0;
        int originalNumber = number;
        while (number != 0) {
            int lastDigit = number % 10;
            reverse = (reverse * 10) + lastDigit;
            number /= 10;

        }
        return originalNumber == reverse;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println(isPalindrome(1221));

    }
}


//https://github.com/ahmedburale/Mastering-Java-Exercises-/blob/master/NumberPalindrome.java