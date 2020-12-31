public class KataString1 {
    public static String tripleTrouble(String one, String two, String three) {
        // Solution

        StringBuilder goo= new StringBuilder();

        for (int i = 0; i<one.length();i++){
            goo.append(one.charAt(i)).append(two.charAt(i)).append(three.charAt(i));
        }


        return goo.toString();
    }
}