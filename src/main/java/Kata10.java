import java.sql.SQLOutput;

// Make sure your class is public
public class Kata10 {
    public static double findUniq(double arr[]) {
        // Do the magic

        double unique = 0;

        for (int i = 0; i< arr.length; i++){
            int count = 0;
            unique = arr[i];
            System.out.println(unique);
            for (int j = 0; j < arr.length; j++){
                if(unique==arr[j]){
                    count++;
                    System.out.println("----------");
                }
            }
            System.out.println(count);
            if (count==1) {
                return unique;
            }
        }



        return 0;
    }
}