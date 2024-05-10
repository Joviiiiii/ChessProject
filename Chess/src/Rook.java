public class Rook extends Piece {

    public static String whiteSymbol = "♜";
    public static String blackSymbol = "♖";
    public Rook(String id, ChessColor color, String symbol){super(id,color,symbol);}
    public Rook(String id, ChessColor color) {
        super(id, color, color == ChessColor.White ? whiteSymbol : blackSymbol);
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
            return board.unObstructedPathHorizontal(move.startX, move.endX, move.endY);
        }

        if(move.startX == move.endX) {
            return board.unObstructedPathVertical(move.endX, move.startY, move.endY);
        }
        return false;
    }
}
