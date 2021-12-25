import org.junit.Test;

import java.util.*;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class LambdaAndStream {


    Consumer<Integer> print = i -> System.out.println(i);
    Function<Integer, Integer> timeTwo = i -> i*2;
    Predicate<Integer> isEven = i -> i % 2 == 0;
    Comparator<Integer> comparator = (o1,o2) -> o1 - o2;


    @Test
    public  void testOli() {

        Stream.of("kervin","oli", "beno").map(name -> name.length()).forEach(i -> System.out.println(i));

//        SortedSet<Integer> s = new TreeSet<>(comparator);
//        s.add(1);
//        s.add(3);
//        s.add(2);
//        System.out.println(s);

//        System.out.println(IntStream.range(1, 10).count());
//        System.out.println(IntStream.range(1, 10).limit(5).count());
//        System.out.println(IntStream.range(1, 10).skip(3).count());


//        List<Integer> list = IntStream.range(1, 10).skip(3).boxed().collect(Collectors.toList());


//        list.stream().filter(isEven).limit(2).forEach(print);


//        System.out.println(list);

//        IntStream.range(1, 10).boxed().forEach(print);
//        IntStream.range(1,10).boxed().map(timeTwo).forEach(print);
    }

}
