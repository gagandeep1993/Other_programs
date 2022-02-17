
package ExceptionHandling;
import java.util.Scanner;

public class Throw_demo extends RuntimeException
{
    Throw_demo(String msg)
    {
       super(msg);
    }
}
class Voting
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter you age");
        int age = s.nextInt();
        try {
            if (age < 18)
            {
                throw new Throw_demo("you are not eligible");
            }
            else
            {
                System.out.println("yor are eligible");
            }
        } catch (Throw_demo e) {
            System.out.println(e);

        }
        System.out.println("CODE after the catch will be executed successfullu");
    }
}