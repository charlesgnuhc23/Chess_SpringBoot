import java.util.ArrayList;
import java.util.List;

import board.Board;
import board.Coord;

public class Game {

    private Board board;
    private int turn;           // 0 - white, 1 - black, 2 - nobody's turn
    private int moveCount;      
    private boolean inCheck;            // is th current player in check?
    private int blackMaterial;
    private int whiteMaterial;
    private boolean whiteCastleRightsK;
    private boolean whiteCastleRightsQ;
    private boolean blackCastleRightsK;
    private boolean blackCastleRightsQ;

    private List<Board> boardHistory;
    
    public Game() 
    {
        resetGame();
    }

    public void resetGame()
    {
        board = new Board();    // need to make this board with correct starting squares
        turn = 0;
        moveCount = 1;
        inCheck = false;
        blackMaterial = 0;
        whiteMaterial = 0;
        whiteCastleRightsK = true;
        whiteCastleRightsQ = true;
        blackCastleRightsK = true;
        blackCastleRightsQ = true;
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