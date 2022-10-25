package java_week8_homework;
// Print the sequence 1 1 2 3 5 8 13 21 (Fibonacci number)  (use  1-100 numbers)


public class FibonacciNumber {
    public static void main(String[] args) {
    int n = 100, firstTerm = 0, secondTerm = 1;
        System.out.println("Fibonacci Series Upto " + n + ": ");
        while (firstTerm<= n){
            System.out.print(firstTerm + ", ");

            int nextTerm = firstTerm + secondTerm;
            firstTerm = secondTerm;
            secondTerm= nextTerm;
        }

    }
}
// ref: https://www.programiz.com/java-programming/examples/fibonacci-series











//        Scanner scan = new Scanner(System.in); // creating object for scanner class
//        System.out.println("Enter the Nth term");// taking input of number of elements in the series
//        int n = scan.nextInt();
//        int a = 1, b = 2, count = 100;
//        System.out.print(a+" "+b);
//
//        for(int i=1; i<count; i++){
//            int c = a+b;
//            a=b;
//            b=c;
//            System.out.print(" "+c);
//        }
//        scan.close();
// ref: https://btechgeeks.com/java-program-to-print-the-fibonacci-series-1-1-2-3-5-8-13-n/#By_Using_For_Loop
