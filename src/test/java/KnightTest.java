
import org.junit.Test;

import static org.junit.Assert.assertEquals;


import org.junit.Test;
import static org.junit.Assert.assertEquals;
import org.junit.runners.JUnit4;

public class KnightTest {
    @Test
    public void should_return_the_output_provided() {
        PawnDistance actual = CodeWars.redKnight(0, 8);

        PawnDistance expected = new PawnDistance("White", 16);

        assertEquals(actual, expected);


       actual = CodeWars.redKnight(0, 7);
       expected = new PawnDistance("Black", 14);
       assertEquals(expected, actual);

       actual = CodeWars.redKnight(1, 6);
       expected = new PawnDistance("Black", 12);
       assertEquals(expected, actual);

       actual = CodeWars.redKnight(1, 5);
       expected = new PawnDistance("White", 10);
       assertEquals(expected, actual);
    }
}
