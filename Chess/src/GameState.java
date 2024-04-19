import java.util.Scanner;

public class GameState {
    Player[] players;
    Board board;

    Player activePlayer;

    public GameState(Board board, Player[] players) {
        this.board = board;
        this.players = players;
        this.activePlayer = players[0];
    }

    public GameState() {
        this.board = new Board();
        this.board.newBoard();
        this.players = new Player[]{new Player(ChessColor.White), new Player(ChessColor.Black)};
        this.activePlayer = players[0];
    }
     public void nextPlayer(){
        if (this.activePlayer.equals(this.players[0])){
            this.activePlayer = this.players[1];
        }else{
            this.activePlayer = this.players[0];
        }
     }

//    public void player() {
//        if (this.board.getPiece(startX, startY).canItMove(this.board, move)) {
//            return move;
//        } else {
//            System.out.println("Please try again");
//        }
//
//    }
}
