public class Rook extends Piece{
    public Rook(String id, ChessColor color, String symbol) {
        super(id, color, symbol);
    }

    @Override
    public boolean canItMove(int startX, int startY, int endX, int endY) {
        int rowDirection = getColor() == ChessColor.White? 1 : -1;
        int colDirection = getColor() == ChessColor.White? 1 : -1;

        // Check if start x and end x is not null (path obstructed
        if((Board.board[endX][endY] == null)) {
            if(startX + rowDirection == endX ) {
                return true;
            }
            else if (startY + colDirection == endY) {
                return true;
            }
            else {
                return false;
            }
        }
        //Add an exception that says if piece ahead is opposite piece + 1
        return false;
    }

    @Override
    public boolean unObstructedPath(int startX, int startY, int endX, int endY) {
        return false;
    }

    private ChessColor getColor() {
        return color;
    }
}
