package com.vtxlab.g2307.model;

import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@AllArgsConstructor
public class Student {
  private int age;

  public static void main(String[] args) {
    Student student = new Student(); // come from RequiredArgsConstructor since Student has not any nonNull & final
                                     // instance variable
    Student s2 = new Student(10);
  }
}
