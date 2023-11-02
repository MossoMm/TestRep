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


    public double distance(Point3d p) {
        return Math.sqrt((this.x-p.x)*(this.x-p.x)+(this.y-p.y)*(this.y-p.y)+(this.z-p.z));
    }
}
