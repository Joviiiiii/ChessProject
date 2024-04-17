import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
public class KingTest {

    @Test
    public void canItMoveTrueEndYIsOne() {
        Board board =new Board();

        King king = new King("K1", ChessColor.Black, "♔");


        Assertions.assertTrue(king.canItMove(board, new Move(5,5,5,6,ChessColor.Black)));
    }

    @Test
    public void canItMoveFalseEndXEqualsTwo(){
        Board board = new Board();

       King king = new King("K1", ChessColor.Black, "♔");

        Assertions.assertFalse(king.canItMove(board, 4,5, 7, 5));
    }
    @Test
    public void canItMoveTrueWithEnemyPieceAtSpot() {
        Board board = new Board();


        Pawn pawn = new Pawn("pawn1", ChessColor.White, "♟");

        King king = new King("K1", ChessColor.Black, "♔");

        board.applyMove(0, 1, 7, 2);


        Assertions.assertTrue(king.canItMove(board, 7,1, 7, 2));

    }

    @Test
    public void canItMoveBackHorizontalTrue() {
        Board board = new Board();


        King king = new King("K1", ChessColor.Black, "♔");


        Assertions.assertTrue(king.canItMove(board,5 ,1, 6, 1));

    }
}
