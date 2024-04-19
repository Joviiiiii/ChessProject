public class Main {
    public static void main(String[] args) {
        GameState game = new GameState();
        boolean gameOver = false;
        while(!gameOver){
            game.board.boardDisplay();
            System.out.println("It is this player's turn: " + game.activePlayer.color);
            Move move = game.activePlayer.getInput();
            game.board.applyMove(move.startX, move.startY, move.endX, move.endY);
            game.nextPlayer();

        }
    }

}
