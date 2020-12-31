

import java.util.regex.Matcher;
import java.util.regex.Pattern;


    class FindScreenSize {
        public static String findScreenHeight(int width, String ratio) {

            int [] array= new int [2];
            int first = 0;
            int second = 0;
            Pattern p = Pattern.compile("-?\\d+");
            Matcher m = p.matcher(ratio);
            int i = 0;
            while (m.find()) {


                array[i]=Integer.parseInt(m.group());
                i++;
            }

           double res = (double) array[1]/array[0];
            double resol = (double) res*width;
            int resolution = (int) resol;

   //         System.out.println(resolution);

            StringBuilder str= new StringBuilder(width+"x"+resolution);

            return str.toString();





        }
    }
