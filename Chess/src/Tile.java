public class Tile {

    Piece piece;

    public Tile(Piece piece) {
        this.piece = piece;
    }

    public Tile() {
        this.piece = null;
    }

    //
    /** public movedTile(Move ) {
        if(move = this.piece[pos+1]) {
            this.piece = null;
        }
    }**/


    public String toString() {
        if (this.piece == null)
            return "- ";

        return this.piece.symbol;
    }

}
