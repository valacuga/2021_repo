public class DRoot {



    public static int digital_root(int n) {

        int sum = 0;

        String temp = Integer.toString(n);
        System.out.println(temp+" temp");
        int[] newGuess = new int[temp.length()];
        for (int i = 0; i < temp.length(); i++)
        {
            newGuess[i] = temp.charAt(i) - '0';
            sum+=newGuess[i];
        }


        System.out.println(sum+" sum");
        if (sum >=0&&sum<10){
            return sum;
        }




        return digital_root(sum);

    }


}