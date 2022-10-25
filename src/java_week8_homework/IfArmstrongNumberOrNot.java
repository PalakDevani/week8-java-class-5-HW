package java_week8_homework;
// 10.	Write a program to input any number and check if it Armstrong number or not

import java.util.Scanner;

public class IfArmstrongNumberOrNot {
    public static void main(String[] args) {
        int num, number, temp, total = 0;
        System.out.println("Enter Number");
        Scanner scan = new Scanner(System.in);
        num = scan.nextInt();
        scan.close();
        number = num;
        for (; number != 0; number /= 10) {
            temp = number % 10;
            total = total + temp * temp * temp;
        }
        if (total == num)
            System.out.println(num + " is an Armstrong number");
        else
            System.out.println(num + " is not an Armstrong number");

    }


}

// ref: https://beginnersbook.com/2017/09/java-program-to-check-armstrong-number/
