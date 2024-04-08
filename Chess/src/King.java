public class King extends Piece{
    public King(String id,ChessColor color, String symbol) {
        super(id, color, symbol);
    }

    @Override
    public boolean canItMove(int startX, int startY, int endX, int endY) {return false;
    }

}
