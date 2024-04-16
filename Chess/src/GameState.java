import java.util.Scanner;
public class GameState {
    Player[] players;
    Board board;

    Player activePlayer;

    public GameState(Board board, Player[] players){
        this.board = board;
        this.players = players;
        this.activePlayer = players[0];
    }

    public GameState(){
        this.board = new Board();
        this.board.newBoard();
        this.players= new Player[]{new Player(ChessColor.White), new Player(ChessColor.Black)};
    }

    public Move getMove(){
        int startX;
        int startY;
        int endX;
        int endY;
        Scanner scanner = new Scanner(System.in);

        while (true) {

            System.out.println("Enter the X coordinate of the piece you want to move");
            startX = scanner.nextInt();
            System.out.println("Enter the Y coordinate of the piece you want to move");
            startY = scanner.nextInt();
            System.out.println("Enter the X coordinate of where you want to move your piece");
            endX = scanner.nextInt();
            System.out.println("Enter the Y coordinate of where you want to move your piece");
            endY = scanner.nextInt();
            Move move = new Move(startX, startY, endX, endY, this.activePlayer.color);
            if (this.board.getPiece(startX, startY).canItMove(this.board, move)) {
                return move;
            } else {
                System.out.println("Please try again");
            }
        }
    }
}
