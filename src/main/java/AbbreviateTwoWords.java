public class AbbreviateTwoWords {

    public static String abbrevName(String name) {


        String [] names = name.split(" ");
        char name1 = names[0].charAt(0);
        char name2 = names[1].charAt(0);

        String abbrevName = String.valueOf(name1).toUpperCase()+". "+String.valueOf(name2).toUpperCase()+".";
        return abbrevName;



    }
}