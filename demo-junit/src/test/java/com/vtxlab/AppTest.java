package com.vtxlab;

// import static org.junit.jupiter.api.Assertions.assertFalse;
// import static org.junit.jupiter.api.Assertions.assertNotEquals;
// import static org.junit.jupiter.api.Assertions.assertNotNull;
// import static org.junit.jupiter.api.Assertions.assertNotSame;
// import static org.junit.jupiter.api.Assertions.assertNull;
// import static org.junit.jupiter.api.Assertions.assertSame;
// import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNotSame;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTimeout;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.time.Duration;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

/**
 * Unit test for simple App.
 */

// @TestInstance(TestInstance.Lifecycle.PER_CLASS)
@TestInstance(TestInstance.Lifecycle.PER_METHOD) // default
@DisplayName("Assert Method Tests")
public class AppTest {
  @Test
  void testAssertEqual() {
    // Assertions.assertEquals(expected value, actual value)
    assertEquals(5, App.add(2, 3));

  }

  @Test
  void testAssertNotEqual() {
    assertNotEquals(4, App.add(1, 2));
  }

  @Test
  void testAssertTrue() {
    assertTrue(12 == App.add(7, 5));
  }

  @Test
  void testAssertFalse() {
    assertFalse(13 == App.add(7, 5));
  }

  @Test
  void testAssertNull() {
    String str = null;
    assertNull(str);
  }

  @Test
  void testAssertNotNull() {
    Student student = new Student();
    assertNotNull(student);
  }

  @Test
  void testAssertThrows() {
    assertThrows(ArithmeticException.class, () -> {
      App.divide(10, 0);
    });
  }

  @Test
  void testAssertTimeout() {
    assertTimeout(Duration.ofMillis(100), () -> {
      Thread.sleep(50); // ms
    });
  }

  @Test
  void testCombine() {
    assertAll(
        () -> assertTime(10 > 3),
        () -> assertEquals(10, App.add(4, 6)),
        () -> assertNull(null));
  }

  @Test
  void testSame() {
    String s1 = new String("Junit");
    String s2 = new String("Junit");
    assertNotSame(s1, s2); // Test object reference

    String s3 = "Junit";
    String s4 = "Junit";
    assertSame(s3, s4);
  }
}
