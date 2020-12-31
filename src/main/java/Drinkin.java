import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Drinkin {

    public static String hydrate(String drinkString) {

        int counter = 0;

        Pattern p = Pattern.compile("-?\\d+");
        Matcher m = p.matcher(drinkString);
        while (m.find()) {
            counter+=Integer.parseInt(m.group());
        }

        if (counter==1) {
            return String.valueOf(counter)+" glass of water";
        } else
        {
            return String.valueOf(counter)+" glasses of water";
        }

    }

}
