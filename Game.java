import java.util.ArrayList;
import java.util.List;

public class Game {

    private Board board;
    private int turn;           // 0 - white, 1 - black, 2 - nobody's turn
    private int moveCount;      
    private boolean inCheck;            // is th current player in check?
    private int blackMaterial;
    private int whiteMaterial;
    private boolean whiteCastleRights;
    private boolean blackCastleRights;

    private List<Board> boardHistory;
    
    public Game() 
    {
        resetGame();
    }

    public void resetGame()
    {
        board = new Board();
        turn = 0;
        moveCount = 1;
        inCheck = false;
        blackMaterial = 0;
        whiteMaterial = 0;
        whiteCastleRights = true;
        blackCastleRights = true;
    }

    public boolean movePiece(Coord oldCoord, Coord newCoord)
    {
        board = board.movePiece(oldCoord, newCoord);
        boardHistory.add(board);
        moveCount ++;
        nextTurn();

        return false;
    }

    private void nextTurn()
    {
        turn++;
        turn %= 2;
    }

    public List<Coord> getLegalMoves(Coord coordinate)
    {
        List<Coord> ret = new ArrayList<>();

        return ret;
    }
}