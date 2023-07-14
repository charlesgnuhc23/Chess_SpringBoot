package board;
import pieces.*;

public class Board {
    private Piece[][] board; // 2d array of pieces (null/empty or piece/occupied)

    public Board() { // reset board
        // makeBoard(this.chessBoard);
        // resetBoard();
    } 

    // private void makeBoard(GridPane chessBoard) {
    //     for (int i = 0; i < 8; i++) {
    //         for (int j = 0; j < 8; j++) {
    //             Point point = new Point(i, j);
    //             String name = point.pointToSquareinate(point);
    //             point.setName(name);
    //             point.setPrefHeight(100);
    //             point.setPrefWidth(100);
    //             point.setBorder(new Border(new BorderStroke(Color.BLACK,
    //                     BorderStrokeStyle.SOLID, CornerRadii.EMPTY, BorderWidths.DEFAULT)));
    //             chessBoard.add(point, i, j, 1, 1);
    //             board[i][j] = null;

    //             if ((i+j)%2==0) {
    //                 point.setBackground(new Background(new BackgroundFill(Color.web("#e4c16f"), CornerRadii.EMPTY, Insets.EMPTY))); // dark
    //             } 
    //             else {
    //                 point.setBackground(new Background(new BackgroundFill(Color.web("#b88b4a"), CornerRadii.EMPTY, Insets.EMPTY))); // light
    //             }
    //         }
    //     }
    // }

    public void resetBoard() {
        board[0][0] = new Rook(new Square(0,0), "white");
        board[1][0] = new Knight(new Square(1,0), "white");
        board[2][0] = new Bishop(new Square(2,0), "white");
        board[3][0] = new Queen(new Square(3,0), "white");
        board[4][0] = new King(new Square(4,0), "white");
        board[5][0] = new Bishop(new Square(5,0), "white");
        board[6][0] = new Knight(new Square(6,0), "white");
        board[7][0] = new Rook(new Square(7,0), "white");

        board[0][1] = new Pawn(new Square(0,1), "white");
        board[1][1] = new Pawn(new Square(1,1), "white");
        board[2][1] = new Pawn(new Square(2,1), "white");
        board[3][1] = new Pawn(new Square(3,1), "white");
        board[4][1] = new Pawn(new Square(4,1), "white");
        board[5][1] = new Pawn(new Square(5,1), "white");
        board[6][1] = new Pawn(new Square(6,1), "white");
        board[7][1] = new Pawn(new Square(7,1), "white");

        board[1][6] = new Pawn(new Square(1,6), "black");
        board[2][6] = new Pawn(new Square(2,6), "black");
        board[3][6] = new Pawn(new Square(3,6), "black");
        board[4][6] = new Pawn(new Square(4,6), "black");
        board[5][6] = new Pawn(new Square(5,6), "black");
        board[6][6] = new Pawn(new Square(6,6), "black");
        board[7][6] = new Pawn(new Square(7,6), "black");
        board[0][6] = new Pawn(new Square(0,6), "black");

        board[0][7] = new Rook(new Square(0,7), "black");
        board[1][7] = new Knight(new Square(1,7), "black");
        board[2][7] = new Bishop(new Square(2,7), "black");
        board[3][7] = new Queen(new Square(3,7), "black");
        board[4][7] = new King(new Square(4,7), "black");
        board[5][7] = new Bishop(new Square(5,7), "black");
        board[6][7] = new Knight(new Square(6,7), "black");
        board[7][7] = new Rook(new Square(7,7), "black");
    }

    public Piece[][] getBoard() {
        return board;
    }

    public void setBoard(int x, int y, Piece piece) {
        board[x][y] = piece;
    }

    public Board movePiece(Square oldSquare, Square newSquare) {
        // check if newSquare is occupied by enemy
        // need to check if this is legal first
        // - if yes, then we remove newSquare piece and place oldSquare piece in newSquare
        // - if no, then place oldSquare piece in newSquare
        
        return this;
    }
}
