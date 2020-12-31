public class Solution3
{
       public static String jumpingNumber(int number)
    {

        String temp = Integer.toString(number);
        int[] newGuess = new int[temp.length()];
        for (int i = 0; i < temp.length(); i++)
        {
            newGuess[i] = temp.charAt(i) - '0';
        }
        

        int counter = 0;
        for (int i = 0; i < newGuess.length-1; i++) {
            if(Math.abs(newGuess[i]-newGuess[i+1])==1){
                counter++;}
        }
        if (counter==newGuess.length-1){

            return "Jumping!!";}

        else

            return "Not!!";
    }


    }



