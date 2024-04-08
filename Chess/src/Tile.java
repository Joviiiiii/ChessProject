public class Tile {

    Piece piece;

    public Tile(Piece piece) {
        this.piece = piece;
    }

    public Tile() {
        this.piece = null;
    }

    public static boolean unObstructedPathHorizontal(int startX, int endX, int y) {
        int rowMove = (startX < endX) ? 1 : -1;

        for (int i = startX; i != endX; i += rowMove) {
            if(Board.board[y][i].piece != null) {
                System.out.println(Board.board[y][i].piece.symbol);
                return false;
            }
        }
        if(Board.board[y][rowMove].piece != null) {
            return false;
        }
        return true;
    }


    public String toString() {
        if (this.piece == null)
            return " - ";

        return this.piece.symbol;
    }

}
