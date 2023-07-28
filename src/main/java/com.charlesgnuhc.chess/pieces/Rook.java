package com.charlesgnuhc.chess.pieces;
import java.util.ArrayList;
import java.util.List;

import board.Board;
import board.Square;

public class Rook extends Piece {

    private boolean hasMoved; // for castling rights

    public Rook(Square square, String color) {
        super(square, color, "Rook");
    }

    public List<Square> getLegalMoves(Board board) {
        int x = square.getX();
        int y = square.getY();

        List<Square> ret = new ArrayList<Square>();
        
        // left
        for (int i = x; i > 0; i--) {
            Piece checkPiece = board.getBoard()[i-1][y];
            if (checkPiece == null || checkPiece.color != this.color) {
                ret.add(new Square(i-1, y));
                break;
            }
        }

        // right
        for (int i = x; i < 7; i++) {
            Piece checkPiece = board.getBoard()[i+1][y];
            if (checkPiece == null || checkPiece.color != this.color) {
                ret.add(new Square(i+1, y));
                break;
            }
        }

        // up
        for (int j = y; j < 7; j++) {
            Piece checkPiece = board.getBoard()[x][j+1];
            if (checkPiece == null || checkPiece.color != this.color) {
                ret.add(new Square(x, j+1));
                break;
            }
        }

        // down
        for (int j = y; j > 0; j--) {
            Piece checkPiece = board.getBoard()[x][j-1];
            if (checkPiece == null || checkPiece.color != this.color) {
                ret.add(new Square(x, j-1));
                break;
            }
        }

        return ret;
    }
    
}
