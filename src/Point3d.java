public class Point3d extends Point {
    public int z;

    public Point3d(int x, int y, int z) {
        super(x, y);
        this.z = z;
    }

    @Override
    public String toString() {
        return "Point3d{" +
                ", x=" + x +
                ", y=" + y + "z=" + z +
                '}';
    }

    @Override
    public double distance(Point p) {
        return super.distance(p);
    }
}
