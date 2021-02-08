


public class StringTask {

    public static String perform(String word) {


        String Str = new String(word.substring(0,word.length()-2));





        return Str.replaceAll("",".").toLowerCase();



    }

}
