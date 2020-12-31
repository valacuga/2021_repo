import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Training {


    public static void builder(String... args) {


        String s = "";
        for (int i =0; i<args.length;i++){
            s+=args[i]+" ";
        }

        String s1 = s.substring(0,s.length()-1);

        System.out.println(s1);

    }


    public class Ghost {


        public String getColor(){

            final String[] proper_noun = {"white" , "yellow" , "purple" , "red"};
            Random random = new Random();
            int index = random.nextInt(proper_noun.length);
            return proper_noun[index];

        }



    }


}
