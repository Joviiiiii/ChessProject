public class Bishop extends Piece{
    public Bishop(String id, ChessColor color, String symbol) {
        super(id, color, symbol);
    }

    @Override
    public boolean canItMove(int startX, int startY, int endX, int endY) {
        Tile tile = Board.board[endY][endX];

      //  if(tile.piece == null) {
          //  return false;
     //   }

     //   if(tile.piece.color == this.color) {
        //    return false;
      //  }

        if(startX == endX && startY == endY){
            return false;
        }

        /**
        // diagnol up right
        if(startX + 1 == endX && startY + 1 == endY ) {
            if(!Board.unObstructedPathDiagnol(startX, startY, endX, endY)) {
                return false;
            }
        } **/

        for(int i= startX; i <= endX; i++) {
            for(int j=startY; j <= endY; j++) {
                if(!Board.unObstructedPathDiagnol(startX, startY, endX, endY)) {
                    return false;
                }
            }
        }

        // diagnol up left
        if(startX - 1 == endX && startY + 1 == endY) {
            if(!Board.unObstructedPathDiagnol(startX, startY, endX, endY)) {
                return false;
            }
        }

        //diagnol down right
        if(startX + 1 == endX && startY - 1 == endY) {
            if(!Board.unObstructedPathDiagnol(startX, startY, endX, endY)) {
                return false;
            }
        }

        for(int i= startX; i <= endX; i++) {
            for(int j=startY; j >= endY; j--) {
                if(!Board.unObstructedPathDiagnol(startX, startY, endX, endY)) {
                    return false;
                }
            }
        }

        //diagnol down left
        /**
        if(startX - 1 == endX && startY - 1 == endY) {
            if(!Board.unObstructedPathDiagnol(startX, startY, endX, endY)) {
                return false;
            }
        }**/



        return true;
    }

}
