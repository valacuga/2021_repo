import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SumParts {

    public static int[] sumParts(int[] ls) {

//        if (ls.length == 0) {
//
//            return new int[]{0};
//        }

//        int [] res = new int [ls.length+1];
//        for (int i = 0; i<ls.length; i++){
//            int sum = 0;
//            int [] ls2 = new int [ls.length-i];
//
//            for (int b = 0 ; b<ls2.length; b++){
//                ls2[b] = ls[ls.length-1-b];
//                sum+=ls2[b];
//
//            }
//            res[i] = sum;
//            System.out.println(res[i]);
//
//        }
//        res[ls.length] = 0;


        int[] result = new int[ls.length + 1];
        int sum = Arrays.stream(ls).sum();

        for (int i = 0; i < ls.length; i++) {

            result[i] = sum;
            sum = sum - ls[i];
        }
        return result;

        //   return new int[]{1};

    }

}