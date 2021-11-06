package com.company;

public class Calculations
{

    public static void main(String[] args) {
        System.out.println("hello");

        int res= sum(2,4);
        int res1=mul(3,7);
        System.out.println(res);
        System.out.println(res1);
        String res3= printfullname("gagandeep","kaur");
        System.out.println(res3);
        //String res3;
    }
    public static int sum(int a, int b)
    {
        int sum=a+b;
        return sum;
    }
    public static int mul( int a ,int b )
    {
        int mul=a*b;
        return mul;
    }
    public static String printfullname(String fn,String ln)
    {
        return fn +" "+ln;
    }
}


