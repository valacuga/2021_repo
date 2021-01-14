import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class TestGeometry {

    private static final double DELTA = 1e-15;
    @Test
    public  void TestSomething() {
        assertEquals(1.62, Geometry.squareArea(2),DELTA);
    }


}
