public class Rook extends Piece {
    public Rook(String id, ChessColor color, String symbol) {
        super(id, color, symbol);
    }

    @Override
    public boolean canItMove(int startX, int startY, int endX, int endY) {
        Tile tile = Board.board[endY][endX];

        if(tile.piece != null && tile.piece.color == this.color) {
            return false;
        }

        if(startX == endX && startY == endY){
            return false;
        }

        //rule check on same horizontal line & vertical line
        if(startY == endY) {
            if(!Board.unObstructedPathHorizontal(startX, endX, endY)) {
                return false;
            }
        }

        if(startX == endX) {
            if(!Board.unObstructedPathVertical(endX, startY, endY)) {
                return false;
            }
        }

        return true;
    }

}
