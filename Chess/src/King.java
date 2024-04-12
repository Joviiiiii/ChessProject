public class King extends Piece{
    public King(String id,ChessColor color, String symbol) {
        super(id, color, symbol);
    }

    @Override
    public boolean canItMove(int startX, int startY, int endX, int endY) {
        int diffX = endX - startX;
        int diffY = endY - startY;

        Tile tile = Board.board[endY][endX];

        if(tile.piece != null && tile.piece.color == this.color) {
            return false;
        }

        if(startX == endX && startY == endY){
            return false;
        }

        if(Math.abs(diffX) <= 1 && Math.abs(diffY) <= 1) {
            return true;
        }

        return false;
    }

}
