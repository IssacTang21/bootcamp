package com.vtxlab.g2307.model;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;

@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class Staff2 extends Human {
  private double salary;

  // you have to manually code the constructor with Parent's attribute
  public Staff2(String name, double salary) {
    super(name);
    this.salary = salary;
  }

  public static void main(String[] args) {
    Staff2 staff = new Staff2("John", 3000);
    Staff2 staff2 = new Staff2("Peter", 3000);
    System.out.println(staff.equals(staff2)); // false
  }
}