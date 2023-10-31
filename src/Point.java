public class Point {
    public int x;
    public int y;
    {
        x=0;
        y=0;
    }

    public double distance(Point p)
    {
        return Math.hypot((this.x-p.x),(this.y-p.y));
    }

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return "Point{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
