import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
public class BishopTest {

    @Test
    public void canItMoveTrue() {
        new Board();

        Bishop bishop = new Bishop("Bishop1", ChessColor.Black, "♝");

        Assertions.assertTrue(bishop.canItMove(5,5, 7, 2));
    }
    @Test
    public void canItMoveTrueWithPieceAtSpot() {
        new Board();

        Bishop bishop = new Bishop("Bishop1", ChessColor.Black, "♝");

        Pawn pawn = new Pawn("pawn1", ChessColor.White, "♟");

        Board.applyMove(new Tile(pawn), 0, 1, 7, 2);

        Assertions.assertTrue(bishop.canItMove(5,5, 7, 2));

    }

    @Test
    public void canItMoveFalse() {
        new Board();

        Bishop bishop = new Bishop("Bishop1", ChessColor.Black, "♝");

        Pawn pawn = new Pawn("pawn1", ChessColor.Black, "♟");

        Board.applyMove(new Tile(pawn), 0, 1, 7, 2);

        Assertions.assertFalse(bishop.canItMove(5,5, 7, 2));

    }
}
