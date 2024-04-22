public class Main {
    public static void main(String[] args) {
        GameState game = new GameState();
        boolean gameOver = false;
        while(!gameOver){
            game.board.boardDisplay();
            System.out.println("It is this player's turn: " + game.activePlayer.color);
            Move move = game.activePlayer.getInput();

            while(game.board.getPiece(move.startX, move.startY) == null ) {
                System.out.println("Invalid move");
                System.out.println("It is this player's turn: " + game.activePlayer.color);
                move = game.activePlayer.getInput();
            }

            while ((!game.board.getPiece(move.startX, move.startY).canItMove(game.board, move)) || game.activePlayer.color != game.board.getPiece(move.startX, move.startY).color
            ){
                System.out.println("Invalid move");
                move = game.activePlayer.getInput();
            }
            game.board.applyMove(move.startX, move.startY, move.endX, move.endY);
            game.nextPlayer();

        }
    }

}
