public class Bishop extends Piece{
    public Bishop(String id, ChessColor color, String symbol) {
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

        return Board.unObstructedPathDiagnol(startX, startY, endX, endY);
    }

}
