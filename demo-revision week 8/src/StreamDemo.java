import java.util.ArrayList;
import java.util.List;

public class StreamDemo {

}

public static void main(String[] args) {
  // one table (person) -> many records (where age > 60)
  List>

  public static List<Person> getFromDb(int age) {
    // List of Person
    List<Person> persons = new ArrayList<>();
    persons.add(new Person("John Chan"));
    persons.add(new Person("Eric Lau"));
    persons.add(new Person("Peter Lau"));
    // Stream , last name = Lau
    return persons.stream().filter(e -> e.getAge() >= 60).map();
  }
}