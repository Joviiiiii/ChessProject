public class Rook extends Piece {
    public Rook(String id, ChessColor color, String symbol) {
        super(id, color, symbol);
    }

    @Override
    public boolean canItMove(Board board, Move move) {
        // piece means target piece (the location we are trying to move to)
        Piece piece = board.getPiece(move.endX, move.endY);

        if(piece != null && piece.color == this.color) {
            return false;
        }

        if(move.startX == move.endX && move.startY == move.endY){
            return false;
        }

        //rule check on same horizontal line & vertical line
        if(move.startY == move.endY) {
            if(!board.unObstructedPathHorizontal(move.startX, move.endX, move.endY)) {
                return false;
            }
        }

        if(move.startX == move.endX) {
            if(!board.unObstructedPathVertical(move.endX, move.startY, move.endY)) {
                return false;
            }
        }

        return true;
    }

    public boolean canItMove(Board board, int startX, int startY, int endX, int endY){
        return canItMove(board, new Move(startX, startY, endX, endY, ChessColor.Black));
    }

}
