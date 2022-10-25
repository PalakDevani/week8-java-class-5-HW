package java_week8_homework;
/*8.	Display right angle triangle of @ using nested for loops
	 	@
	 	@@
	 	@@@
	 	@@@@
	 	@@@@@
*/


public class RightAngleTriangleUsingNestedForLoop {
    public static void rightTriangle(int n) { // function to demo. printing pattern
        int a, b;
        for (a = 0; a < n; a++) { // outer loop to handle number of rows, here its 'k'
            for (b = 0; b <= a; b++) {    // inner loop to handle number of columns; values changing acc. to outer loop
                System.out.print("@ ");
            }
            System.out.println(); // end  line
        }

    }

    public static void main(String[] args) {
        int k = 10;
        rightTriangle(k);
    }

}


// ref:  https://www.geeksforgeeks.org/java-program-to-print-right-triangle-star-pattern/