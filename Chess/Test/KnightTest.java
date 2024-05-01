import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
public class KnightTest {
    @Test
    public void canItMoveTrueVertical() {
        Board board = new Board();

        Knight knight = new Knight("KB",ChessColor.Black, "♞");
;       board.setPiece(knight,5,5);

        Assertions.assertTrue(knight.canItMove(board, 5,5, 6, 7));
    }

    @Test
    public void canItMoveFalseEndXMoreThanOneAway(){
        Board board = new Board();

        Knight knight = new Knight("KB",ChessColor.Black, "♞");
        board.setPiece(knight,5,5);
        Assertions.assertFalse(knight.canItMove(board, 5,5, 7, 7));
    }
    @Test
    public void canItMoveTrueWithEnemyPieceAtSpot() {
        Board board = new Board();


        Pawn pawn = new Pawn("pawn1", ChessColor.White, "♟");

        Knight knight = new Knight("KB",ChessColor.Black, "♞");
        board.setPiece(knight,5,5);
        board.setPiece(pawn,6,7);
        //board.applyMove(new Tile(pawn), 0, 1, 6, 7);


        Assertions.assertTrue(knight.canItMove(board, 5,5, 6, 7));

    }

    @Test
    public void canItMoveHorizontal() {
        Board board = new Board();


        Knight knight = new Knight("KB",ChessColor.Black, "♞");

        board.setPiece(knight,5,5);
        Assertions.assertTrue(knight.canItMove(board, 5,5, 3, 4));
        e

    }
    
}
