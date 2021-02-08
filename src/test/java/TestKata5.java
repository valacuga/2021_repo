

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class TestKata5 {
    @Test
    public void tests() {
        assertArrayEquals(new int[]{1, 3, 2, 5, 3}, NewKata5.digitize(35231));
    }
}


