import org.decimal4j.util.DoubleRounder;

public class Geometry{
    public static double squareArea(double A){



        double PI= Math.PI;

        double R = 2*A/PI;

        double square = R*R;
//        double roundedSquare = DoubleRounder.round(square,2);


        double scale = Math.pow(10,2);
        double roundedSquare = Math.round(square * scale) / scale;

        System.out.println(roundedSquare);


        return roundedSquare;
        




    }
}