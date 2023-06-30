import java.util.ArrayList;
import java.util.List;

public class Pawn implements Piece {

    private int color;       // 0 - white, 1 - black
    private Coord position;
    private boolean hasMoved;

    public Pawn() {}


    public List<Coord> getLegalMoves(Board board) {
        int x = position.getPoint().x;
        int y = position.getPoint().y;

        List<Coord> ret = new ArrayList<Coord>();
        
        // white pawn (move on square or two squares if first move)
        if (y < 7 && color == 0) {
            Piece piece = board.getBoard()[x][y+1];
            if (piece == null || piece.color != color) {
                ret.add(new Coord(x, y+1));
                if (!hasMoved) {
                    piece = board.getBoard()[x][y+2];
                    if (piece == null || piece.color != color) {
                        ret.add(new Coord(x, y+2));
                    }
                }
            }
        }

        // black pawn
        if (y > 0 && color == 1) {
            Piece piece = board.getBoard()[x][y-1];
            if (piece == null || piece.color != color) {
                ret.add(new Coord(x, y-1));
                if (!hasMoved) {
                    piece = board.getBoard()[x][y-2];
                    if (piece == null || piece.color != color) {
                        ret.add(new Coord(x, y-2));
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
