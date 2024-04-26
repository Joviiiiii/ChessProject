import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
public class CheckTest {
    @Test
    public void checkTestTrue(){
        Board board = new Board();
        King king = new King("KingW", ChessColor.White);
        Rook rook = new Rook("RB", ChessColor.Black);

        board.setPiece(king, 5, 5);
        board.setPiece(rook,3,5);
        board.boardDisplay();
        Assertions.assertTrue(board.check(ChessColor.White));
    }

    @Test
    public void checkTestFalse(){
        Board board = new Board();
        King king = new King("KingW", ChessColor.White);
        Queen queen = new Queen("RB", ChessColor.Black);

        board.setPiece(king, 5, 5);
        board.setPiece(queen,3,3);
        board.boardDisplay();
        Assertions.assertFalse(board.check(ChessColor.White));

    }
}
