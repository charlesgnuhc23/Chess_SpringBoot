package board;

import pieces.Piece;

public class Square {
    int x;
    int y;
    String coordinate;
    boolean occupied;
    Piece piece;

    public Square(int x, int y) {
        this.x = x;
        this.y = y;

        char letter = (char) ('A' + x);
        char number = (char) (y + 49);

        this.coordinate = "";
        this.coordinate += letter;
        this.coordinate += number;
    }

    public int getX() {
        return this.x;
    }

    public int getY() {
        return this.y;
    }
    
    public String getCoordinate() {
        return this.coordinate;
    }

    public Piece getPiece() {
        return this.piece;
    }
}
