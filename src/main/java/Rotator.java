public class Rotator {



    Object mainMethod(Object arr[],int d){
        Rotate(arr, d);
        return arr;
    }



        /*Function to left rotate arr[] of size n by d*/
        void Rotate (Object arr[],int d)
        {

            if (d < 0) {
                for (int i = 0; i < Math.abs(d); i++)
                    leftRotatebyOne(arr);
            } else {
                for (int i = 0; i < d; i++)
                    rigthRotateOne(arr);
            }

        }


        void leftRotatebyOne (Object arr[])
        {
            Object temp;
            int i;
            temp = arr[0];
            for (i = 0; i < arr.length - 1; i++)
                arr[i] = arr[i + 1];
            arr[i] = temp;
        }


        void rigthRotateOne (Object arr[]){

            Object temp;
            int i;
            temp = arr[arr.length - 1];
            for (i = arr.length - 1; i > 0; i--)
                arr[i] = arr[i - 1];
            arr[i] = temp;

        }


        /* utility function to print an array */
        void printArray ( Object arr[])
        {
            for (int i = 0; i < arr.length; i++)
                System.out.print(arr[i] + " ");
        }


    }





// Your code here



