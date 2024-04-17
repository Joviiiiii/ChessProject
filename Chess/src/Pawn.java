import static java.awt.Color.getColor;

public class Pawn extends Piece {


    public Pawn(String id, ChessColor color, String symbol) {
        super(id, color, symbol);
    }

    public boolean canItMove(Board board, int startX, int startY, int endX, int endY) {
        int direction = getColor() == ChessColor.White ? 1 : -1;
        int firstMove = getColor() == ChessColor.White ? 2 : -2;

        if (board.board[endY][endX] == null) {
            if (startX + direction == endX) {
                return true;
            } else if (startX + firstMove == endX &&
                    (this.color == ChessColor.White && startX == 6) ||
                    (this.color == ChessColor.Black && startX == 1)) {
                return true;
            } else {
                return false;
            }
        }
        return false;
    }

    public boolean canItMove(Board board, Move move) {
        return canItMove(board, move.startX, move.startY, move.endX, move.endY);
    }


    private ChessColor getColor() {
        return color;
    }


}
