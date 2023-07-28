package com.charlesgnuhc.chess.board;
import pieces.*;
import com.google.gson.Gson;

public class Board {
    private Piece[][] board; // 2d array of pieces (null/empty or piece/occupied)

    public Board() {
        resetBoard();
    } 

    public String getBoardStateAsJson() {
        Gson gson = new Gson();
        return gson.toJson(board);
    }

    public void resetBoard() {
        placePiece(0, 0, new Rook(new Square(0,0), "white"));
        placePiece(1, 0, new Knight(new Square(1,0), "white"));
        placePiece(2, 0, new Bishop(new Square(2,0), "white"));
        placePiece(3, 0, new Queen(new Square(3,0), "white"));
        placePiece(4, 0, new King(new Square(4,0), "white"));
        placePiece(5, 0, new Bishop(new Square(2,0), "white"));
        placePiece(6, 0, new Knight(new Square(1,0), "white"));
        placePiece(7, 0, new Rook(new Square(0,0), "white"));

        placePiece(0, 1, new Pawn(new Square(0,1), "white"));
        placePiece(1, 1, new Pawn(new Square(0,1), "white"));
        placePiece(2, 1, new Pawn(new Square(0,1), "white"));
        placePiece(3, 1, new Pawn(new Square(0,1), "white"));
        placePiece(4, 1, new Pawn(new Square(0,1), "white"));
        placePiece(5, 1, new Pawn(new Square(0,1), "white"));
        placePiece(6, 1, new Pawn(new Square(0,1), "white"));
        placePiece(7, 1, new Pawn(new Square(0,1), "white"));

        placePiece(0, 6, new Pawn(new Square(1,6), "black"));
        placePiece(1, 6, new Pawn(new Square(1,6), "black"));
        placePiece(2, 6, new Pawn(new Square(1,6), "black"));
        placePiece(3, 6, new Pawn(new Square(1,6), "black"));
        placePiece(4, 6, new Pawn(new Square(1,6), "black"));
        placePiece(5, 6, new Pawn(new Square(1,6), "black"));
        placePiece(6, 6, new Pawn(new Square(1,6), "black"));
        placePiece(7, 6, new Pawn(new Square(1,6), "black"));

        placePiece(0, 7, new Rook(new Square(1,6), "black"));
        placePiece(1, 7, new Knight(new Square(1,6), "black"));
        placePiece(2, 7, new Bishop(new Square(1,6), "black"));
        placePiece(3, 7, new Queen(new Square(1,6), "black"));
        placePiece(4, 7, new King(new Square(1,6), "black"));
        placePiece(5, 7, new Bishop(new Square(1,6), "black"));
        placePiece(6, 7, new Knight(new Square(1,6), "black"));
        placePiece(7, 7, new Rook(new Square(1,6), "black"));
    }

    public Piece[][] getBoard() {
        return board;
    }

    public void placePiece(int x, int y, Piece piece) {
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
