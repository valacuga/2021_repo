public class Banjo {
    public static String areYouPlayingBanjo(String name) {


        char ch1 = name.charAt(0);
        if (ch1 == 'R' || ch1 == 'r') {
            return name + " plays banjo";
        } else {
            System.out.println(name);
            return name + " does not play banjo";
        }

    }
}
