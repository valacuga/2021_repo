import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;
import java.util.function.DoubleToIntFunction;

public class Representation {
    public static int daysRepresented (int [][] trips){
        /* your code here */

        int arrival=0;
        int depart=0;
        int days=0;
        int [] arr = new int[366];
        System.out.println(trips[0][0]);
        Arrays.fill(arr, 1);
        for (int i = 0; i < trips.length; i++) {
            arrival=trips[i][0];
            depart=trips[i][1];
            for (int j = arrival; j <= depart; j++) {
                if (arr[j]!=0){

                    days++;
                    arr[j]=0;
                }
            }
        }

        return days;
    }
}