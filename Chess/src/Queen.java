public class Queen extends Piece{
    public static String whiteSymbol = "♛";
    public static String blackSymbol = "♕";
    public Queen(String id, ChessColor color, String symbol) {
        super(id, color, symbol);
    }
    public Queen(String id, ChessColor color) {
        super(id, color,color == ChessColor.White ? whiteSymbol : blackSymbol);
    }

    public boolean canItMove(Board board,Move move) {
        //Tile tile = board.board[endY][endX];
        Piece piece = board.getPiece(move.endX, move.endY);


        if(piece != null && piece.color == this.color) {
            return false;
        }

        if(move.startX == move.endX && move.startY == move.endY){
            return false;
        }

        if(move.startY == move.endY) {
            return board.unObstructedPathHorizontal(move.startX, move.endX, move.endY);
        }

        if(move.startX == move.endX) {
            return board.unObstructedPathVertical(move.endX, move.startY, move.endY);
        }

        if(Math.abs(move.endX-move.startX) != Math.abs(move.endY - move.startY)) {
            return false;
        }

        if(move.startX != move.endX && move.startY != move.endY) {
            return board.unObstructedPathDiagnol(move.startX, move.startY, move.endX, move.endY);
        }

        return false;
    }

//    public boolean canItMove(Board board, Move move) {
//        return canItMove(board, move.startX, move.startY, move.endX, move.endY);
//    }


}
