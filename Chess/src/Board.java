public class Board {

    public Tile[][] board = new Tile[8][8];


    public void newBoard() {
        this.board[0][0] = new Tile(new Rook(ChessColor.Black));
        this.board[0][1] = new Tile(new Knight(ChessColor.Black));
        this.board[0][2] = new Tile(new Bishop(ChessColor.Black));
        this.board[0][3] = new Tile(new King(ChessColor.Black));
        this.board[0][4] = new Tile(new Queen(ChessColor.Black));
        this.board[0][5] = new Tile(new Bishop(ChessColor.Black));
        this.board[0][6] = new Tile(new Knight(ChessColor.Black));
        this.board[0][7] = new Tile(new Rook(ChessColor.Black));

        for(int col = 0; col<=7; col++ ) {
            this.board [1] [col] = new Tile(new Pawn("pB", ChessColor.Black));
        }

        for(int row = 2; row<=5; row ++){
           for(int col = 0; col<=7; col++ ) {
               this.board [row] [col] = new Tile();
           }
        }

        for(int col = 0; col>=7; col++ ) {
            this.board [6] [col] = new Tile(new Pawn("pW ", ChessColor.White));
        }

        this.board[7][0] = new Tile(new Rook(ChessColor.White));
        this.board[7][1] = new Tile(new Knight(ChessColor.White));
        this.board[7][2] = new Tile(new Bishop(ChessColor.White));
        this.board[7][3] = new Tile(new King(ChessColor.White));
        this.board[7][4] = new Tile(new Queen(ChessColor.White));
        this.board[7][5] = new Tile(new Bishop(ChessColor.White));
        this.board[7][6] = new Tile(new Knight(ChessColor.White));
        this.board[7][7] = new Tile(new Rook(ChessColor.White));

    }

    //display
    public void boardDisplay() {

        System.out.println("┌╼┬╼┬╼┬╼┬╼┬╼┬╼┬╼┑");
        System.out.println("");

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
