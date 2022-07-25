package point2d_point3d;

public class Main {
    public static void main(String[] args) {
        Point2D point2D = new Point2D();
        point2D.setX(2.5f);
        point2D.setY(4.3f);
//        point2D.setXY(3.4f, 5.0f);
        System.out.println(point2D);

        Point3D point3D = new Point3D();
        point3D.setXYZ(2.3f, 4.1f, 7.8f);
        System.out.println(point3D);
    }
}
