public class Board {

    public static Tile[][] board = new Tile[8][8];


    public void newBoard() {
        Board.board[0][0] = new Tile(new Rook("RB",ChessColor.Black, "♜" ));
        Board.board[0][1] = new Tile(new Knight("KB",ChessColor.Black, "♞"));
        Board.board[0][2] = new Tile(new Bishop("BB",ChessColor.Black, "♝"));
        Board.board[0][3] = new Tile(new King("KingB",ChessColor.Black, "♚"));
        Board.board[0][4] = new Tile(new Queen("QB",ChessColor.Black, "♛"));
        Board.board[0][5] = new Tile(new Bishop("BB2",ChessColor.Black, "♝"));
        Board.board[0][6] = new Tile(new Knight("KB2",ChessColor.Black, "♞"));
        Board.board[0][7] = new Tile(new Rook("RB2",ChessColor.Black , "♜"));

        for(int col = 0; col<=7; col++ ) {
            Board.board [1] [col] = new Tile(new Pawn("PB", ChessColor.Black, "♟"));
        }

        for(int row = 2; row<=5; row ++){
           for(int col = 0; col<=7; col++ ) {
               Board.board [row] [col] = new Tile();
           }
        }

        for(int col = 0; col<=7; col++ ) {
            Board.board [6] [col] = new Tile(new Pawn("PW", ChessColor.White, "♙"));
        }

        Board.board[7][0] = new Tile(new Rook("RW",ChessColor.White, "♖"));
        Board.board[7][1] = new Tile(new Knight("KW",ChessColor.White, "♘"));
        Board.board[7][2] = new Tile(new Bishop("BW",ChessColor.White, "♗"));
        Board.board[7][3] = new Tile(new King("KingW",ChessColor.White, "♔"));
        Board.board[7][4] = new Tile(new Queen("QW",ChessColor.White, "♕"));
        Board.board[7][5] = new Tile(new Bishop("BW2",ChessColor.White, "♗"));
        Board.board[7][6] = new Tile(new Knight("KW2",ChessColor.White,"♘" ));
        Board.board[7][7] = new Tile(new Rook("RW2",ChessColor.White, "♖"));

    }

    //display
    public void boardDisplay() {
        System.out.println(this.toString());

    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("    A   " + "  B   " + "  C   " + "  D   " + "  E   " + "  F   " + "  G   " + "  H   \n");

        for(int row = 0; row<=7; row ++){
            sb.append(row+1 + "| ");
            for(int col = 0; col<=7; col++ ) {
                sb.append(Board.board[row][col].toString()).append(" | ");
            }
            sb.append("\n");
        }
        return sb.toString();
    }

    //move a piece
    //public void applyMove(Piece canItMove) {

     //   Board.board[startX][startY] == board[endX][endY];
   // }


    //remove piece
    public void removePiece() {

    }

    //Win Check
    public String winner() {
        return "w";
    }

    //Possible Helper Function to "Check Path" in front
    // Obstructed Path

}
