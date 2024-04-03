import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.Arrays;
public class RookTest {

    @Test
    public void canItmMoveForRookFalse() {

        Rook rook1 = new Rook("rook1", ChessColor.Black, "♜");

        Pawn pawn1 = new Pawn ("pawn1", ChessColor.Black, "♟");

        Assertions.assertFalse(rook1.canItMove(0 , 0, 1, 1));
    }

    @Test
    public void canItMoveForRookTrue() {
        Board board = new Board();
        board.newBoard();

        Rook rook1 = new Rook("rook1", ChessColor.Black, "♜");

        Pawn pawn1 = new Pawn ("pawn1", ChessColor.Black, "♟");

        board.applyMove(new Tile (pawn1), 1, 0, 2, 0);

        Assertions.assertTrue(rook1.canItMove(0 , 0, 1, 0));
    }


}
