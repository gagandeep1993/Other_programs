//import java.util.Locale;
public class StringDemo
{
    public static void main(String[] args)
    {
       //string
        String s="GAGANDEEP",s1;
        s1=s.toLowerCase();
        System.out.println(s1);


        //..........string builder..........
        StringBuilder sb=new StringBuilder("amrit");
        sb.append("dhillon");
        System.out.println(sb);

        int a=10; //..........peimitive variable
        System.out.println("vale of primitive variable is "+a);


        Integer a1=10;//.........Wrapper class
        float v = a1.floatValue();
        System.out.println(v);

    }
}

