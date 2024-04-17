import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
public class QueenTest {

    @Test
    public void canItMoveTrue() {
        Board board = new Board();

        Queen queen = new Queen("Q1", ChessColor.Black, "♛");


        Assertions.assertTrue(queen.canItMove(board, 5,5, 7, 2));
    }
    @Test
    public void canItMoveTrueWithPieceAtSpot() {
        Board board = new Board();



        Pawn pawn = new Pawn("pawn1", ChessColor.White, "♟");

        board.applyMove(new Tile(pawn), 0, 1, 7, 2);


        Queen queen = new Queen("Q1", ChessColor.Black, "♛");


        Assertions.assertTrue(queen.canItMove(board, 5,5, 7, 2));

    }

    @Test
    public void canItMoveFalseWithSameColorPieceAtSpot() {
        Board board = new Board();


        Pawn pawn = new Pawn("pawn1", ChessColor.Black, "♟");

        Queen queen = new Queen("Q1", ChessColor.Black, "♛");

        board.applyMove(new Tile(pawn), 0, 1, 7, 2);

        Assertions.assertFalse(queen.canItMove(board, 5,5, 7, 2));

    }

}
