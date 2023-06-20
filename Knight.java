import java.util.List;

public class Knight implements Piece {

    private int color;       // 0 - white, 1 - black
    private Coord position;

    public Knight() {}

    public List<Coord> getLegalMoves(Board board)
    {
        int x = position.getPoint().x;
        int y = position.getPoint().y;
        
        for (int i = -2; i <= -1; i++) 
        {
            for (int j = -2; j <= -1; j++)
            {
                if (x + i >= 0 && x + i <= 7 && y + j >= 0 && y + j <= 7)
                {
                     
                }
            }
        }
    }

    private isLegalMove()

    
}
