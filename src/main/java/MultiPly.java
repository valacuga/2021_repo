public class MultiPly {


    public static int maxMultiple(int divisor, int bound) {


        int maxMultiple = 0;
        int[] array = new int[bound];
        for (int i = 0; i < array.length; i++) {
            array[i] = i;
        }

        for (int y = array.length - 1; y >= 0; y--) {

            if (array[y] % divisor == 0) {
                maxMultiple = array[y];
                break;
            } else {
                maxMultiple = 0;
            }
        }
            return maxMultiple;

    }
}


