import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
public class QueenTest {

    @Test
    public void canItMoveTrue() {
        new Board();

        Queen queen = new Queen("Q1", ChessColor.Black, "♛");


        Assertions.assertTrue(queen.canItMove(5,5, 7, 2));
    }
    @Test
    public void canItMoveTrueWithPieceAtSpot() {
        new Board();



        Pawn pawn = new Pawn("pawn1", ChessColor.White, "♟");

        Board.applyMove(new Tile(pawn), 0, 1, 7, 2);


        Queen queen = new Queen("Q1", ChessColor.Black, "♛");


        Assertions.assertTrue(queen.canItMove(5,5, 7, 2));

    }

    @Test
    public void canItMoveFalseWithSameColorPieceAtSpot() {
        new Board();


        Pawn pawn = new Pawn("pawn1", ChessColor.Black, "♟");

        Queen queen = new Queen("Q1", ChessColor.Black, "♛");

        Board.applyMove(new Tile(pawn), 0, 1, 7, 2);

        Assertions.assertFalse(queen.canItMove(5,5, 7, 2));

    }

}
