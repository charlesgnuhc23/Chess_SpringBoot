package com.charlesgnuhc.chess.pieces;
import java.util.ArrayList;
import java.util.List;
import com.charlesgnuhc.chess.board.Board;
import com.charlesgnuhc.chess.board.Square;

public class Pawn extends Piece {

    private boolean hasMoved;

    public Pawn(Square square, String color) {
        super(square, color, "Pawn");
    }

    public List<Square> getLegalMoves(Board board) {
        int x = square.getX();
        int y = square.getY();

        List<Square> ret = new ArrayList<Square>();
        
        // white pawn (move on square or two squares if first move)
        if (y < 7 && color == "white") {
            Piece piece = board.getBoard()[x][y+1];
            if (piece == null || piece.color != this.color) {
                ret.add(new Square(x, y+1));
                if (!hasMoved) {
                    piece = board.getBoard()[x][y+2];
                    if (piece == null || piece.color != this.color) {
                        ret.add(new Square(x, y+2));
                    }
                }
            }
        }

        // black pawn
        if (y > 0 && color == "black") {
            Piece piece = board.getBoard()[x][y-1];
            if (piece == null || piece.color != this.color) {
                ret.add(new Square(x, y-1));
                if (!hasMoved) {
                    piece = board.getBoard()[x][y-2];
                    if (piece == null || piece.color != this.color) {
                        ret.add(new Square(x, y-2));
                    }
                }
            }
        }

        // en passant


        // promotion to Queen, Rook, Bishop, Knight
        


        return ret;
    }
    
}
