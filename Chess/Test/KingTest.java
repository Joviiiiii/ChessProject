import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
public class KingTest {

    @Test
    public void canItMoveTrueVerticalIsOne() {
        Board board =new Board();

        King king = new King("K1", ChessColor.Black, "♔");
        board.setPiece(king,5,5);


        Assertions.assertTrue(king.canItMove(board, new Move(5,5,5,6,ChessColor.Black)));
    }

    @Test
    public void canItMoveTrueVerticalBackwards() {
        Board board =new Board();

        King king = new King("K1", ChessColor.Black, "♔");
        board.setPiece(king,5,5);


        Assertions.assertTrue(king.canItMove(board, new Move(5,5,5,4,ChessColor.Black)));
    }

   @Test
   public void canItMoveFalseVerticalMoreThanOne() {
       Board board = new Board();

       King king = new King("K1", ChessColor.Black, "♔");
       board.setPiece(king, 3,4);
       Assertions.assertFalse(king.canItMove(board, 3,4, 4, 7 ));
   }

    @Test
    public void canItMoveFalseHorizontalEndXEqualsTwo(){
        Board board = new Board();

        King king = new King("K1", ChessColor.Black, "♔");
        board.setPiece(king, 4,5);
        Assertions.assertFalse(king.canItMove(board, 4,5, 6, 5));
    }
    @Test
    public void canItMoveTrueWithEnemyPieceAtSpot() {
        Board board = new Board();


        Pawn pawn = new Pawn("pawn1", ChessColor.White, "♟");

        King king = new King("K1", ChessColor.Black, "♔");
        board.setPiece(king, 7,1);
        board.setPiece(pawn,7,2);

        Assertions.assertTrue(king.canItMove(board, 7,1, 7, 2));

    }

    @Test
    public void canItMovePieceOfSameColorFalse() {
        Board board = new Board();


        Pawn pawn = new Pawn("pawn1", ChessColor.Black, "♟");

        King king = new King("K1", ChessColor.Black, "♔");
        board.setPiece(king, 7,1);
        board.setPiece(pawn,7,2);

        Assertions.assertFalse(king.canItMove(board, 7,1, 7, 2));
    }

    @Test
    public void canItMoveHorizontalTrue() {
        Board board = new Board();

        King king = new King("K1", ChessColor.Black, "♔");
        board.setPiece(king,5,1);

        Assertions.assertTrue(king.canItMove(board,5 ,1, 6, 1));

    }
    @Test
    public void canItMoveBackHorizontalTrue() {
        Board board = new Board();

        King king = new King("K1", ChessColor.Black, "♔");
        board.setPiece(king,5,1);

        Assertions.assertTrue(king.canItMove(board,5 ,1, 4, 1));
    }
    @Test
    public void canItMoveForwardDiagnolTrue() {
        Board board = new Board();


        King king = new King("K1", ChessColor.Black, "♔");
        board.setPiece(king,5,1);

        Assertions.assertTrue(king.canItMove(board,5 ,1, 6, 2));

    }

    @Test
    public void canItMoveBackwardsDiagnolTrue() {
        Board board = new Board();


        King king = new King("K1", ChessColor.Black, "♔");
        board.setPiece(king,6,2);

        Assertions.assertTrue(king.canItMove(board,6 ,2, 5, 1));
    }

    @Test
    public void canItMoveFalseDiagnolEndPositionsMoreThan1 () {
        Board board = new Board();


        King king = new King("K1", ChessColor.Black, "♔");
        board.setPiece(king,5,1);

        Assertions.assertFalse(king.canItMove(board,5 ,1, 7, 3));
    }


}
