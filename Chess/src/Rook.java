public class Rook extends Piece {
    public Rook(String id, ChessColor color, String symbol) {
        super(id, color, symbol);
    }

    @Override
    public boolean canItMove(int startX, int startY, int endX, int endY) {
        //rule check on same horizontal line & vertical line
        if(Board.board[startY][startX] == Board.board[endY][endX]){
            return false;
        }

        //rule check on same horizontal line & vertical line
        if(Board.board[startY][startX]) {

        }

        // is there anything in between
        if(!Tile.unObstructedPathHorizontal(startX, endX, endY)) {
            return false;
        }


        // Last enemy check
        if() {

        }

        //Add an exception that says if piece ahead is opposite piece + 1
        return true;
    }

}
