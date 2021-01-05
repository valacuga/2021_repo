import org.junit.Test;

import static org.junit.Assert.*;

public class StringUtilsTest {




        @Test
        public void testBasicTrue() {
            String n = "Your girlscout cookies are ready to ship. Your  3 tot3al comes to tree fiddy";
            System.out.println(n);
            assertTrue(StringUtils.isDigit(n));
        }
        @Test
        public void testBasicFalse() {
            String n = "Yo, I heard you were on the lookout for Nessie. Let me know if you need assistance.";
            System.out.println(n);
            assertFalse(StringUtils.isDigit(n));
        }

    }

