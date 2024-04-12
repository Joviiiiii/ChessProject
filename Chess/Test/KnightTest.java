import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
public class KnightTest {
    @Test
    public void canItMoveTrueVertical() {
        new Board();

        Knight knight = new Knight("KB",ChessColor.Black, "♞");
;

        Assertions.assertTrue(knight.canItMove(5,5, 6, 7));
    }

    @Test
    public void canItMoveFalseEndXMoreThanOneAway(){
        new Board();

        Knight knight = new Knight("KB",ChessColor.Black, "♞");

        Assertions.assertFalse(knight.canItMove(5,5, 7, 7));
    }
    @Test
    public void canItMoveTrueWithEnemyPieceAtSpot() {
        new Board();


        Pawn pawn = new Pawn("pawn1", ChessColor.White, "♟");

        Knight knight = new Knight("KB",ChessColor.Black, "♞");

        Board.applyMove(new Tile(pawn), 0, 1, 6, 7);


        Assertions.assertTrue(knight.canItMove(5,5, 6, 7));

    }

    @Test
    public void canItMoveHorizontal() {
        new Board();


        Knight knight = new Knight("KB",ChessColor.Black, "♞");


        Assertions.assertTrue(knight.canItMove(5,5, 3, 4));

    }
    
}
