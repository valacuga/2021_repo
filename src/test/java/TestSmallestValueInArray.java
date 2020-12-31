import static org.junit.Assert.assertEquals;
import org.junit.Test;
import org.junit.Ignore;

public class TestSmallestValueInArray{

    @Test
    public void testSample() {
       assertEquals( "The smallest index" , 1 , Arrays.findSmallest( new int [] {5, 1, 2, 3} , "index") );
       assertEquals( "The smallest value" , 2 , Arrays.findSmallest( new int [] {7, 12, 3, 2, 27} , "value") );
       assertEquals( "The smallest index" , 3 , Arrays.findSmallest( new int [] {7, 12, 3, 2, 27} , "index") );
    }
}