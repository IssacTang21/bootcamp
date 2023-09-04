package com.vtxlab.g2307.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Builder
@EqualsAndHashCode
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor // annotation
@ToString(onlyExplicitlyIncluded = true)
public class PersonLombok {
  private String name;
  private int age;

  public static void main(String[] args) {
    PersonLombok personLombok = new PersonLombok("Peter", 30);
    PersonLombok personLombok2 = new PersonLombok();
    personLombok2.setAge(13);
    personLombok2.setName("Eric");
    System.out.println(personLombok2.getAge());
    System.out.println(personLombok2.getName());
    System.out.println(personLombok2.toString()); // personLombok(age=13)
  }

}
