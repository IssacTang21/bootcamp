package com.vtxlab;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Spy;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class SpyTest {
  
  @Spy
  Calculater calculater;

  @InjectMocks
  Checkout checkout;

  @Test
  void testAdd1() {
    when(calculater.substract(3, 4)).thenReturn(100);
    int result = checkout.add(3, 4);
    assertEquals(104, result);
    verify(calculater, times(1)).substract(3, 4);
  }

  @Test
  void testAdd2() {
    int result = checkout.add(3, 4);
    assertEquals(3, result); // 4 + (4 - 3 - 2)
  }

  @Test
  void test3() {
    when(calculater.multiply(-2, 4)).thenReturn(100);
    int result = checkout.multiply(-2, 4);
    assertEquals(104, result); //  100 + (4 - (-2) - 2)
  }
  
}
