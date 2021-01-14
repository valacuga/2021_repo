class CodeWars {
    public static PawnDistance redKnight(int knight, long pawn) {
        String color = "";
        long knightMove = knight;
        knightMove += pawn;
        pawn *= 2;
        if (knightMove % 2 == 0) {
            color = "White";
        } else color = "Black";

        return new PawnDistance(color, pawn);
    }




}