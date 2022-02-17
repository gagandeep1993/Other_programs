//program to calculate sum of two numbers using scanner class
import java.util.Scanner;
public class Sum {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int a, b, res;

        System.out.println("Enter first number");
        a = obj.nextInt();

        System.out.println("Enter second num");
        b = obj.nextInt();

        res = a + b;
        System.out.println("Sum of two num is " + res);
    }
}

