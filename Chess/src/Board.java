public class Board {
    public Tile[][] board = new Tile[8][8];
    public Board() {
        for(int row = 0; row<=7; row ++){
            for(int col = 0; col<=7; col++ ) {
                this.board [row][col] = new Tile();
            }
        }
    }


    public void newBoard() {
        this.board[0][0] = new Tile(new Rook("RB",ChessColor.Black));
        this.board[0][1] = new Tile(new Knight("KB",ChessColor.Black));
        this.board[0][2] = new Tile(new Bishop("BB",ChessColor.Black));
        this.board[0][3] = new Tile(new King("KingB",ChessColor.Black));
        this.board[0][4] = new Tile(new Queen("QB",ChessColor.Black));
        this.board[0][5] = new Tile(new Bishop("BB2",ChessColor.Black));
        this.board[0][6] = new Tile(new Knight("KB2",ChessColor.Black));
        this.board[0][7] = new Tile(new Rook("RB2",ChessColor.Black));

        for(int col = 0; col<=7; col++ ) {
            this.board [1] [col] = new Tile(new Pawn("PB", ChessColor.Black));
        }

        for(int row = 2; row<=5; row ++){
           for(int col = 0; col<=7; col++ ) {
               this.board [row] [col] = new Tile();
           }
        }

        for(int col = 0; col<=7; col++ ) {
            this.board [6] [col] = new Tile(new Pawn("PW", ChessColor.White));
        }

        this.board[7][0] = new Tile(new Rook("RW",ChessColor.White));
        this.board[7][1] = new Tile(new Knight("KW",ChessColor.White));
        this.board[7][2] = new Tile(new Bishop("BW",ChessColor.White));
        this.board[7][3] = new Tile(new King("KingW",ChessColor.White));
        this.board[7][4] = new Tile(new Queen("QW",ChessColor.White));
        this.board[7][5] = new Tile(new Bishop("BW2",ChessColor.White));
        this.board[7][6] = new Tile(new Knight("KW2",ChessColor.White));
        this.board[7][7] = new Tile(new Rook("RW2",ChessColor.White));

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
                sb.append(this.board[row][col].toString()).append(" | ");
            }
            sb.append("\n");
        }
        return sb.toString();
    }

    //move a piece
    public void applyMove(int startX, int startY, int endX, int endY) {
        this.board[endY][endX] = this.board[startY][startX];
        this.board[startY][startX] = new Tile();

    }
    public void applyMove(Tile tile, int startX, int startY, int endX, int endY) {
        applyMove(startX, startY, endX, endY);
    }
    public void removePiece() {

    }

    public boolean unObstructedPathDiagnol(int startX, int startY, int endX, int endY) {
        int rowMove = (startX < endX) ? 1 : -1;
        int colMove = (startY < endY) ? 1 : -1;

        for (int i = startX + rowMove; i != endX; i += rowMove) {
            for (int j = startY + colMove; j != endY; j += colMove) {
                if (this.board[j][i].piece != null){
                    return false;
                }
            }
        }

//        if (this.board[colMove][rowMove].piece != null){
//            return false;
//        }
   return true;

    }

    public boolean unObstructedPathHorizontal(int startX, int endX, int y) {
        int rowMove = (startX < endX) ? 1 : -1;

        for (int i = startX + rowMove; i != endX; i += rowMove) {
           if(this.board[y][i].piece != null) {
               System.out.println(this.board[y][i].piece.symbol);
               return false;
           }
        }
//        if(this.board[y][rowMove].piece != null) {
//            return false;
//        }
        return true;
    }

    public boolean unObstructedPathVertical(int x, int startY, int endY) {
        int colMove = (startY < endY) ? 1 : -1;

        for (int j = startY + colMove; j != endY; j += colMove) {
            if (this.board[j][x].piece != null)
                return false;
        }
//        if (this.board[colMove][x].piece != null) {
//            return false;
//        }
        return true;
    }
    public Piece getPiece(int x, int y){
        return board[y][x].getPiece();
    }

    // TO DO: fix set piece change x and y to row/col
    public void setPiece(Piece piece,int x, int y){
        board[y][x].setPiece(piece);
    }

    public boolean check(ChessColor color){
        int kingX = 0;
        int kingY = 0;


        for( int i= 0; i<8; i++){
            for (int j = 0; j<8; j++){
                if (board[i][j].piece instanceof King && color == board[i][j].piece.color){
                    kingY = i;
                    kingX = j;

                }
            }

        }
        for (int i = 0; i < 8; i++){
            for (int j = 0; j < 8; j++) {
                Piece piecePos = board[i][j].piece;
                if (piecePos != null && piecePos.color != color && piecePos.canItMove(this, new Move(j, i, kingX, kingY, color))) {
                    return true;
                }
            }
        }
            return false;
    }

    //Win Check
    public String winner() {
        return "w";
    }

}
