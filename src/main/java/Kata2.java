public class Kata2
{
    public static int[] countPositivesSumNegatives(int[] input)
    {


        if (input == null || input.length == 0) {
            return new int[]{};
        }

        int sumNeg = 0;
        int sumCount = 0;


        int i = 0;
        while (i < input.length) {
            int value = input[i];
            if (value > 0) {
                sumCount++;
            } else {
                sumNeg += value;
            }
            i++;
        }

        int[] arr2 = new int[]{sumCount, sumNeg};
        System.out.println(arr2[0]+" "+arr2[1]);
        return arr2; //return an array with count of positives and sum of negatives
    }
}