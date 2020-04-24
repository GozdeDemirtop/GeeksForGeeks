import java.util.Scanner;

public class GCDOfTwoNumbers {
    public static int gcd(int a, int b){

        if(b==0) {
            return a;
        }
        return gcd(b, a%b);

        //OR

        /*if(a==0){
            return  b;
        }

        if(b==0){
            return a;
        }

        if(a>b){
            return gcd(a-b,b);
        }
        return gcd(a, b-a);*/
    }

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int num1 = input.nextInt();
        System.out.print("Enter the second number: ");
        int num2 = input.nextInt();

        System.out.println(gcd(num1,num2));

    }
}
