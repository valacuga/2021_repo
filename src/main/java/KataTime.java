public class KataTime {

    public static String timeCorrect(String time) {

        System.out.println(time);
        if (null == time || !time.matches("\\d{2}:\\d{2}:\\d{2}")) {
            return null;
        }

        String[] ary = time.split(":");

        int h = Integer.parseInt(ary[0]);
        int m = Integer.parseInt(ary[1]);
        int s = Integer.parseInt(ary[2]);


        m += s / 60;
        s = s % 60;
        h += m / 60;
        m = m % 60;
        h = h % 24;

        return String.format("%02d:%02d:%02d", h, m, s);

    }

}