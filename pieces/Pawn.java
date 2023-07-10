package pieces;
import java.util.ArrayList;
import java.util.List;

import board.Board;
import board.Coord;

public class Pawn extends Piece {

    private boolean hasMoved;

    Pawn(Coord position, Color color) {
        super(position, color);
    }

    public List<Coord> getLegalMoves(Board board) {
        int x = position.getPoint().x;
        int y = position.getPoint().y;

        List<Coord> ret = new ArrayList<Coord>();
        
        int direction = this.color.getDirection(); // 1 (up) if white, -1 (down) if black

        // pawn (move on square or two squares if first move)
        if (y > 0 && y < 7) {
            Piece checkPiece = board.getBoard()[x][y+direction];
            if (checkPiece == null || checkPiece.color != this.color) {
                ret.add(new Coord(x, y+direction));
                if (!this.hasMoved) {
                    checkPiece = board.getBoard()[x][y+(2*direction)];
                    if (checkPiece == null || checkPiece.color != this.color) {
                        ret.add(new Coord(x, y+(2*direction)));
                    }
                }
            }
        }

        // en passant


        // promotion to Queen, Rook, Bishop, Knight
        


        return ret;
    }

    
    public boolean move(Coord newCoord) {
        return true;
    }
    
}
