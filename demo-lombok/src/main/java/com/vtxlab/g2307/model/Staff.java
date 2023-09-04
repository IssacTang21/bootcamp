package com.vtxlab.g2307.model;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;

@AllArgsConstructor
@EqualsAndHashCode
public class Staff extends Human {
  private double salary;

  // you have to manually code the constructor with Parent's attribute
  public Staff(String name, double salary) {
    super(name);
    this.salary = salary;
  }

  public static void main(String[] args) {
    Staff staff = new Staff("John", 3000);
    Staff staff2 = new Staff("Peter", 3000);
    System.out.println(staff.equals(staff2));
  }
}
