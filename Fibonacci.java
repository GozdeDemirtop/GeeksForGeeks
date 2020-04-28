import java.util.Scanner;

public class Fibonacci {

    //Simple Recursive Algorithms
    public  static int fibonacci (int n) {
        if(n <= 0) {
            return 0;
        }
        else if(n == 1) {
            return 1;
        }
        else {
            return fibonacci (n-1) + fibonacci (n-2);
        }
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = input.nextInt();
        System.out.println(fibonacci(n));
    }

}
