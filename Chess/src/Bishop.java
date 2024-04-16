public class Bishop extends Piece{
    public Bishop(String id, ChessColor color, String symbol) {
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

        return Board.unObstructedPathDiagnol(move.startX, move.startY, move.endX, move.endY);
    }

}
