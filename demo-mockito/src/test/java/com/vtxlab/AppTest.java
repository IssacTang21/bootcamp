package com.vtxlab;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.never;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.mockito.junit.jupiter.MockitoSettings;
import org.mockito.quality.Strictness;

@ExtendWith(MockitoExtension.class)
@MockitoSettings(strictness = Strictness.LENIENT)
public class AppTest {

  @Mock
  Calculater calculater;

  @InjectMocks
  Checkout checkout;

  @Test
  void testSubstract() {
    Calculater selfNew = new Calculater(3);
    assertEquals(-7, selfNew.substract(10, 6));
    assertEquals(6, selfNew.multiply(2, 3));
  }

  @Test
  void testAdd1() {
    when(calculater.substract(3, 4)).thenReturn(100);
    int result = checkout.add(3, 4); // Scenario: x > 1
    assertEquals(104, result);  //4
    verify(calculater, times(1)).substract(3, 4);
  }

  @Test
  void testAdd2() {
    when(calculater.substract(1, 4)).thenReturn(1000);
    int result = checkout.add(1, 4); // Scenario: x <= 1
    assertEquals(5, result);
    verify(calculater, never()).substract(1, 4);
  }

  @Test
  void testMultiply() {
    when(calculater.substract(7, 9)).thenReturn(10000);
    when(calculater.multiply(7, 9)).thenReturn(10000);
    int result = checkout.multiply(7, 9); // Scenario: x <= 1
    assertEquals(10009, result);
  }

  @Test
  void testMultiply2() {
    when(calculater.substract(3, 8)).thenReturn(10000);
    int result = checkout.multiply(3, 8); // Scenario: x <= 1
    assertEquals(8, result);
  }

}