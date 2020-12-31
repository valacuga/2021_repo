public class Sum
{
    public int GetSum(int a, int b)
    {



        int [] array=new int [Math.abs(b-a)+1];

        int start = Math.min(a,b);


        System.out.println(array.length);
        for (int i = 0; i<array.length; i++){

            array [i] = start;
            start++;
            System.out.println(array[i]);

        }



        int sum = 0;
        for (int value : array) {
            sum += value;
        }
        return sum;
        //Good luck!

    }
}