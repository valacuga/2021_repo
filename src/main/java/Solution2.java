public class Solution2 {

    public static boolean check(Object[] a, Object x) {


        boolean isSet= false;
        for (Object x1 : a) {
            if (x1.equals(x)){
                isSet = true;
            }
        }
        
        
        
        return isSet;
    }



}
