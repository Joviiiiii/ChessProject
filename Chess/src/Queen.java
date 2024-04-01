public class Queen extends Piece{
    public Queen(String id, ChessColor color, String symbol) {
        super(id, color, symbol);
    }

    @Override
    public boolean canItMove(int startX, int startY, int endX, int endY) {
        return false;
    }

    @Override
    public boolean unObstructedPath(int startX, int startY, int endX, int endY) {
        return false;
    }
}
