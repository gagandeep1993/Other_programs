package collection_programs;
import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;
public class FlatMAP
{
    public static void main(String[] args)
    {
        //example 1(a)
        String sentence1 = "This is a";
        String sentence2 = "flatMap example";
        List<String> res = Stream.of(sentence1, sentence2)
                .flatMap(s-> Stream.of(s.split(" ")))
                .map(String::toUpperCase)
                .collect(Collectors.toList());
               res.forEach(System.out::print);

//example 1(b) map
        /*List<String> digits = Arrays.asList("one", "two", "three");
        List<String> result = digits.stream()
                .map(String::toUpperCase)
                .collect(Collectors.toList());
        result.forEach(System.out::print);

//example 2 map
        List <String> words= Arrays.asList("JavaDevJournal","Java");
        words.stream().map( s-> s.split("")).distinct().collect(Collectors.toList());
        words.forEach(System.out::print);

//example 2 flatmap
         List < String > words = Arrays.asList("JavaDevJournal", "Java");
         List < String > res = words.stream()
            .map(s -> s.split(""))
            .flatMap(Arrays::stream)
            .distinct()
            .collect(Collectors.toList());
             res.forEach(System.out::print);*/
    }
}