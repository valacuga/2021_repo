
import org.junit.Test;
import static org.junit.Assert.assertEquals;

    public class  TestDRoot {
        @Test
        public void Test1() {
            assertEquals( "Nope!" , 3, DRoot.digital_root(12));
        }
        @Test
        public void Test2() {
            assertEquals( "Nope!" , 6, DRoot.digital_root(456));
        }
    }

