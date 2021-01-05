public class DescendingOrder {

    public static int sortDesc(int [] num) {
        int fin = 0;

        for (int i = num.length - 1, mult = 1; i >= 0; i--, mult*=10) {


            fin += num[i]*mult;

        }

        return fin;

    }


}
