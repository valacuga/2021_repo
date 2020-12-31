import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;
public class MysteryTest {

    @Test
    public void TestSomething (){
        List<Color> arr = new ArrayList<>();
        arr.add(Color.BLUE);
        arr.add(Color.GREEN);
        arr.add(Color.RED);

        MysteryColorAnalyzerImpl mys = new MysteryColorAnalyzerImpl();
        assertEquals(1, mys.numberOfDistinctColors(arr));
        assertEquals(1,mys.colorOccurrence(arr, Color.GREEN));
    }



}
