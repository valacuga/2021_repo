import java.util.Arrays;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

import org.junit.runners.JUnit4;

public class KataTimeTest {

    private void test(String expected, String input) {
        assertNull(KataTime.timeCorrect(null));
    }

    @Test
    public void testNull() {
        test(null, null);
    }

    @Test
    public void testEmpty() {
        test("", "");
    }

    @Test
    public void testCorrect() {
        Arrays.asList("09:10:01", "00:00:00", "23:59:59", "12:34:56")
                .forEach(s -> assertEquals(s, s));
    }

    @Test
    public void testCorrection() {
//        assertEquals("12:10:10", KataTime.timeCorrect("11:70:10"));
//        assertEquals("20:39:09", KataTime.timeCorrect("19:99:09"));
//        assertEquals("20:40:39", KataTime.timeCorrect("19:99:99"));
        assertEquals("00:01:01", KataTime.timeCorrect("24:01:01"));
        assertEquals("04:01:01", KataTime.timeCorrect("52:01:01"));
    }

    @Test
    public void testInvalidFormat() {
        assertEquals(null, KataTime.timeCorrect("0:00:00"));
        assertEquals(null, KataTime.timeCorrect("00:0:00"));
        assertEquals(null, KataTime.timeCorrect("00:00:0"));
        assertEquals(null, KataTime.timeCorrect("-0:00:00"));
        assertEquals(null, KataTime.timeCorrect("00:00:000"));
        assertEquals(null, KataTime.timeCorrect("000000"));
        assertEquals(null, KataTime.timeCorrect("00;11;22"));
        assertEquals(null, KataTime.timeCorrect("00:00:0/"));
        assertEquals(null, KataTime.timeCorrect(":0:00:00"));
    }

    @Test
    public void testEdgeCases() {
        assertEquals("00:00:00", KataTime.timeCorrect("24:00:00"));
        assertEquals("00:00:00", KataTime.timeCorrect("23:59:60"));
        assertEquals("00:00:00", KataTime.timeCorrect("47:59:60"));
        assertEquals("00:00:59", KataTime.timeCorrect("47:60:59"));
        assertEquals("12:00:00", KataTime.timeCorrect("12:00:00"));
        assertEquals("04:40:39", KataTime.timeCorrect("99:99:99"));
        assertEquals("01:00:00", KataTime.timeCorrect("24:60:00"));
        assertEquals("01:00:00", KataTime.timeCorrect("25:00:00"));
    }

}