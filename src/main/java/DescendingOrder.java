import java.util.Iterator;

public class DescendingOrder {

    public static int sortDesc(int [] num) {
        int fin = 0;

//        for (Iterator<Integer> iterator = numbers.iterator(); iterator.hasNext();) {
//            Integer number = iterator.next();
//            if (number % 2 == 0) {
//                System.out.println("This is Even Number: " + number);
//                iterator.remove();
//            }
//
//        }


        for (int i = num.length - 1, mult = 1; i >= 0; i--, mult*=10) {


            fin += num[i]*mult;

        }

        return fin;

    }


}
