import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
public class QueenTest {

    @Test
    public void canItMoveTrue() {
        Board board = new Board();

        Queen queen = new Queen("Q1", ChessColor.Black, "♛");
        board.setPiece(queen,5,5);

        Assertions.assertTrue(queen.canItMove(board, new Move(5,5,7,2, ChessColor.Black)));
    }
    @Test
    public void canItMoveTrueWithPieceAtSpot() {
        Board board = new Board();



        Pawn pawn = new Pawn("pawn1", ChessColor.White, "♟");

        //board.applyMove(new Tile(pawn), 0, 1, 7, 2);


        Queen queen = new Queen("Q1", ChessColor.Black, "♛");
        board.setPiece(pawn,7,2);
        board.setPiece(queen,5,5);

        Assertions.assertTrue(queen.canItMove(board,new Move(5,5,7,2, ChessColor.Black)));

    }

    @Test
    public void canItMoveFalseWithSameColorPieceAtSpot() {
        Board board = new Board();


        Pawn pawn = new Pawn("pawn1", ChessColor.Black, "♟");

        Queen queen = new Queen("Q1", ChessColor.Black, "♛");

        board.setPiece(pawn, 7,2);
        board.setPiece(queen, 5,5);

        board.boardDisplay();

       // board.applyMove(0,1,7,2);

        //board.applyMove(new Tile(pawn), 0, 1, 7, 2);

        Assertions.assertFalse(queen.canItMove(board, new Move(5,5,7,2,ChessColor.Black)));

    }

}
