import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
public class BishopTest {

    @Test
    public void canItMoveTrue() {
        Board board = new Board();

        Bishop bishop = new Bishop("Bishop1", ChessColor.Black, "♝");

        Assertions.assertTrue(bishop.canItMove(board, new Move(5,5, 7, 2, ChessColor.Black)));
    }
    @Test
    public void canItMoveTrueWithPieceAtSpot() {
        Board  board = new Board();

        Bishop bishop = new Bishop("Bishop1", ChessColor.Black, "♝");

        Pawn pawn = new Pawn("pawn1", ChessColor.White, "♟");

        board.applyMove( 0, 1, 7, 2);

        Assertions.assertTrue(bishop.canItMove(board,new Move(5,5,7,2, ChessColor.White)));

    }

    @Test
    public void canItMoveFalse() {
        Board board = new Board();

        Bishop bishop = new Bishop("bishop1", ChessColor.Black, "♝");

        Pawn pawn = new Pawn("pawn1", ChessColor.Black, "♟");
        board.setPiece(bishop,0,1);
        board.setPiece(pawn, 1,2);
        //board.applyMove(0, 1, 2, 2);


        board.boardDisplay();

        Assertions.assertFalse(bishop.canItMove(board,new Move(0,1,1,2,ChessColor.Black)));

    }
}
