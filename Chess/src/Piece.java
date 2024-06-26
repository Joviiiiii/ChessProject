public abstract class Piece {

    String symbol;
    String id;
    ChessColor color;
    public Piece(String id, ChessColor color, String symbol) {
        this.id = id;
        this.color = color;
        this.symbol = symbol;
    }
    public abstract boolean canItMove(Board board, Move move);

}