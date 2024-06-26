import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.Arrays;
public class RookTest {

    @Test
    public void canItMoveForRookFalseWithSameColorPieceBlocking() {

        Board board = new Board();

        Rook rook1 = new Rook("rook1", ChessColor.Black, "♜");

        Pawn pawn1 = new Pawn ("pawn1", ChessColor.Black, "♟");

        board.setPiece(pawn1,0,2);
        board.setPiece(rook1,0,0);
        board.boardDisplay();
        Assertions.assertFalse(rook1.canItMove(board, new Move(0,0,0,2,ChessColor.Black)));
    }

    @Test
    public void canItmMoveForRookFalseWithPieceBlockingEndPosition() {

        Board board = new Board();

        Rook rook1 = new Rook("rook1", ChessColor.Black, "♜");

        Pawn pawn1 = new Pawn ("pawn1", ChessColor.Black, "♟");

        board.setPiece(pawn1,0,2);
        board.setPiece(rook1,0,0);
        board.boardDisplay();
        Assertions.assertFalse(rook1.canItMove(board, new Move(0,0,0,3,ChessColor.Black)));
    }

    @Test
    public void canItMoveForRookFalseObstructedPath() {

        Board board = new Board();

        Rook rook1 = new Rook("rook1", ChessColor.Black, "♜");

        Pawn pawn1 = new Pawn ("pawn1", ChessColor.Black, "♟");

        board.setPiece(pawn1,0,2);
        board.setPiece(rook1,0,0);
        board.boardDisplay();
        Assertions.assertFalse(rook1.canItMove(board, new Move(0,0,0,3,ChessColor.Black)));
    }

    @Test
    public void canItMoveVerticalForRookTrueWithOppopsiteColorPieceAtEndPosition() {

        Board board = new Board();

        Rook rook1 = new Rook("rook1", ChessColor.Black, "♜");

        Rook rook2 = new Rook("rook2", ChessColor.White, "♖");


        board.setPiece(rook1, 0,0);
        board.setPiece(rook2, 0, 2);
        board.boardDisplay();


        Assertions.assertTrue(rook1.canItMove(board,new Move(0,0,0,2,ChessColor.Black)));
    }
    @Test
    public void rookCanMoveToKing() {
        Board board = new Board();
        King king = new King("KingW", ChessColor.White);
        Rook rook = new Rook("RB", ChessColor.Black);

        board.setPiece(king, 5, 5);
        board.setPiece(rook, 3, 4);
        board.boardDisplay();
        Assertions.assertFalse(rook.canItMove(board, new Move(3, 4, 5, 5, ChessColor.Black)));
    }

    @Test
    public void canItMoveHorizontalTrue() {
        Board board = new Board();

        Rook rook1 = new Rook("rook1", ChessColor.Black, "♜");

        board.setPiece(rook1, 0,0);

        Assertions.assertTrue(rook1.canItMove(board,new Move(0,0,5,0,ChessColor.Black)));

    }
    @Test
    public void canItMoveHorizontalFalse() {
        Board board = new Board();

        Rook rook1 = new Rook("rook1", ChessColor.Black, "♜");
        Pawn pawn = new Pawn("P1", ChessColor.Black, "♟" );

        board.setPiece(pawn, 5, 0);

        board.setPiece(rook1, 0,0);

        Assertions.assertFalse(rook1.canItMove(board,new Move(0,0,5,0,ChessColor.Black)));

    }

    @Test
    public void canItMoveDiagnolFalse() {
            Board board = new Board();

            Rook rook1 = new Rook("rook1", ChessColor.Black, "♜");

            board.setPiece(rook1, 0,0);

            Assertions.assertFalse(rook1.canItMove(board,new Move(0,0,2,2,ChessColor.Black)));
    }

}
