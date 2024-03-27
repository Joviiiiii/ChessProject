import static java.awt.Color.getColor;

public class Pawn extends Piece {


    public Pawn(String id, ChessColor color, String symbol) {
        super(id, color, symbol);
    }

    @Override
    public boolean move(int startX, int startY, int endX, int endY) {
        int direction = getColor() == ChessColor.White ? 1 : -1;
        int firstMove = getColor() == ChessColor.White ? 2 : -2;

        // if Pawn start position and end position diagnol reject
        // if move start and end horizontal deny

        // if moves end > start by 2 deny (except at first)

        // if move is backwards "deny" (?)

        //Allow Move Basic
        if (Board.board[endX][endY] == null) {
            if(startX + direction == endX) {
                return true;
            }
            else if (startX + firstMove == endX &&
                    (this.color == ChessColor.White && startX == 6) ||
                    (this.color == ChessColor.Black && startX == 1) ) {
                return true;
            }
            else {
                return false;
            }
        }
        return false;
    }

    private ChessColor getColor() {
        return color;
    }


}
