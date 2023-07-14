package pieces;
import java.util.ArrayList;
import java.util.List;

import board.Board;
import board.Square;

public class Queen extends Piece {

    public Queen(Square square, String color) {
        super(square, color, "Queen");
    }

    public List<Square> getLegalMoves(Board board) {
        int x = square.getX();
        int y = square.getY();

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
