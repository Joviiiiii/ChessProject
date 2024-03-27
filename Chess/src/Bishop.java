public class Bishop extends Piece{
    public Bishop(String id, ChessColor color, String symbol) {
        super(id, color, symbol);
    }

    @Override
    public boolean move(int startX, int startY, int endX, int endY) {
        return false;
    }
}
