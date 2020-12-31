public class Train {


        public static boolean tidyNumber(int number)
        {

            String temp = Integer.toString(number);
            int[] newGuess = new int[temp.length()];
            for (int i = 0; i < temp.length(); i++)
            {
                newGuess[i] = temp.charAt(i) - '0';
            }
            boolean isSorted = true;

            for (int i = 0; i < newGuess.length-1; i++){

                if(newGuess[i] > newGuess[i+1]){
                    isSorted = false;
                    break;
                }


            }

            if (!isSorted)


                return false; // Do your magic!
            else
                    System.out.println("true");
                return true;
        }




}
