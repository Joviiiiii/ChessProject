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

    }

    @Test
    public void canItMoveFalse() {
        new Board();

    }
}
