public class WeightSort {

    public static String orderWeight(String strng) {


        if (strng.length()==0){

            return "";}


        String[] array = strng.split(" ");
        System.out.println(array[0]+" "+array.length);
        if (array.length==1){
            return strng;
        }

        int [] array2 = new int[array.length];
        int [] array3 = new int[array.length];

        try
        {
        for (int i = 0; i<array.length; i++){
            array2[i]=Integer.parseInt(array[i]);
            System.out.println(array2[i]);
        }
        }
        catch (NumberFormatException nfex)
        { return strng; }

        for (int j = 0; j<array3.length; j++){
            int sum = 0;
            String temp = Integer.toString(array2[j]);
            int[] newGuess = new int[temp.length()];
            for (int i = 0; i < temp.length(); i++)
            {
                newGuess[i] = temp.charAt(i) - '0';
                sum += newGuess[i];
            }
            array3[j] = sum;
            System.out.println(sum);

        }

        boolean sorted = false;
        int temp;
        int temp2;
        while(!sorted) {
            sorted = true;
            for (int i = 0; i < array3.length - 1; i++) {
                if (array3[i] > array3[i+1]) {
                    temp = array3[i];
                    temp2 = array2[i];
                    array3[i] = array3[i+1];
                    array2[i] = array2[i+1];
                    array3[i+1] = temp;
                    array2[i+1] = temp2;
                    sorted = false;
                }
            }
        }
        String [] arg2 = new String[array2.length];

        for (int i = 0; i<arg2.length; i++){
            arg2[i]=Integer.toString(array2[i]);
        }


        int size = arg2.length;

        for(int i = 0; i<size-1; i++) {
            for (int j = i+1; j<arg2.length; j++) {
                if(arg2[i].compareTo(arg2[j])>0&&array3[i]==array3[j]) {
                    String temp3 = arg2[i];
                    arg2[i] = arg2[j];
                    arg2[j] = temp3;
                }
            }
        }




        StringBuilder builder = new StringBuilder();
        for(int s = 0 ; s< arg2.length; s++) {
            builder.append(arg2[s]);
            if (!arg2[s].equals(arg2[arg2.length-1])){
                builder.append(" ");
            }

        }
        String str = builder.toString();


        return str;


    }
}