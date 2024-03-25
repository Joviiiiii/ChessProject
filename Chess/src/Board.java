public class Board {

    public Tile[][] board = new Tile[8][8];


    public void newBoard() {
        this.board[0][0] = new Tile(new Rook("RB",ChessColor.Black, "♜" ));
        this.board[0][1] = new Tile(new Knight("KB",ChessColor.Black, "♞"));
        this.board[0][2] = new Tile(new Bishop("BB",ChessColor.Black, "♝"));
        this.board[0][3] = new Tile(new King("KingB",ChessColor.Black, "♚"));
        this.board[0][4] = new Tile(new Queen("QB",ChessColor.Black, "♛"));
        this.board[0][5] = new Tile(new Bishop("BB2",ChessColor.Black, "♝"));
        this.board[0][6] = new Tile(new Knight("KB2",ChessColor.Black, "♞"));
        this.board[0][7] = new Tile(new Rook("RB2",ChessColor.Black , "♜"));

        for(int col = 0; col<=7; col++ ) {
            this.board [1] [col] = new Tile(new Pawn("PB", ChessColor.Black, "♟"));
        }

        for(int row = 2; row<=5; row ++){
           for(int col = 0; col<=7; col++ ) {
               this.board [row] [col] = new Tile();
           }
        }

        for(int col = 0; col<=7; col++ ) {
            this.board [6] [col] = new Tile(new Pawn("PW", ChessColor.White, "♙"));
        }

        this.board[7][0] = new Tile(new Rook("RW",ChessColor.White, "♖"));
        this.board[7][1] = new Tile(new Knight("KW",ChessColor.White, "♘"));
        this.board[7][2] = new Tile(new Bishop("BW",ChessColor.White, "♗"));
        this.board[7][3] = new Tile(new King("KingW",ChessColor.White, "♔"));
        this.board[7][4] = new Tile(new Queen("QW",ChessColor.White, "♕"));
        this.board[7][5] = new Tile(new Bishop("BW2",ChessColor.White, "♗"));
        this.board[7][6] = new Tile(new Knight("KW2",ChessColor.White,"♘" ));
        this.board[7][7] = new Tile(new Rook("RW2",ChessColor.White, "♖"));

    }

    //display
    public void boardDisplay() {
//        this.board[7][7].toString()

        //System.out.println("┌╼┬╼┬╼┬╼┬╼┬╼┬╼┬╼┑");

       // System.out.println("├╼┼╼┼╼┼╼┼╼┼╼┼╼┼╼┫");

        for(int row = 0; row<=7; row ++){
            System.out.print("| ");
            for(int col = 0; col<=7; col++ ) {
                System.out.print(this.board [row][col].toString() + " | ");
            }
            System.out.println(" ");
        }

    }

    //move a piece
    public void applyMove() {

    }

    //remove piece
    public void removePiece() {

    }

    //Win Check
    public String winner() {
        return "w";
    }

    //Reset
    public void setBoard() {

    }

}
