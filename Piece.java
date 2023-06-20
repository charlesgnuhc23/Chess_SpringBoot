import java.util.List;

public interface Piece {
    int color = -1;

    public List<Coord> getLegalMoves(Board board);
    public boolean move(Coord newCoord);
}