import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.Arrays;
public class Tests {

    //Test initialize of NewBoard
    @Test
    public void initializeNewBoard (){
        Board board = new Board();
        board.newBoard();

        String expected = "    A     B     C     D     E     F     G     H   \n" +
                "1| ♖ | ♘ | ♗ | ♔ | ♕ | ♗ | ♘ | ♖ | \n" +
                "2| ♙ | ♙ | ♙ | ♙ | ♙ | ♙ | ♙ | ♙ | \n" +
                "3|  -  |  -  |  -  |  -  |  -  |  -  |  -  |  -  | \n" +
                "4|  -  |  -  |  -  |  -  |  -  |  -  |  -  |  -  | \n" +
                "5|  -  |  -  |  -  |  -  |  -  |  -  |  -  |  -  | \n" +
                "6|  -  |  -  |  -  |  -  |  -  |  -  |  -  |  -  | \n" +
                "7| ♟ | ♟ | ♟ | ♟ | ♟ | ♟ | ♟ | ♟ | \n" +
                "8| ♜ | ♞ | ♝ | ♚ | ♛ | ♝ | ♞ | ♜ | \n";

        Assertions.assertEquals(expected, board.toString());
    }

    @Test
    public void checkingApplyMove () {
        Board board = new Board();
        board.newBoard();

        board.applyMove(new Tile(new Pawn("pawn1", ChessColor.Black, "♟")), 0,1, 0, 2);

        String expected = "    A     B     C     D     E     F     G     H   \n" +
                "1| ♖ | ♘ | ♗ | ♔ | ♕ | ♗ | ♘ | ♖ | \n" +
                "2|  -  | ♙ | ♙ | ♙ | ♙ | ♙ | ♙ | ♙ | \n" +
                "3| ♙ |  -  |  -  |  -  |  -  |  -  |  -  |  -  | \n" +
                "4|  -  |  -  |  -  |  -  |  -  |  -  |  -  |  -  | \n" +
                "5|  -  |  -  |  -  |  -  |  -  |  -  |  -  |  -  | \n" +
                "6|  -  |  -  |  -  |  -  |  -  |  -  |  -  |  -  | \n" +
                "7| ♟ | ♟ | ♟ | ♟ | ♟ | ♟ | ♟ | ♟ | \n" +
                "8| ♜ | ♞ | ♝ | ♚ | ♛ | ♝ | ♞ | ♜ | \n";

        Assertions.assertEquals(expected, board.toString());
    }

    @Test
    public void checkUnobstructedPathDiagnolTrue() {
        Board board = new Board();

        Assertions.assertTrue(board.unObstructedPathDiagnol(1,0,2,1));
    }

    @Test
    public void checkUnobstructedPathDiagnolFalse() {
        Board board = new Board();
        Pawn pawn = new Pawn("pawn", ChessColor.Black,"♟");
        board.setPiece(pawn,5,5);
        Assertions.assertFalse(board.unObstructedPathDiagnol(0,0,7,7));
    }
    @Test
    public void checkUnobstructedPathHorizontalTrue() {
        Board board = new Board();

        board.boardDisplay();
        Assertions.assertTrue(board.unObstructedPathHorizontal(1,2, 0));
    }
    @Test
    public void checkUnobstructedPathHorizontalFalse() {
        Board board = new Board();
        Pawn pawn = new Pawn("pawn", ChessColor.Black,"♟");
        board.setPiece(pawn,4,0);


        Assertions.assertFalse(board.unObstructedPathHorizontal(2,5,0));
    }


    @Test
    public void checkUnobstructedPathVerticalTrue() {
        Board board = new Board();

        Assertions.assertTrue(board.unObstructedPathVertical(0,1,2));
    }

    @Test
    public void checkUnobstructedPathVerticalFalse() {
        Board board = new Board();
        Pawn pawn = new Pawn("pawn", ChessColor.Black, "♟");
        board.setPiece(pawn, 1,3);
        board.boardDisplay();
        Assertions.assertFalse(board.unObstructedPathVertical(1,0,6));
    }

}
