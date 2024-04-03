public class FakeMain {
    public static void main(String [] args) {
        Board board = new Board();
        board.newBoard();
        board.applyMove(new Tile(new Pawn("pawn1", ChessColor.Black, "♟")), 1,0, 5, 0);

        System.out.println(board);
    }
}
