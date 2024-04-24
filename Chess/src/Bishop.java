public class Bishop extends Piece{
    public Bishop(String id, ChessColor color, String symbol) {
        super(id, color, symbol);
    }

    @Override
    public boolean canItMove(Board board, Move move) {
        Piece piece = board.getPiece(move.startX, move.startY);
        Piece piece1 = board.getPiece(move.endX, move.endY);

       if(piece1 != null && piece1.color == this.color) {
            return false;
       }

        if(move.startX == move.endX && move.startY == move.endY){
            return false;
        }


        return board.unObstructedPathDiagnol(move.startX, move.startY, move.endX, move.endY);
    }

}
