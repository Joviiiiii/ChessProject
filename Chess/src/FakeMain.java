public class FakeMain {
    public static void main(String [] args) {
        Board board = new Board();
        board.newBoard();
        board.applyMove(new Tile(new Pawn("pawn1", ChessColor.Black, "♟")), 2,1, 5, 1);

        System.out.println(board);
    }
}
