package com.charlesgnuhc.chess;
import java.util.ArrayList;
import java.util.List;

import com.charlesgnuhc.chess.board.Board;
import com.charlesgnuhc.chess.board.Square;

public class Game {

    private Board board;
    private int player;           // 0 - white, 1 - black, 2 - nobody's turn
    private int moveCount;      
    private boolean inCheck;            // is th current player in check?
    private int blackMaterial;
    private int whiteMaterial;
    private boolean whiteCastleRightsK;
    private boolean whiteCastleRightsQ;
    private boolean blackCastleRightsK;
    private boolean blackCastleRightsQ;
    public static Board chessboard;

    private List<Board> boardHistory;
    
    public Game() {

    }

    public void resetGame() {
        
        player = 0;
        moveCount = 1;
        inCheck = false;
        blackMaterial = 0;
        whiteMaterial = 0;
        whiteCastleRightsK = true;
        whiteCastleRightsQ = true;
        blackCastleRightsK = true;
        blackCastleRightsQ = true;
    }

    public boolean movePiece(Square oldSquare, Square newSquare) {
        board = board.movePiece(oldSquare, newSquare);
        boardHistory.add(board);
        moveCount ++;
        nextPlayer();

        return false;
    }

    private void nextPlayer()
    {
        player++;
        player %= 2;
    }
}