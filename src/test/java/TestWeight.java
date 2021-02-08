import org.junit.Test;
import static org.junit.Assert.*;

public class TestWeight {

    @Test
    public  void TestSomething(){

            System.out.println("****** Basic Tests ******");
            assertEquals("2000 103 123 4444 99", WeightSort.orderWeight("103 123 4444 99 2000"));
            assertEquals("11 11 2000 10003 22 123 1234000 44444444 9999", WeightSort.orderWeight("2000 10003 1234000 44444444 9999 11 11 22 123"));
            assertEquals("59544965313", WeightSort.orderWeight("59544965313"));



    }



}
