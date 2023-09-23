package com.charlesgnuhc.chess.pieces;
import java.util.ArrayList;
import java.util.List;
import com.charlesgnuhc.chess.board.Board;
import com.charlesgnuhc.chess.board.Square;

public class Piece {
    protected final Square square;
    protected final String color;
    protected final String type;

    Piece (Square square, String color, String type) {
        this.square = square;
        this.color = color;
        this.type = type;
    }

    public List<Square> getLegalMoves(Board board) {
        return new ArrayList<>();
    };

    public boolean move(Square destination) { // return true if moved, false if failed
        // List<Coord> legalMoves = this.getLegalMoves();

        return false;
        
    };

    public String getColor() {
        return color;
    }

    public String getType() {
        return type;
    }
}