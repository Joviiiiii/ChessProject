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

        Queen queen = new Queen("Q1", ChessColor.Black, "♛");


        Assertions.assertTrue(queen.canItMove(5,5, 7, 2));

    }

    @Test
    public void canItMoveFalse() {
        new Board();


        Pawn pawn = new Pawn("pawn1", ChessColor.Black, "♟");

        Queen queen = new Queen("Q1", ChessColor.Black, "♛");


        Assertions.assertTrue(queen.canItMove(5,5, 7, 2));

    }

}
