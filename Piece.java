import java.util.List;

public interface Piece {
    public List<Coord> getLegalMoves(Board board);
    public boolean move(Coord newCoord);
}