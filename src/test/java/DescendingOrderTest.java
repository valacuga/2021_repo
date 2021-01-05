import org.junit.Test;
import static org.junit.Assert.assertEquals;


public class DescendingOrderTest {

    @Test
    public void test_01() {
        assertEquals(123, DescendingOrder.sortDesc(new int[]{1,2,3}));
    }


}