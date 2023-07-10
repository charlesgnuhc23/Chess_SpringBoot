package pieces;
import java.util.ArrayList;
import java.util.List;

import board.Board;
import board.Coord;

public class Knight extends Piece {

    Knight(Coord position, Color color) {
        super(position, color);
    }

    public List<Coord> getLegalMoves(Board board) {
        int x = position.getPoint().x;
        int y = position.getPoint().y;

        List<Coord> ret = new ArrayList<Coord>();

        // up
        if (y+2 <= 7) {
            Piece checkPiece = board.getBoard()[x-1][y+2]; // up two, left one
            if (checkPiece == null || checkPiece.color != this.color) {
                ret.add(new Coord(x-1, y+2));
            }
            checkPiece = board.getBoard()[x+1][y+2]; // up two, right one
            if (checkPiece == null || checkPiece.color != this.color) {
                ret.add(new Coord(x+1, y+2));
            }
        }

        // down
        if (y-2 >= 0) {
            Piece checkPiece = board.getBoard()[x-1][y-2]; // down two, left one
            if (checkPiece == null || checkPiece.color != this.color) {
                ret.add(new Coord(x-1, y-2));
            }
            checkPiece = board.getBoard()[x+1][y-2]; // down two, right one
            if (checkPiece == null || checkPiece.color != this.color) {
                ret.add(new Coord(x+1, y-2));
            }
        }

        // left
        if (x-2 >= 0) {
            Piece checkPiece = board.getBoard()[x-2][y+1]; // left two, up one
            if (checkPiece == null || checkPiece.color != this.color) {
                ret.add(new Coord(x-2, y+1));
            }
            checkPiece = board.getBoard()[x-2][y-1]; // left two, down one
            if (checkPiece == null || checkPiece.color != this.color) {
                ret.add(new Coord(x-2, y-1));
            }
        }

        // right
        if (x+2 <= 7) {
            Piece checkPiece = board.getBoard()[x+2][y+1]; // right two, up one
            if (checkPiece == null || checkPiece.color != this.color) {
                ret.add(new Coord(x+2, y+1));
            }
            checkPiece = board.getBoard()[x+2][y-1]; // right two, down one
            if (checkPiece == null || checkPiece.color != this.color) {
                ret.add(new Coord(x+2, y-1));
            }
        }

        return ret;

    }

    
}
