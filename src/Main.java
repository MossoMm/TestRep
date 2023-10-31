// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        System.out.println("Hello");

        Point point = new Point(0,4);
        System.out.println(point);
        Point point2 = new Point(3,0);
        System.out.println(point.distance(point2));
        Point3d point3D = new Point3d(1,2,3);
        System.out.println(point3D);
        point.x=10;
        point.y=20;
        System.out.println(point2);
        System.out.println(point);


    }
}