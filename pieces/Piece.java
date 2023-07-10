package pieces;
import java.util.ArrayList;
import java.util.List;

import board.Board;
import board.Coord;

public class Piece {
    protected final Coord position;
    protected final Color color;

    Piece (Coord position, Color color) {
        this.position = position;
        this.color = color;
    }

    public List<Coord> getLegalMoves(Board board) {
        return new ArrayList<>();
    };
    public boolean move(Coord newCoord) {
        return false; // no move performed
    };
}