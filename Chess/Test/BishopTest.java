import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
public class BishopTest {

    @Test
    public void canItMoveTrueDiagnolUpRight() {
        Board board = new Board();

        Bishop bishop = new Bishop("Bishop1", ChessColor.Black, "♗");

        board.setPiece(bishop,2,7 );

        board.boardDisplay();

        Assertions.assertTrue(bishop.canItMove(board, new Move(2,7, 3, 6, ChessColor.Black)));
    }
    @Test
    public void canItMoveTrueDiagnolUpLeft() {
        Board board = new Board();

        Bishop bishop = new Bishop("Bishop1", ChessColor.Black, "♗");

        board.setPiece(bishop,2,7 );

        Assertions.assertTrue(bishop.canItMove(board, new Move(2,7, 1, 6, ChessColor.Black)));
    }

    @Test
    public void canItMoveTrueDiagnolDownRight() {
        Board board = new Board();

        Bishop bishop = new Bishop("Bishop1", ChessColor.Black, "♗");

        board.setPiece(bishop,1,6 );

        Assertions.assertTrue(bishop.canItMove(board, new Move(1,6, 2, 7, ChessColor.Black)));
    }

    @Test
    public void canItMoveTrueDiagnolDownLeft() {
        Board board = new Board();

        Bishop bishop = new Bishop("Bishop1", ChessColor.White, "♗");

        board.setPiece(bishop,3,6 );

        board.boardDisplay();

        Assertions.assertTrue(bishop.canItMove(board, new Move(3,6, 2, 7, ChessColor.Black)));
    }

    @Test
    public void canItMoveTrueWithOppositeColorPieceAtSpot() {
        Board  board = new Board();

        Bishop bishop = new Bishop("Bishop1", ChessColor.White, "♗");

        Pawn pawn = new Pawn("pawn1", ChessColor.Black, "♟");

        board.setPiece(bishop, 2, 7);

        board.setPiece(pawn, 7, 2);

        board.boardDisplay();

        Assertions.assertTrue(bishop.canItMove(board,new Move(2,7,7,2, ChessColor.White)));

    }

    @Test
    public void canItMoveFalseWithSameColorPiece() {
        Board board = new Board();

        Bishop bishop = new Bishop("bishop1", ChessColor.Black, "♝");

        Pawn pawn = new Pawn("pawn1", ChessColor.Black, "♟");
        board.setPiece(bishop,0,1);
        board.setPiece(pawn, 1,2);


        board.boardDisplay();

        Assertions.assertFalse(bishop.canItMove(board,new Move(0,1,1,2,ChessColor.Black)));

    }

    @Test
    public void canItMoveFalseVertical() {
        Board board = new Board();

        Bishop bishop = new Bishop("Bishop1", ChessColor.White, "♗");

        board.setPiece(bishop,2,7 );

        Assertions.assertFalse(bishop.canItMove(board, new Move(2,7, 2, 6, ChessColor.Black)));
    }
    @Test
    public void canItMoveFalseHorizontal() {
        Board board = new Board();

        Bishop bishop = new Bishop("Bishop1", ChessColor.White, "♗");

        board.setPiece(bishop,2,7 );


        Assertions.assertFalse(bishop.canItMove(board, new Move(2,7, 3, 7, ChessColor.Black)));
    }
    @Test
    public void canItMoveThroughAnotherPieceFalse() {
        Board board = new Board();

        Bishop bishop = new Bishop("bishop1", ChessColor.Black, "♝");

        Pawn pawn = new Pawn("pawn1", ChessColor.Black, "♟");
        board.setPiece(bishop,0,1);
        board.setPiece(pawn, 1,2);


        board.boardDisplay();

        Assertions.assertFalse(bishop.canItMove(board,new Move(0,1,2,3,ChessColor.Black)));
    }


}
