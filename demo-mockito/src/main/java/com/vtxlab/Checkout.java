package com.vtxlab;

import lombok.AllArgsConstructor;

// @RequiredArgsConstructor
@AllArgsConstructor
public class Checkout {

  // @NonNull
  private Calculater calculator;

  public int add(int x, int y) {
    if (x > 1) {
      return y + this.calculator.substract(x, y);
    }
    return x + y;
  }

  public int multiply(int x, int y) {
    if (x > 1) {
      return y + this.calculator.multiply(x, y);
    } else if (x == 0) {
      return y + this.calculator.substract(x, y);
    }
    return this.calculator.multiply(x, y) //
        + this.calculator.substract(x, y);
  }

}