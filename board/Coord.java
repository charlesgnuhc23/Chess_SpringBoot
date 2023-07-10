package board;
public class Coord {
    public Coord() {}
    
    public Coord(int i, int j) {
        
    }

    Point point;       // x = 1st array index, y = second array index
    String coordinate; // A1-H8

    public String getCoordinate() {
        return this.coordinate;
    }

    public Point getPoint() {
        return this.point;
    }

    public void setCoord(Point newPoint)
    {
        point = newPoint;
        coordinate = pointToCoordinate(point);
    }

    public void setCoord(String newCoordinate)
    {
        coordinate = newCoordinate;
        point = coordinateToPoint(coordinate);
    }

    public String pointToCoordinate(Point point)
    {
        int x = point.x;    // x = {0,7}
        int y = point.y;    // y = {0,7}

        char letter = (char) ('A' + x);
        char number = (char) (y + 49);

        String coord = "";
        coord += letter;
        coord += number;

        return coord;
    }

    public Point coordinateToPoint(String coordinate)
    {
        char letter = coordinate.toCharArray()[0];   // {A, H}
        char number = coordinate.toCharArray()[1];   // {1, 8}

        int x = Character.valueOf(letter) - 65;
        int y = Character.valueOf(number) - 49;

        Point point = new Point(x, y);
        return point;
    }
}
