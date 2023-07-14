package pieces;
import java.util.ArrayList;
import java.util.List;

import board.Board;
import board.Square;

public class King extends Piece {
    
    private boolean hasMoved; // for castling rights

    public King(Square square, String color) {
        super(square, color, "King");
    }

    public List<Square> getLegalMoves(Board board) {
        int x = square.getX();
        int y = square.getY();

        List<Square> ret = new ArrayList<Square>();
        
        // squares above King's position
        if (y < 7) {
            Piece checkPiece = board.getBoard()[x][y+1];                     // up
            if (checkPiece == null || checkPiece.color != this.color) {
                ret.add(new Square(x, y+1));
            }
            if (x > 0 && (checkPiece == null || checkPiece.color != this.color)) {     // up and left
                checkPiece = board.getBoard()[x-1][y+1];
                ret.add(new Square(x-1, y+1));
            }
            if (x < 7 && (checkPiece == null || checkPiece.color != this.color)) {     // up and right
                checkPiece = board.getBoard()[x+1][y+1];
                ret.add(new Square(x+1, y+1));
            }
        }

        // squares below King's position
        if (y > 0) {
            Piece checkPiece = board.getBoard()[x][y-1];                     // down
            if (checkPiece == null || checkPiece.color != this.color) {
                ret.add(new Square(x, y-1));
            }
            if (x > 0 && (checkPiece == null || checkPiece.color != this.color)) {     // down and left
                checkPiece = board.getBoard()[x-1][y-1];
                ret.add(new Square(x-1, y-1));
            }
            if (x < 7 && (checkPiece == null || checkPiece.color != this.color)) {     // down and right
                checkPiece = board.getBoard()[x+1][y-1];
                ret.add(new Square(x+1, y-1));
            }
        }

        // square to the left of King
        if (x > 0) {
            Piece checkPiece = board.getBoard()[x-1][y];
            if (checkPiece == null || checkPiece.color != this.color) {
                ret.add(new Square(x-1, y));
            }
        }
        
        
        // square to the right of King
        if (x < 7) {
            Piece checkPiece = board.getBoard()[x+1][y];
            if (checkPiece == null || checkPiece.color != this.color) {
                ret.add(new Square(x+1, y));
            }
        }

        return ret;
    }
    
}
