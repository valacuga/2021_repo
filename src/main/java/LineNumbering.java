import java.util.*;

public class LineNumbering {
    public static List<String> number(List<String> lines) {

        String g = "asfg";
        String f= "aaasgf";
        boolean s = g.equals(f);

        List<String> lines1= new ArrayList<>();
        for (int i =0; i<lines.size()-1;i++){
            lines1.add((i+1)+": "+lines.get(i));
        }

        System.out.println(lines1);
     return lines1;
    }
}
