public class Rook extends Piece{
    public Rook(String id, ChessColor color, String symbol) {
        super(id, color, symbol);
    }

    @Override
    public boolean canItMove(int startX, int startY, int endX, int endY) {
        int rowDirection = getColor() == ChessColor.White ? endX - startX : -(endX - startX);
        int colDirection = getColor() == ChessColor.White? endY - startY : -(endY -startY);


        // Check if start x and end x is not null (path obstructed)
        if((Board.board[endX][endY] == null) || (Board.board[startX][endY]== null) ||
                (Board.board[endX][startY] == null)) {
            if(startX + rowDirection == endX && startY + colDirection == endY){
                return true;
            }
            else {
                return false;
            }
        }

        //Add an exception that says if piece ahead is opposite piece + 1
        return false;
    }


    private ChessColor getColor() {
        return color;
    }
}
