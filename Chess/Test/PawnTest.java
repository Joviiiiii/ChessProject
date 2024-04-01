import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.Arrays;
public class PawnTest {

    @Test
    public void canItmMoveForPawnTrue() {
        Board board = new Board();
        board.newBoard();

        Pawn pawn1 = new Pawn("pawn1", ChessColor.White, "♙");

        Assertions.assertTrue(pawn1.canItMove(2, 2, 3, 3));
    }

    @Test
    public void canItMoveForPawnFalse() {

    }

}
