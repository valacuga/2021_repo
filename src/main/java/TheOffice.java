public class TheOffice {
    public static String outed(Person[] meet, String boss) {

        int counter = 0;

        for (Person per : meet) {

            if (per.name.equals(boss)) {
                counter += per.happiness * 2;
            } else

                counter += per.happiness;
        }



        System.out.println((double) counter/meet.length);
        if(counter/meet.length<=5){
            return "Get Out Now!";
        } else
            return "Nice Work Champ!";




    }
}