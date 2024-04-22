import static java.awt.Color.getColor;

public class Pawn extends Piece {


    public Pawn(String id, ChessColor color, String symbol) {
        super(id, color, symbol);
    }

    public boolean canItMove(Board board, int startX, int startY, int endX, int endY) {
        int direction = getColor() == ChessColor.White ? -1 : 1;
        int firstMove = getColor() == ChessColor.White ? -2 : 2;

        if (board.board[endY][endX].piece == null) {
            if (startY + direction == endY &&  startX == endX) {
                return true;
            } else if (startY + firstMove == endY &&
                    (this.color == ChessColor.White && startY == 6) ||
                    (this.color == ChessColor.Black && startY == 1)) {
                return true;
            } else {
                return false;
            }
        } else {
            return (endX == startX + 1 || endX == startX - 1) && (endY == startY + direction) && board.getPiece(endX, endY).color != this.color;
        }
    }

    public boolean canItMove(Board board, Move move) {
        return canItMove(board, move.startX, move.startY, move.endX, move.endY);
    }


    private ChessColor getColor() {
        return color;
    }


}
