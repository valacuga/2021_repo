import java.util.Arrays;




public class Sorted {


        public static int[] sortArray(int[] array) {

//            boolean isSorted = false;
//            int buf;
//            while(!isSorted) {
//                isSorted = true;
//                for (int i = 0; i < array.length-1; i++) {
//                    if((array[i]%2!=0&&array[i+1]%2!=0)&&(array[i] > array[i+1])){
//                        isSorted = false;
//
//                        buf = array[i];
//                        array[i] = array[i+1];
//                        array[i+1] = buf;
//                    }
//                }
//            }



            // One by one move boundary of unsorted subarray 
            for (int i = 0; i < array.length-1; i++)
            {
                // Find the minimum element in unsorted array 
                int min_idx = i;
                for (int j = i+1; j < array.length; j++)
                    if ((array[i]%2!=0&&array[j]%2!=0)&&(array[j] < array[min_idx]))
                        min_idx = j;

                // Swap the found minimum element with the first 
                // element
                int temp = array[min_idx];
                array[min_idx] = array[i];
                array[i] = temp;
            }



            System.out.println(Arrays.toString(array));
            return array;
        }




}

