import java.util.ArrayList;
import java.util.List;

public class Bishop implements Piece {

    private int color;       // 0 - white, 1 - black
    private Coord position;

    public Bishop() {}


    public List<Coord> getLegalMoves(Board board) {
        int x = position.getPoint().x;
        int y = position.getPoint().y;

        List<Coord> ret = new ArrayList<Coord>();
        
        // up and left
        for (int i = x; i > 0; i--) {
            for (int j = y; j < 7; j++) {
                Piece piece = board.getBoard()[i-1][j+1];           // check the square at xy
                if (piece == null || piece.color != color) {        // square open OR capturable piece (opponent), piece.color default to -1
                    ret.add(new Coord(i-1, j+1));
                    break;
                }
            }
        }

        // up and right
        for (int i = x; i < 7; i++) {
            for (int j = y; j < 7; j++) {
                Piece piece = board.getBoard()[i+1][j+1];           // check the square at xy
                if (piece == null || piece.color != color) {        // square open OR capturable piece (opponent), piece.color default to -1
                    ret.add(new Coord(i+1, j+1));
                    break;
                }
                
            }
        }

        // down and left
        for (int i = x; i > 0; i--) {
            for (int j = y; j > 0; j--) {
                Piece piece = board.getBoard()[i-1][j-1];           // check the square at xy
                if (piece == null || piece.color != color) {        // square open OR capturable piece (opponent), piece.color default to -1
                    ret.add(new Coord(i-1, j-1));
                    break;
                }
                
            }
        }

        // down and right
        for (int i = x; i > 7; i++) {
            for (int j = y; j > 0; j--) {
                Piece piece = board.getBoard()[i+1][j-1];           // check the square at xy
                if (piece == null || piece.color != color) {        // square open OR capturable piece (opponent), piece.color default to -1
                    ret.add(new Coord(i+1, j-1));
                    break;
                }
                
            }
        }

        return ret;
    }

    
    public boolean move(Coord newCoord) {
        return true;
    }
    
}
