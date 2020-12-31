import org.junit.Test;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

// TODO: Replace examples and use TDD development by writing your own tests

public class SolutionTest3 {
    @Test
    public void basicTests() {
        assertTrue(Kata3.divide(4));
       assertFalse(Kata3.divide(2));
        assertFalse(Kata3.divide(5));
      assertTrue(Kata3.divide(88));
     assertTrue(Kata3.divide(100));
       assertFalse(Kata3.divide(67));
        assertTrue(Kata3.divide(90));
        assertTrue(Kata3.divide(10));
        assertFalse(Kata3.divide(99));
        assertTrue(Kata3.divide(32));
    }
}