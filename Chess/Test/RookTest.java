import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.Arrays;
public class RookTest {

    @Test
    public void canItmMoveForRookFalse() {

        Board board = new Board();

        Rook rook1 = new Rook("rook1", ChessColor.Black, "♜");

        Pawn pawn1 = new Pawn ("pawn1", ChessColor.Black, "♟");

        board.applyMove(0,0,0,2);

        Assertions.assertFalse(rook1.canItMove(0 , 0, 0, 2));
    }

    @Test
    public void canItMoveForRookTrue() {

        Rook rook1 = new Rook("rook1", ChessColor.Black, "♜");

        Rook rook2 = new Rook("rook2", ChessColor.White, "♖");

        Board board = new Board();
        board.setPiece(rook1, 0,0);
        board.setPiece(rook2, 0, 2);


        Assertions.assertTrue(rook1.canItMove(0 , 0, 0, 2));
    }


}
