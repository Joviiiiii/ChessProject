import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
public class KingTest {

    @Test
    public void canItMoveTrueEndYIsOne() {
        new Board();

        King king = new King("K1", ChessColor.Black, "♔");


        Assertions.assertTrue(king.canItMove(5,5, 5, 6));
    }

    @Test
    public void canItMoveFalseEndXEqualsTwo(){
        new Board();

       King king = new King("K1", ChessColor.Black, "♔");

        Assertions.assertFalse(king.canItMove(4,5, 7, 5));
    }
    @Test
    public void canItMoveTrueWithEnemyPieceAtSpot() {
        new Board();


        Pawn pawn = new Pawn("pawn1", ChessColor.White, "♟");

        King king = new King("K1", ChessColor.Black, "♔");

        Board.applyMove(new Tile(pawn), 0, 1, 7, 2);


        Assertions.assertTrue(king.canItMove(7,1, 7, 2));

    }

    @Test
    public void canItMoveBackHorizontalTrue() {
        new Board();


        King king = new King("K1", ChessColor.Black, "♔");


        Assertions.assertTrue(king.canItMove(5,1, 6, 1));

    }
}
