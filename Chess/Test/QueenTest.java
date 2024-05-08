import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
public class QueenTest {

    @Test
    public void canItMoveDiagnolTrue() {
        Board board = new Board();

        Queen queen = new Queen("Q1", ChessColor.Black, "♛");
        int startX = 5;
        int startY = 4;
        board.setPiece(queen,startX,startY);

        Assertions.assertTrue(queen.canItMove(board, new Move(startX,startY,7,2, ChessColor.Black)));
    }

    @Test
    public void canItMoveForwardVerticalTrue() {
        Board board = new Board();

        Queen queen = new Queen("Q1", ChessColor.Black, "♛");
        int startX = 5;
        int startY = 4;
        board.setPiece(queen,startX,startY);

        Assertions.assertTrue(queen.canItMove(board, new Move(startX,startY,5,2, ChessColor.Black)));

    }

    @Test
    public void canItMoveBackwardsVerticalTrue() {
        Board board = new Board();

        Queen queen = new Queen("Q1", ChessColor.Black, "♛");
        int startX = 5;
        int startY = 4;
        board.setPiece(queen,startX,startY);

        Assertions.assertTrue(queen.canItMove(board, new Move(startX,startY,5,5, ChessColor.Black)));
    }

    @Test
    public void canItMoveHorizontalTrue() {
        Board board = new Board();

        Queen queen = new Queen("Q1", ChessColor.Black, "♛");
        int startX = 5;
        int startY = 4;
        board.setPiece(queen,startX,startY);

        Assertions.assertTrue(queen.canItMove(board, new Move(startX,startY,7,4, ChessColor.Black)));
    }

    @Test
    public void canItMoveHorizontalFalseWithSameColorAtSpot() {
        Board board = new Board();

        Queen queen = new Queen("Q1", ChessColor.Black, "♛");
        int startX = 5;
        int startY = 2;
        board.setPiece(queen,startX,startY);

        Pawn pawn = new Pawn("P1", ChessColor.Black, "♟" );
        board.setPiece(pawn, 7, 2);

        Assertions.assertFalse(queen.canItMove(board, new Move(startX,startY,7,2, ChessColor.Black)));
    }

    @Test
    public void canItMoveVerticalFalseWithSameColorAtSpot() {
        Board board = new Board();

        Queen queen = new Queen("Q1", ChessColor.Black, "♛");
        int startX = 5;
        int startY = 4;
        board.setPiece(queen,startX,startY);

        Pawn pawn = new Pawn("P1", ChessColor.Black, "♟" );
        board.setPiece(pawn, 5, 2);

        Assertions.assertFalse(queen.canItMove(board, new Move(startX,startY,5,2, ChessColor.Black)));
    }

    @Test
    public void canItMoveDiagonol() {
        Board board = new Board();

        Queen queen = new Queen("Q1", ChessColor.Black, "♛");
        int startX = 7;
        int startY = 2;
        board.setPiece(queen,startX,startY);

        Assertions.assertTrue(queen.canItMove(board, new Move(startX,startY,5,4, ChessColor.Black)));
    }


    @Test
    public void canItMoveTrueWithPieceAtSpot() {
        Board board = new Board();



        Pawn pawn = new Pawn("pawn1", ChessColor.White, "♟");

        //board.applyMove(new Tile(pawn), 0, 1, 7, 2);


        Queen queen = new Queen("Q1", ChessColor.Black, "♛");
        board.setPiece(pawn,7,2);
        board.setPiece(queen,5,4);

        Assertions.assertTrue(queen.canItMove(board,new Move(5,4,7,2, ChessColor.Black)));

    }

    @Test
    public void canItMoveFalseWithSameColorPieceAtSpot() {
        Board board = new Board();


        Pawn pawn = new Pawn("pawn1", ChessColor.Black, "♟");

        Queen queen = new Queen("Q1", ChessColor.Black, "♛");

        board.setPiece(pawn, 7,2);
        board.setPiece(queen, 5,5);

        board.boardDisplay();

        Assertions.assertFalse(queen.canItMove(board, new Move(5,5,7,2,ChessColor.Black)));

    }

    @Test
    public void canItMoveThroughAnotherPieceFalse() {
        Board board = new Board();
        Queen queen = new Queen("Q1", ChessColor.Black, "♛");


        Pawn pawn = new Pawn("pawn1", ChessColor.Black, "♟");
        board.setPiece(queen,0,1);
        board.setPiece(pawn, 1,2);


        board.boardDisplay();

        Assertions.assertFalse(queen.canItMove(board,new Move(0,1,2,3,ChessColor.Black)));
    }

    @Test
    public void canItMoveFalseLStraightLineLikeKnight() {
        Board board = new Board();

        Queen queen = new Queen("Q1", ChessColor.Black, "♛");

        board.setPiece(queen, 5,5);

        Assertions.assertFalse(queen.canItMove(board, new Move(5,5,6,7,ChessColor.Black)));

    }

}
