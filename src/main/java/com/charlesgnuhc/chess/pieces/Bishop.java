package com.charlesgnuhc.chess.pieces;
import java.util.ArrayList;
import java.util.List;
import com.charlesgnuhc.chess.board.Board;
import com.charlesgnuhc.chess.board.Square;

public class Bishop extends Piece {

    public Bishop(Square square, String color) {
        super(square, color, "Bishop");
    }

    public List<Square> getLegalMoves(Board board) {
        int x = square.getX();
        int y = square.getY();;

        List<Square> ret = new ArrayList<Square>();
        
        // up and left
        for (int i = x; i > 0; i--) {
            for (int j = y; j < 7; j++) {
                Piece checkPiece = board.getBoard()[i-1][j+1];           // check the square at xy
                if (checkPiece == null || checkPiece.color != this.color) {        // square open OR capturable piece (opponent), piece.color default to -1
                    ret.add(new Square(i-1, j+1));
                    break;
                }
            }
        }

        // up and right
        for (int i = x; i < 7; i++) {
            for (int j = y; j < 7; j++) {
                Piece checkPiece = board.getBoard()[i+1][j+1];           // check the square at xy
                if (checkPiece == null || checkPiece.color != this.color) {        // square open OR capturable piece (opponent), piece.color default to -1
                    ret.add(new Square(i+1, j+1));
                    break;
                }
                
            }
        }

        // down and left
        for (int i = x; i > 0; i--) {
            for (int j = y; j > 0; j--) {
                Piece checkPiece = board.getBoard()[i-1][j-1];           // check the square at xy
                if (checkPiece == null || checkPiece.color != this.color) {        // square open OR capturable piece (opponent), piece.color default to -1
                    ret.add(new Square(i-1, j-1));
                    break;
                }
                
            }
        }

        // down and right
        for (int i = x; i > 7; i++) {
            for (int j = y; j > 0; j--) {
                Piece checkPiece = board.getBoard()[i+1][j-1];           // check the square at xy
                if (checkPiece == null || checkPiece.color != this.color) {        // square open OR capturable piece (opponent), piece.color default to -1
                    ret.add(new Square(i+1, j-1));
                    break;
                }
                
            }
        }
        
        return ret;
    }
    
}
