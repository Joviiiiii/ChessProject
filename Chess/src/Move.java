public class Move {
    int startX;
    int startY;
    int endX;
    int endY;

    ChessColor color;
    public Move(int startX, int startY, int endX, int endY, ChessColor color){
        this.startX = startX;
        this.startY = startY;
        this.endX = endX;
        this.endY = endY;
        this.color = color;
    }
}

