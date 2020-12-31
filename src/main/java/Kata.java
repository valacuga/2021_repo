public class Kata {
    public static int[] pipeFix(int[] numbers) {


        int length = numbers[numbers.length-1]- numbers[0]+1;

        int [] num1 = new int [length];
        int start = numbers[0];

        for (int i= 0; i<length; i++){

            num1[i]= start;
            start++;


        }
        return num1;


    }
}