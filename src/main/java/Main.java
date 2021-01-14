import java.util.Arrays;

public class Main extends MysteryColorAnalyzerImpl {

    public static void main(String[] args) {
        Train.tidyNumber(13579);
        SumSquare.squareSum(new int[]{2, 2, 2});
        System.out.println(Math.abs(4));
        int[] array = {1, 2, 3};
        int[] invert = new int[array.length];

        int n = 5;
        int m = 5;
        for (int i = 0; i < m; i++) {
            System.out.println(n--);
        }


        System.out.println("HEYYYYY");
        Arrayss.findSmallest(new int[]{5, 32, 423}, "aasfga");
        System.out.println("HEYYYYY");
        Sorted.sortArray(new int[]{5, 3, 1, 8, 0, 2, 9, 4, 13, 0, 15, 7, 2, 4, 19});

        DivSeven.seven(477557101);
        Banjo.areYouPlayingBanjo("Martin");

        FakeBinary.fakeBin("34262436");
        AbbreviateTwoWords.abbrevName("Vasya Pupkin");

        MixedSum.sum(Arrays.asList(5, "5"));
        Drinkin.hydrate("12 , asdgasgd, asdgsg 263");
        Solution3.jumpingNumber(2);
        Training.builder("asd", "dadad");
        FindScreenSize.findScreenHeight(1024, "4:3");
        Palindromes.palindromeChainLength(131);
        LineNumbering.number(Arrays.asList("a", "b", "c"));
        Representation.daysRepresented(new int[][]{{5, 25}, {6, 36}, {55, 75}, {88, 78}});
        FirstNonConsecutive.find(new int[]{32, 33, 35, 36, 37});
        FirstNonConsecutive.find(new int[]{4, 5, 6, 7, 8, 9, 11});
        FirstNonConsecutive.find(new int[]{31, 32});
        FirstNonConsecutive.find(new int[]{1, 2, 3, 4, 5, 6, 7, 8});
        FirstNonConsecutive.find(new int[]{1, 2, 3, 4, 5, 6, 7, 9});
        FirstNonConsecutive.find(new int[]{-2226, -2225, -2223, -2222, -2221, -2219, -2217});

        Rotator rotate = new Rotator();
        Object arr[] = {1, 2, 3, 4, 5, 6, 7};
        rotate.mainMethod(arr, -3);
        rotate.printArray(arr);
        KataString1.tripleTrouble("aa", "bb", "cc");
        Solution4.findMultiples(2, 3, 12);
        Solution5.solve(new int[]{2, 1, 5, 6, 9});
        System.out.println();
        CalculateRotation.shiftedDiff("Esham", "Esham");


    }


}
