public class Main {
    public static void main(String[] args) {
        GameState game = new GameState();
        boolean gameOver = false;
        while(!gameOver){
            game.board.boardDisplay();
            System.out.println("It is: " + game.activePlayer.color + "'s" +  " turn " );

            if(game.board.check((game.activePlayer.color))) {
                {
                    System.out.println(game.activePlayer.color + " is in check");
                }
            }

            Move move = game.activePlayer.getInput(game.board);

//            while(game.board.getPiece(move.startX, move.startY) == null ) {
//                System.out.println("Invalid move");
//                System.out.println("It is this player's turn: " + game.activePlayer.color);
//                move = game.activePlayer.getInput(game.board);
//            }

            while ((!game.board.getPiece(move.startX, move.startY).canItMove(game.board, move)) || game.activePlayer.color != game.board.getPiece(move.startX, move.startY).color
           ){

                System.out.println("Invalid move");
                move = game.activePlayer.getInput(game.board);
            }
            game.board.applyMove(move.startX, move.startY, move.endX, move.endY);
            game.nextPlayer();

//            if(game.board.checkmate(ChessColor.Black)){
//                System.out.println("Checkmate: White wins");
//                gameOver = true;
//            }
//
//            if (game.board.checkmate(ChessColor.White)){
//                System.out.println("Checkmate: Black wins");
//                gameOver = true;
//            }


        }


    }

}
