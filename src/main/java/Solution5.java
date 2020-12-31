public class Solution5{
    public static int[] solve (int[] arr){


        boolean sorted = false;
        int temp;
        while(!sorted) {
            sorted = true;
            for (int i = 0; i < arr.length - 1; i++) {
                if (arr[i] > arr[i+1]) {
                    temp = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = temp;
                    sorted = false;
                }
            }
        }


        int [] arr2 = new int[arr.length];
        int middle = arr.length / 2;

        if (arr.length%2==1) {



            for (int i = 0; i < middle; i++) {
                int j = arr.length - i - 1;
                arr2[i * 2] = arr[j];
                arr2[i * 2 + 1] = arr[i];
            }
            arr2[arr.length - 1] = arr[middle];
            for (int element : arr2) {
                System.out.println(element);
            }

        }  else {

            for (int i = 0; i < middle; i++) {
                int j = arr.length - i - 1;
                arr2[i * 2] = arr[j];
                arr2[i * 2 + 1] = arr[i];
            }

            for (int element : arr2) {
                System.out.println(element);
            }

        }
        return arr2;


    }








}
