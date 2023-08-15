import java.util.Collection;
import java.util.Collections;

@FunctionalInterface
//annotation: check if this interface has one abstract method only
// if no, compile - error
public interface Swimmable {
  void swim();

  public static void main(String[] args) {
    // Person person = new Person();
    // person.swim();

    // Lammdna: you have to use "return", if you use{}
    Comparator<Person> sortByNameDesc = (Person p1, Person p2) ->{
        p2.name.charAt(0) > p1.name.charAt(0) ? 1 : -1;};
      List<Person> persons = Arrays.asList(new Person("alison"), new Person("Eric"));
      Collections.sort(persons, sortByNameDesc);
      System.out.println(persons);

    // new object <- "() -> System.out.println("person1 is swimming");"
    Swimmable person1 = () -> System.out.println("person1 is swimming");
    person1.swim();

    Swimmable person2 = () -> {
      System.out.println("person2 start to swim");
      System.out.println("person2 stop swimming");
    };
      person2.swim();
  }
}
