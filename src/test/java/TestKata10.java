import org.junit.Assert;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import org.junit.runners.JUnit4;

public class TestKata10 {

    private double precision = 0.0000000000001;
    @Test
    public void TestSomething(){

        assertEquals(1.0, Kata10.findUniq(new double[]{0, 1, 0}), precision);


    }



}
