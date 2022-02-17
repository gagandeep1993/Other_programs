package ExceptionHandling;

import java.util.Locale;

public class Exception_Demo3
{
    public static void main(String[] args)
    {

        try
        {
            int a = 2 / 0;


        }
        catch(ArithmeticException e)
        {
            System.out.println("sorry you can not divide it by ZERO");
        }
        try
        {
            String s=null;
            s.toLowerCase();
        }
        catch(NullPointerException a)
        {
            System.out.println("Try to lowercase the blank entry");
        }
        catch(NumberFormatException e)
        {
            System.out.println();
        }
        catch(Exception ee)
        {
            
        }
        finally
        {
            System.out.println("essential part");
        }


    }

}
