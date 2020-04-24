import java.util.Scanner;

public class LCMOfTwoNumbers {

    //a*b = LCM(a,b) * GCD(a,b)
    //LCM(a,b) = (a*b) / GCD(a,b)

    public static int gcd(int a, int b){
        if(b==0) {
            return a;
        }
        return gcd(b, a%b);
    }

    public static int lcm(int a, int b){

        return (a*b) / gcd(a,b);

    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int num1 = input.nextInt();

        System.out.print("Enter the second number: ");
        int num2 = input.nextInt();

        System.out.println("LCM("+ num1+ "," + num2+ ")=" + lcm(num1,num2));
    }
}
