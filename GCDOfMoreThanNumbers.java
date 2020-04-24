import java.lang.reflect.Array;
import java.util.Scanner;

public class GCDOfMoreThanNumbers {

    //Function to find gcd of two numbers

    static int gcd(int a, int b)
    {
        if(b==0) {
            return a;
        }
        return gcd(b, a%b);
    }

    // Function to find gcd of array of numbers

    static int findGCD(int arr[], int n)
    {
        int result = arr[0];
        for (int i = 1; i < n; i++){
            result = gcd(arr[i], result);

            if(result == 1)
            {
                return 1;
            }
        }

        return result;
    }

    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter length of array: ");
        int num = input.nextInt();

        System.out.print("Enter the all elements of array: ");
        int arr[] = new int[num];
        for (int i = 0; i <num ; i++) {
            arr[i] = input.nextInt();
        }
        System.out.print(findGCD(arr,num));
    }
}

