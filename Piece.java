public interface Piece {
    public List<Coord> getLegalMoves(Piece[][] Board);
    public void move(Coord oldCoord, Coord newCoord);
}