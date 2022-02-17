package collection_programs;
import java.util.*;


public class Set_2
{
    public static void main(String[] args)
    {
        Integer []a={1,23,4,5,6,7};
        Integer []b={1,22,44,55,62,7};

        Set<Integer> s1 = new HashSet<Integer>();
        s1.addAll(Arrays.asList(a));

        Set<Integer> s2 = new HashSet<Integer>();
        s2.addAll(Arrays.asList(b));

        Set<Integer> u = new HashSet<Integer>(s1);
        u.addAll(s2);
        System.out.print("Union of set1 and set2 is:");
        System.out.println(u);

    }
}
