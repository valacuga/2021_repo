import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class TestSmallestValueInArray{

    @Test
    public void testSample() {
       assertEquals( "The smallest index" , 1 , Arrayss.findSmallest( new int [] {5, 1, 2, 3} , "index") );
       assertEquals( "The smallest value" , 2 , Arrayss.findSmallest( new int [] {7, 12, 3, 2, 27} , "value") );
       assertEquals( "The smallest index" , 3 , Arrayss.findSmallest( new int [] {7, 12, 3, 2, 27} , "index") );
    }
}