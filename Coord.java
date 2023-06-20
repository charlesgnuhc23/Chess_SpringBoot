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
        return "";
    }

    public Point coordinateToPoint(String coordinate)
    {
        return new Point();
    }
}
