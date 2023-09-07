import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class BeforeAllAfterAll {
  @BeforeAll
  void BeforeAll() {
    System.out.println("BeforeAll start");
  }

  @AfterAll
  void AfterAll() {
    System.out.println("afterAll start");
  }

  @Test
  void test() {
    assertTrue(true);
  }
}
