package java_week8_homework;
/* Write the following programme
1. Read 10 numbers from the console entered by the user and print the sum of those numbers.
-Use the hasNextInt() method from the scanner to check if the user has entered an int value.
-If hasNextInt() returns false, print the message Invalid Number. Continue reading until you have read 10 numbers.
-Use the nextInt() method to get the number and add it to the sum.
-Before the user enters each number, print the message Enter number #x: where x represents the count, i.e. 1, 2, 3, 4, etc.
-For example, the first message printed to the user would be Enter number #1:, the next Enter number #2:, and so on.
Hint:
-Use a while loop.
-Use a counter variable for counting valid numbers.
-Close the scanner after you don't need it anymore.
-Create a class with the name ReadingUserInputChallenge.
*/

import java.util.Scanner;

public class ReadingUserInputChallenge {
    //main() method start
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int count = 1; // counter variable declaration
        int sum = 0;
        while (count <= 10) {
            System.out.println("Ener number #" + count);
            boolean validateNumber = scanner.hasNextInt();
            if (validateNumber) {
                int number = scanner.nextInt();
                sum += number;
                count++;

            } else {
                System.out.println("Invalid number");
            }
            // always return new userInput
            scanner.nextLine();
        }
        System.out.println("Sum of all numbers = " + sum);
        scanner.close();


    }


}


// ref: https://github.com/Adhouma/ReadingUserInput-challenge/blob/master/src/com/learnJava/Main.java


/*// Java program to demonstrate working of System.console()
// Note that this program does not work on IDEs as
// System.console() may require console
public class Sample {
    public static void main(String[] args)
    {
        // Using Console to input data from user
        String name = System.console().readLine();

        System.out.println("You entered string " + name);
    }
}

https://www.geeksforgeeks.org/ways-to-read-input-from-console-in-java/

 */