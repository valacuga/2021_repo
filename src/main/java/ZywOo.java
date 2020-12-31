public class ZywOo {

    public static String warnTheSheep(String[] array) {

        int indexOfWolf = 0;
        int sheeps = 0;

        if (array[array.length-1].equals("wolf")){

            return "Pls go away and stop eating my sheep";}

        else {


            for (int i = 0; i<array.length;i++)
                if (array[i].equals("wolf")){
                    indexOfWolf = i;
                    break;
                }
            sheeps = array.length-indexOfWolf-1;
            return "Oi! Sheep number "+sheeps+"! You are about to be eaten by a wolf!";
        }


    }


}
