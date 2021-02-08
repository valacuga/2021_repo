import java.util.Arrays;
import java.util.Collections;


public class NewKata5 {
    public static int[] digitize(long n) {
        // Code here


        String temp = Long.toString(n);
        int[] newGuess = new int[temp.length()];
        for (int i = 0; i < temp.length(); i++)
        {
            newGuess[i] = temp.charAt(i) - '0';
            System.out.println(newGuess[i]);
        }


        int [] reversed = new int[newGuess.length];
        int j = newGuess.length;
        for (int i = 0; i < newGuess.length; i++) {
            reversed[j - 1] = newGuess[i];
            j = j - 1;
        }

        return reversed;

    }
}