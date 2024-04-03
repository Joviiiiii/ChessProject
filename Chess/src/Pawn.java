import static java.awt.Color.getColor;

public class Pawn extends Piece {


    public Pawn(String id, ChessColor color, String symbol) {
        super(id, color, symbol);
    }

    @Override
    public  boolean canItMove(int startX, int startY, int endX, int endY) {
        int direction = getColor() == ChessColor.White ? 1 : -1;
        int firstMove = getColor() == ChessColor.White ? 2 : -2;

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

    @Override
    public boolean unObstructedPath(int startX, int startY, int endX, int endY) {
        int rowMove = (startX < endX) ? 1 : -1;
        int colMove = (startY < endY) ? 1 : -1;

            for (int i =startX; i <= endX; i +=rowMove) {
                for (int j = startY; j <= endY; j += colMove) {
                    if (Board.board[i][j] == null)
                        return true;
                }
            }
        return false;
    }

    public boolean UnObstructedPathHorizontal(int startX, int endX) {
        int rowMove = (startX < endX) ? 1 : -1;



        return true;
    }


    private ChessColor getColor() {
        return color;
    }


}
