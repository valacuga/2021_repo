import java.util.Arrays;

public class FakeBinary {
    public static String fakeBin(String numberString) {


// The string you want to be an integer array.
        String[] integerStrings = numberString.split("");
// Splits each spaced integer into a String array.
        int[] integers = new int[integerStrings.length];
        System.out.println(integers);
// Creates the integer array.
        for (int i = 0; i < integers.length; i++){
            integers[i] = Integer.parseInt(integerStrings[i]);
//Parses the integer for each string.

            if (integers[i]<5){
                integers[i] = 0;
            } else {
                integers[i] = 1;
            }

        }
        String integerStrings2 = Arrays.toString(integers);
        System.out.println(integerStrings2);
        String[] integerStrings3 = integerStrings2.split(", ");

        String str2 = String.join("", integerStrings3);
        str2 = str2.substring(1, numberString.length()+1);
        System.out.println(str2);
        System.out.println("asfasfas");
        return str2;
    }
}