package com.vtxlab.g2307.model;

import lombok.NonNull;
import lombok.RequiredArgsConstructor;

// @AllArgsConstructor
// @NoArgsConstructor
@RequiredArgsConstructor
public class Car {

  @NonNull
  private Integer capacity;
  private String color;
  private final int weight;

  public Car(String color) {
    this.color = color;
    this.weight = 0;
  }

  public static void main(String[] args) {
    Car car = new Car(null, 5);
  }
}
