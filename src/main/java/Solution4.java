import java.util.*;
public class Solution4 {
    public static List<Integer> findMultiples(int s1, int s2, int s3) {
        List<Integer> arr = new ArrayList<Integer>();



        for (int i = 1 ; i<=s3; i++){

            if (i%s2==0&&i%s1==0){
                arr.add(i);
            }

        }


        System.out.println(arr);





        return arr;
    }
}
