import java.util.ArrayList;
import java.util.List;

public class Queen implements Piece {

    private int color;       // 0 - white, 1 - black
    private Coord position;

    public Queen() {}


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

        // left
        for (int i = x; i > 0; i--) {
            Piece piece = board.getBoard()[i-1][y];
            if (piece == null || piece.color != color) {
                ret.add(new Coord(i-1, y));
                break;
            }
        }

        // right
        for (int i = x; i < 7; i++) {
            Piece piece = board.getBoard()[i+1][y];
            if (piece == null || piece.color != color) {
                ret.add(new Coord(i+1, y));
                break;
            }
        }

        // up
        for (int j = y; j < 7; j++) {
            Piece piece = board.getBoard()[x][j+1];
            if (piece == null || piece.color != color) {
                ret.add(new Coord(x, j+1));
                break;
            }
        }

        // down
        for (int j = y; j > 0; j--) {
            Piece piece = board.getBoard()[x][j-1];
            if (piece == null || piece.color != color) {
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
