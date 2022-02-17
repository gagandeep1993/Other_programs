
package collection_programs;
import java.util.LinkedList;
import java.util.List;

public class LinkedList_Demo
{
    public static void main(String[] args)
    {
        LinkedList<String> l=new LinkedList<>();
        l.add("RED");
        l.add("green");
        l.add("blue");
        l.add("yellow");
        System.out.println("  "+l);

        l.addLast(" adding at last..");
        System.out.println("  "+l);

         l.remove(2);
         System.out.println(l);

      


    }
}
