package collection_programs;
import java.util.List;
import java.util.ArrayList;


public class ArrayLIST_DEMO
{
    public static void main(String[] args)
    {
        ArrayList<String> a= new ArrayList<String>();

        //......................ADDOPERATION..............................

        a.add("GAGAN");
        a.add("amrit");
        a.add("dhillon");
        a.add("singh");
        for (String name:a)
        {
            System.out.println(name);
        }

        //.............................ADDING ON PARTICULAR INDEX..................................
        String str = a.get(1);
        System.out.println("Element at index 1: " + str);

       //.........MODIFY ELEMENT  ON PARTICULAR INDEX..................................
        a.set(3, "JavaScript");
        System.out.println("Modified ArrayList:  " +a);

        //.........REMOVE   ELEMENT  FROM  PARTICULAR  INDEX..................................
        String rem = a.remove(0);
        System.out.println("Updated ArrayList: " + a);
        System.out.println("Removed Element: " + rem);
    }
    }

