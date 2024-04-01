public abstract class Piece {

    String symbol;
    String id;
    ChessColor color;
    public Piece(String id, ChessColor color, String symbol) {
        this.id = id;
        this.color = color;
        this.symbol = symbol;
    }

    //Move
    public abstract boolean canItMove(int startX, int startY, int endX, int endY);
}
