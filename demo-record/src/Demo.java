import java.util.HashSet;
import java.util.Set;

public class Demo {
  
  public static void main(String[] args) {
    Person person = new Person("john", 30);
    Person1 person1 = new Person1("john", 29);
    Person1 anotherPerson = new Person1("john", 29);

    System.out.println(person.getAge()); // 30
    System.out.println(person1.age()); // 29
    System.out.println(person.getName()); // john
    System.out.println(person1.name()); // john

    System.out.println(person1.hashCode() == anotherPerson.hashCode()); // true

    // Person1 person2 = new Person1(null, 0);

    System.out.println(person1.equals(anotherPerson)); // true
    System.out.println(person1);

    // HashMap, Set -> equals(), HashCode
    Set<Person1> set = new HashSet<>();
    set.add(person1);
    System.out.println(set.add(anotherPerson));
  }
}
