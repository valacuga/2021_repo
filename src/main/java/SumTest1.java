import org.junit.Test;
import static org.junit.Assert.assertEquals;
import org.junit.runners.JUnit4;


public class SumTest1 {

    Sum s = new Sum();

    @Test
    public void Test1()
    {

        assertEquals(2,s.GetSum(-1,2));  // -1 + 0 + 1 + 2 = 2

        assertEquals(5,s.GetSum(2,3));
        assertEquals(-1, s.GetSum(0, -1));
        assertEquals(1, s.GetSum(0, 1));

    }
}