import java.util.List;

public interface Piece {
    public List<Coord> getLegalMoves(Board board);
    public void move(Coord oldCoord, Coord newCoord);
}