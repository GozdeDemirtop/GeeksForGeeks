import java.util.Scanner;

public class GCDEuclideanAlgorithm {

    public static int gcd(int a, int b){

        if(a>b){
            int temp=a;
            a=b;
            b=temp;
        }

        if(a==0){
            return b;
        }

        return gcd(b%a, a) ;
    }

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int num1 = input.nextInt();
        System.out.println("Enter the second number: ");
        int num2 = input.nextInt();


        System.out.println("GCD(" + num1 +","+ num2 + ")=" + gcd(num1,num2) );
    }
}
