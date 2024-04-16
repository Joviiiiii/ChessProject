public class Rook extends Piece {
    public Rook(String id, ChessColor color, String symbol) {
        super(id, color, symbol);
    }

    @Override
    public boolean canItMove(Board board, Move move) {
        Piece piece = board.getPiece(move.startX, move.startY);

        if(piece != null && piece.color == this.color) {
            return false;
        }

        if(move.startX == move.endX && move.startY == move.endY){
            return false;
        }

        //rule check on same horizontal line & vertical line
        if(move.startY == move.endY) {
            if(!Board.unObstructedPathHorizontal(move.startX, move.endX, move.endY)) {
                return false;
            }
        }

        if(move.startX == move.endX) {
            if(!Board.unObstructedPathVertical(move.endX, move.startY, move.endY)) {
                return false;
            }
        }

        return true;
    }

}
