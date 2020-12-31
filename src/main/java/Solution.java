public class Solution {
    public static String specialNumber(int number) {


        String temp = Integer.toString(number);
        int[] newGuess = new int[temp.length()];
        for (int i = 0; i < temp.length(); i++) {
            newGuess[i] = temp.charAt(i) - '0';
        }
        boolean isSpecial = true;

        for (int i = 0; i < newGuess.length; i++) {

            if (newGuess[i] < 0 || newGuess[i] > 5) {

                isSpecial = false;
                break;
            }
        }
            if (isSpecial) {
                return "Special!!";
            } else

                return "NOT!!";


    }
}