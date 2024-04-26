import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
public class CheckMateTest {
    @Test
    public void checkMateTestTrue(){
        Board board = new Board();
        King king = new King("KingW", ChessColor.White);
        Rook rook = new Rook("RB", ChessColor.Black);
        Queen queen = new Queen("QueenB", ChessColor.Black);
        Pawn pawn = new Pawn("P1", ChessColor.Black);
        Bishop bishop = new Bishop("Bishop1B", ChessColor.Black);
        Pawn pawn2 = new Pawn("P2", ChessColor.Black);


        board.setPiece(king, 5, 5);
        board.setPiece(rook, 4, 5);
        board.setPiece(queen, 5, 4);
        board.setPiece(pawn, 6, 5);
        board.setPiece(bishop, 7, 7);
        board.setPiece(pawn2, 6, 4);
        board.boardDisplay();
        Assertions.assertTrue(board.check(ChessColor.White));
    }
    @Test
    public void checkMateTestFalse(){
        Board board = new Board();
        King king = new King("KingW", ChessColor.White);
        Rook rook = new Rook("RB", ChessColor.Black);
        Queen queen = new Queen("QueenB", ChessColor.Black);
        Pawn pawn = new Pawn("P1", ChessColor.Black);
        Bishop bishop = new Bishop("Bishop1B", ChessColor.Black);
        Pawn pawn2 = new Pawn("P2", ChessColor.Black);


        board.setPiece(king, 4, 6);
        board.setPiece(rook, 0, 7);
        board.setPiece(queen, 5, 4);
        board.setPiece(pawn, 1, 1);
        board.setPiece(bishop, 7, 7);
        board.setPiece(pawn2, 1, 2);
        board.boardDisplay();
        Assertions.assertFalse(board.check(ChessColor.White));
    }
}
