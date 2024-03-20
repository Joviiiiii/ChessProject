public abstract class Piece {

    String id;
    ChessColor color;
    public Piece(String id, ChessColor color) {
        this.id = id; this.color = color;
    }

    //Move
    public abstract void move(int x, int y);
}
