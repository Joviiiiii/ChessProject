public class Knight extends Piece{
    public Knight(String id, ChessColor color, String symbol) {
        super(id, color, symbol);
    }


    public boolean canItMove(Board board, int startX, int startY, int endX, int endY) {
        int diffX = endX - startX;
        int diffY = endY - startY;

        Tile tile = board.board[endY][endX];

        if(tile.piece != null && tile.piece.color == this.color) {
            return false;
        }

        if(startX == endX && startY == endY){
            return false;
        }

        if(Math.abs(diffX) == 1 && Math.abs(diffY) == 2) {
            return true;
        }

        if(Math.abs(diffX) == 2 && Math.abs(diffY) == 1) {
            return true;
        }
        return false;
    }

    public boolean canItMove(Board board, Move move) {
        return canItMove(board, move.startX, move.startY, move.endX, move.endY);
    }
}
