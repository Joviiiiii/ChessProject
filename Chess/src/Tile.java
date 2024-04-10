public class Tile {

    Piece piece;

    public Tile(Piece piece) {
        this.piece = piece;
    }

    public Tile() {
        this.piece = null;
    }


    public String toString() {
        if (this.piece == null)
            return " - ";

        return this.piece.symbol;
    }

}
