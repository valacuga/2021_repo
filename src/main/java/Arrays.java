

import org.w3c.dom.ls.LSOutput;

import java.util.Collections;

public class Arrays {

    public static int findSmallest( final int[] numbers, final String toReturn ) {

        int temp;
         int [] numbers1 = new int[numbers.length];
        
        for (int i =0 ; i<numbers1.length-1;i++) {
            numbers1[i]=numbers[i];
        }
        


        System.out.println(java.util.Arrays.toString(numbers));


            for (int i = 0; i < numbers.length; i++)
            {
                for (int j = i + 1; j < numbers.length; j++)
                {
                    if (numbers[i] > numbers[j])
                    {
                        temp = numbers[i];
                        numbers[i] = numbers[j];
                        numbers[j] = temp;
                    }
                }
            }

            int target = numbers[0];

        System.out.println(java.util.Arrays.toString(numbers));

        if (toReturn.equals("value")){
            System.out.println(java.util.Arrays.toString(numbers1)+"ssss");
            return numbers[0];
        } else {
            {
                for (int i = 0; i < numbers1.length; i++)
                    if (numbers1[i] == target)
                        return i;

                return -1;
            }

        }







    }
}