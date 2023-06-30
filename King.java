import java.util.ArrayList;
import java.util.List;

public class King implements Piece {

    private int color;       // 0 - white, 1 - black
    private Coord position;
    private boolean hasMoved;

    public King() {}


    public List<Coord> getLegalMoves(Board board) {
        int x = position.getPoint().x;
        int y = position.getPoint().y;

        List<Coord> ret = new ArrayList<Coord>();
        
        // squares above King's position
        if (y < 7) {
            Piece piece = board.getBoard()[x][y+1];                     // up
            if (piece == null || piece.color != color) {
                ret.add(new Coord(x, y+1));
            }
            if (x > 0 && (piece == null || piece.color != color)) {     // up and left
                piece = board.getBoard()[x-1][y+1];
                ret.add(new Coord(x-1, y+1));
            }
            if (x < 7 && (piece == null || piece.color != color)) {     // up and right
                piece = board.getBoard()[x+1][y+1];
                ret.add(new Coord(x+1, y+1));
            }
        }

        // squares below King's position
        if (y > 0) {
            Piece piece = board.getBoard()[x][y-1];                     // down
            if (piece == null || piece.color != color) {
                ret.add(new Coord(x, y-1));
            }
            if (x > 0 && (piece == null || piece.color != color)) {     // down and left
                piece = board.getBoard()[x-1][y-1];
                ret.add(new Coord(x-1, y-1));
            }
            if (x < 7 && (piece == null || piece.color != color)) {     // down and right
                piece = board.getBoard()[x+1][y-1];
                ret.add(new Coord(x+1, y-1));
            }
        }

        // square to the left of King
        if (x > 0) {
            Piece piece = board.getBoard()[x-1][y];
            if (piece == null || piece.color != color) {
                ret.add(new Coord(x-1, y));
            }
        }
        
        
        // square to the right of King
        if (x < 7) {
            Piece piece = board.getBoard()[x+1][y];
            if (piece == null || piece.color != color) {
                ret.add(new Coord(x+1, y));
            }
        }

        return ret;
    }

    
    public boolean move(Coord newCoord) {
        return true;
    }
    
}
