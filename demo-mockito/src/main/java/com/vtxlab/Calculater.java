package com.vtxlab;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
public class Calculater {
  private int weight = 2;

  public int substract(int x, int y) {
    return y - x - this.weight;
  }

  public int multiply(int x, int y) {
    return x * y;
  }
}
