import java.util.List;

public class MysteryColorAnalyzerImpl implements MysteryColorAnalyzer {


//    MysteryColorAnalyzerImpl myst = new MysteryColorAnalyzerImpl();


    @Override
    public int numberOfDistinctColors(List<Color> mysteryColors) {

        System.out.println(mysteryColors);

        int counterD = 0;

        for (Color i : mysteryColors){
            if (i == Color.BLUE){
                counterD++;
            }
        }
        System.out.println(counterD);
        return counterD;
    }

    @Override
    public int colorOccurrence(List<Color> mysteryColors, Color color) {

        System.out.println(mysteryColors);
        System.out.println(color);

        int counterS = 0;
        Color color1 = color;

        for (Color i : mysteryColors){
            if (i == color1){
                counterS++;
            }
        }
        System.out.println(counterS);
        return counterS;
    }
}
