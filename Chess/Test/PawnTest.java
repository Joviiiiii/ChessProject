import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.Arrays;
public class PawnTest {

    @Test
    public void canItMoveForPawnTrueOppColorAtEndPosition() {
        Board board = new Board();

        Pawn pawn1 = new Pawn("pawn1", ChessColor.Black, "♟");
        Pawn pawn2 = new Pawn("pawn1", ChessColor.White, "♙");

        board.setPiece(pawn1, 2,2);
        board.setPiece(pawn2, 3,3);
        board.boardDisplay();

        Assertions.assertTrue(pawn1.canItMove(board, 2, 2, 3, 3));
    }

    @Test
    public void canItMoveForPawnFalseHorizontal() {
        Board board = new Board();

        Pawn pawn1 = new Pawn("pawn1", ChessColor.White, "♙");
        board.setPiece(pawn1,2,2);

        Assertions.assertFalse(pawn1.canItMove(board, 2, 2, 7, 2));
    }

    @Test
    public void canItMoveBackwardsVerticalFalse() {
        Board board = new Board();

        Pawn pawn1 = new Pawn("pawn1", ChessColor.Black, "♙");
        board.setPiece(pawn1,2,2);

        Assertions.assertFalse(pawn1.canItMove(board, 2, 2, 2, 1));
    }

    @Test
    public void canItMoveDiagnolFalse() {
        Board board = new Board();

        Pawn pawn1 = new Pawn("pawn1", ChessColor.White, "♙");
        board.setPiece(pawn1,2,2);

        Assertions.assertFalse(pawn1.canItMove(board, 2, 2, 3, 3));
    }

    @Test
    public void canItMoveFalseSameColorPieceAtEndPosition() {
        Board board = new Board();

        Pawn pawn1 = new Pawn("pawn1", ChessColor.Black, "♟");
        Pawn pawn2 = new Pawn("pawn1", ChessColor.Black, "♙");

        board.setPiece(pawn1, 2,2);
        board.setPiece(pawn2, 3,3);

        Assertions.assertFalse(pawn1.canItMove(board, 2, 2, 3, 3));
    }

    @Test
    public void canItMoveTrueTwoSpacesOnFirstTurn() {
        Board board = new Board();

        Pawn pawn1 = new Pawn("pawn1", ChessColor.Black, "♟");

        board.setPiece(pawn1, 2,2);

        Assertions.assertFalse(pawn1.canItMove(board, 2, 2, 2, 4));
    }

}
