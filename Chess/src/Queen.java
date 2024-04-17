public class Queen extends Piece{
    public Queen(String id, ChessColor color, String symbol) {
        super(id, color, symbol);
    }

    public boolean canItMove(Board board, int startX, int startY, int endX, int endY) {
        Tile tile = board.board[endY][endX];

        if(tile.piece != null && tile.piece.color == this.color) {
            return false;
        }

        if(startX == endX && startY == endY){
            return false;
        }

        if(startY == endY) {
            if(!board.unObstructedPathHorizontal(startX, endX, endY)) {
                return false;
            }
        }

        if(startX == endX) {
            if(!board.unObstructedPathVertical(endX, startY, endY)) {
                return false;
            }
        }

        if(startX != endX && startY != endY) {
            if(!board.unObstructedPathDiagnol(startX, startY, endX, endY)) {
                return false;
            }
        }

        return true;
    }

    public boolean canItMove(Board board, Move move) {
        return canItMove(board, move.startX, move.startY, move.endX, move.endY);
    }


}
