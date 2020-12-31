import org.w3c.dom.ls.LSOutput;

import java.sql.SQLOutput;
import java.util.StringJoiner;

public class DivSeven {


    public static long[] seven(long m) {
        long count = 0;
        while (m > 99) {
            long y = m % 10;
            m = (m - y) / 10 - (2 * y);
            count++;
        }
        System.out.println(m);
        System.out.println(count);
        return new long[]{m, count};
    }




}
