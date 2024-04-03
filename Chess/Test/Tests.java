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
                "1| ♜ | ♞ | ♝ | ♚ | ♛ | ♝ | ♞ | ♜ | \n" +
                "2| ♟ | ♟ | ♟ | ♟ | ♟ | ♟ | ♟ | ♟ | \n" +
                "3|  -  |  -  |  -  |  -  |  -  |  -  |  -  |  -  | \n" +
                "4|  -  |  -  |  -  |  -  |  -  |  -  |  -  |  -  | \n" +
                "5|  -  |  -  |  -  |  -  |  -  |  -  |  -  |  -  | \n" +
                "6|  -  |  -  |  -  |  -  |  -  |  -  |  -  |  -  | \n" +
                "7| ♙ | ♙ | ♙ | ♙ | ♙ | ♙ | ♙ | ♙ | \n" +
                "8| ♖ | ♘ | ♗ | ♔ | ♕ | ♗ | ♘ | ♖ | \n";

        Assertions.assertEquals(expected, board.toString());
    }

    @Test
    public void checkingApplyMove () {
        Board board = new Board();
        board.newBoard();

        board.applyMove(new Tile(new Pawn("pawn1", ChessColor.Black, "♟")), 1,0, 2, 0);

        String expected = "    A     B     C     D     E     F     G     H   \n" +
                "1| ♜ | ♞ | ♝ | ♚ | ♛ | ♝ | ♞ | ♜ | \n" +
                "2|  -  | ♟ | ♟ | ♟ | ♟ | ♟ | ♟ | ♟ | \n" +
                "3| ♟ |  -  |  -  |  -  |  -  |  -  |  -  |  -  | \n" +
                "4|  -  |  -  |  -  |  -  |  -  |  -  |  -  |  -  | \n" +
                "5|  -  |  -  |  -  |  -  |  -  |  -  |  -  |  -  | \n" +
                "6|  -  |  -  |  -  |  -  |  -  |  -  |  -  |  -  | \n" +
                "7| ♙ | ♙ | ♙ | ♙ | ♙ | ♙ | ♙ | ♙ | \n" +
                "8| ♖ | ♘ | ♗ | ♔ | ♕ | ♗ | ♘ | ♖ | \n";

        Assertions.assertEquals(expected, board.toString());
    }
}
