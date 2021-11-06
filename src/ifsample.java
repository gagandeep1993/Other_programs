

public class ifsample
{
    public static void main(String[] args) {
        int a = 10, b = 20, c = 30;
        if (a > b && a > c) {
            System.out.println("a is greater which is " + a);
        }
        else
        if (b > a && b > c)
        {
            System.out.println("b is greater which is " + b);
        }
        else
        {
            System.out.println("c is greater which is " + c);
        }


    }
}


