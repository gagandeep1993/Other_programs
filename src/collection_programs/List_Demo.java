
package collection_programs;
import java.util.List;
import java.util.ArrayList;


public class List_Demo
{
    public static void main(String[] args)
    {
        List<String> l=new ArrayList<String>();
        l.add("RED");
        l.add("green");
        l.add("blue");
        l.add("yellow");

for(String color:l)
{
    System.out.println(color);
}

    }
}
