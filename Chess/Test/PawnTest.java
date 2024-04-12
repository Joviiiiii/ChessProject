import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.Arrays;
public class PawnTest {

    @Test
    public void canItmMoveForPawnTrue() {

        Pawn pawn1 = new Pawn("pawn1", ChessColor.White, "♙");

        Assertions.assertTrue(pawn1.canItMove(2, 2, 3, 3));
    }

    @Test
    public void canItMoveForPawnFalse() {

        Pawn pawn1 = new Pawn("pawn1", ChessColor.White, "♙");

        Assertions.assertFalse(pawn1.canItMove(2, 2, 7, 2));
    }

    @Test
    public void checkUnobstructedPathTrue() {
        Board board = new Board();
        board.newBoard();

        Pawn pawn1 = new Pawn("pawn1", ChessColor.Black, "♟");

    }

    @Test
    public void checkUnobstructedPathFalse() {
        Board board = new Board();
        board.newBoard();

        board.applyMove(new Tile(new Pawn("pawn1", ChessColor.Black, "♟")), 1,0, 5, 0);

        Pawn pw6 = new Pawn("pw", ChessColor.White, "♙");

    }

}