package collection_programs;
import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StudentStream
{
String name;
int age;

    StudentStream(String name,int age)
    {
        this.name = name;
        this.age = age;
    }

}
class PredicateDemo
{
    public static void main(String[] args)
    {
       List<StudentStream> s=new ArrayList<>();
       s.add(new StudentStream("gagan",34));
        s.add(new StudentStream("jagan",84));
        s.add(new StudentStream("pawan",54));
        s.add(new StudentStream("hasan",76));

        s.forEach(j-> System.out.println(j.name+"  "+ j.age));




    }
}


