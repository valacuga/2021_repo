import java.util.List;

public class MixedSum {



    /*
     * Assume input will be only of Integer o String type
     */
    public static int sum(List<?> mixed) {
        int sum = 0;

        for (Object mix : mixed){

           sum += Integer.parseInt(mix.toString());

        }
        System.out.println(sum);
        return sum;
    }
}
