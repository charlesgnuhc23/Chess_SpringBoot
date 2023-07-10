package pieces;
import java.util.ArrayList;
import java.util.List;

import board.Board;
import board.Coord;

public class Rook extends Piece {

    Rook(Coord position, Color color) {
        super(position, color);
    }

    public List<Coord> getLegalMoves(Board board) {
        int x = position.getPoint().x;
        int y = position.getPoint().y;

        List<Coord> ret = new ArrayList<Coord>();
        
        // left
        for (int i = x; i > 0; i--) {
            Piece checkPiece = board.getBoard()[i-1][y];
            if (checkPiece == null || checkPiece.color != this.color) {
                ret.add(new Coord(i-1, y));
                break;
            }
        }

        // right
        for (int i = x; i < 7; i++) {
            Piece checkPiece = board.getBoard()[i+1][y];
            if (checkPiece == null || checkPiece.color != this.color) {
                ret.add(new Coord(i+1, y));
                break;
            }
        }

        // up
        for (int j = y; j < 7; j++) {
            Piece checkPiece = board.getBoard()[x][j+1];
            if (checkPiece == null || checkPiece.color != this.color) {
                ret.add(new Coord(x, j+1));
                break;
            }
        }

        // down
        for (int j = y; j > 0; j--) {
            Piece checkPiece = board.getBoard()[x][j-1];
            if (checkPiece == null || checkPiece.color != this.color) {
                ret.add(new Coord(x, j-1));
                break;
            }
        }

        return ret;
    }

    
    public boolean move(Coord newCoord) {
        return true;
    }
    
}
