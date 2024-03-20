public abstract class Piece {
    ChessColor color;
    public Piece(ChessColor color) {
        this.color = color;
    }

    //Move
    public abstract void move(int x, int y);
}
