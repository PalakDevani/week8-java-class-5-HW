package java_week8_homework;

public class LeftAngleTriangle {
    public static void starLeftAngleTriangle(int l) {
        int x, y;
        for (x = 0; x < l; x++) { //nested 1st loop
            for (y = 2 * (l - x); y >= 0; y--) { // nested 2nd loop
                System.out.print(" ");
            }
            for (y = 0; y <= x; y++) { // nested 3rd loop
                System.out.print("* "); // printing star '*'
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int l = 7;
        starLeftAngleTriangle(l);

    }
}



//ref: https://www.geeksforgeeks.org/java-program-to-print-left-triangle-star-pattern/