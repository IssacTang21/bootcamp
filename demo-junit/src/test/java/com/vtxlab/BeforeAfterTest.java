package com.vtxlab;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class BeforeAfterTest {
  private int x;

  @BeforeEach
  void beforeEach() {
    assertEquals(0, this.x);
    x += 3;
  }

  @Test
  void testAdd() {
    assertEquals(8, App.add(this.x, 5));
  }

  @Test
  void testAdd2() {
    assertEquals(8, App.add(this.x, 5));
  }

}
