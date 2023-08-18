import java.nio.channels.CompletionHandler;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class DemoArrayList {

  public static void main(String[] args) {
    List<String> strings = new ArrayList<>();
    strings.add("abc");
    strings.add("ghi");
    strings.add("def");

    for (String s : strings) {
      System.out.println(s);
    }

    // Stream
    Stream<String> streamString = strings.stream();
    // Filtering
    streamString.filter(s -> s.startsWith("a"));
    // Stream, forEach
    // streamString.forEach(s -> System.out.println(s)); // abc

    strings.stream() //
        .filter(s -> s.endsWith("i")) //
        .forEach(s -> System.out.println(s)); // ghi

    List<String> strings2 = strings.stream().filter(s -> s.length() == 3).collect(Collectors.toList());

    List<Integer> lengths = strings2.stream().filter(e -> e.startsWith("a") || e.startsWith("d")) //
        .map(e -> e.length()) //
        .collect(Collectors.toList());

    lengths.forEach(e -> System.out.println(e));

    strings2.stream() //
        .sorted((s1, s2) -> s2.compareTo(s1)) // natural order
        .forEach(s -> System.out.println(s));

    if (strings2.stream() //
        .anyMatch(e -> e.startsWith("a"))) {
      System.out.println("One of the elements starts with a");
    }

    // Interminate operations of stream
    // filter(), map(), sorted(), anyMatch()

    // terminate operations of stream
    // collect(), foreach(), count()

    // stream can only terminate once, but it may have multiple interminate
    // operation

    List<Person> persons = Arrays.asList(new Person("john", 30), new Person("Mary", 20));
    List<String> names = persons.stream().map(e -> {
      String word = " words ..";
      return e.getName() + word;
    }).collect(Collectors.toList());

    System.out.println(names.stream().filter(e -> e.startsWith("john")).count());

    // Stream static method
    long l = Stream.of("abc", "def", "ghi", "abc").filter(e -> e.length() == 9).distinct().count(); // 1

    Stream<Integer> stream = Stream.of(1, 2, 3, 4).map(e -> {
      System.out.println(e);
      return e;
    });
    // }).count(); // terminate operation

    int setSize = Stream.of(1, 2, 3, 3) //
        .collect(Collectors.toSet()).size();
    System.out.println(setSize); // 3

    Stream.of(1, 2, 3, 3, 5).filter(e -> e < 6 && e > 2).forEach(e -> System.out.println(e));

    List<String> animals = Arrays.asList("Lion", "Tiger", "bear");
    Map<String, Integer> animalMap = animals.stream().collect(Collectors.toMap(str -> str, str -> str.length()));
  
    // loop Map
    for (Map.Entry<String, Integer> entry : animalMap.entrySet()){
      System.out.println(entry.getKey()+" "+entry.getValue());
    }


    // Stream.iterate()
    Stream.iterate(1, n -> n + 2).limit(10).forEach(e -> System.out.println(e));

    //Group by
    
  }

  public static boolean find(List<Person> persons) {
    return persons.stream() // stream<>
        .filter(e -> e.getAge() >= 65) // stream<>
        .findFirst() // Optional<Person>
        .isPresent(); // boolean
  }
}
