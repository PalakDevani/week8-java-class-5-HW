package java_week8_homework;
// 14.	Write a program in Java to display the pattern like a diamond.    While loop


import java.util.Scanner;

public class DiamondPatternWhileLoop {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number of rows: ");
        int n = scan.nextInt();
        System.out.println("Enter the symbol: ");
        System.out.print("");
        char c = scan.next().charAt(0);
        int i = 1;
        int j;
        while (i <= n) {
            j = 1;
            while ((j++ <= n - i)) {
                System.out.print(" ");
            }
            j = 1;
            while (j++ <= i * 2 - 1) {
                System.out.print(c);
            }
            System.out.println();
            i++;
        }
        i = n - 1;
        while (i > 0) {

            j = 1;
            while (j++ <= n - i) {
                System.out.print(" ");
            }
            j = 1;
            while (j++ <= i * 2 - 1) {
                System.out.print(c);
            }
            System.out.println();
            i--;
        }
        scan.close();
    }

}



// ref: https://www.studytonight.com/java-programs/java-program-to-print-the-diamond-pattern