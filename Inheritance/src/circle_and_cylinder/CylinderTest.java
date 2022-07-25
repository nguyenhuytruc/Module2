package circle_and_cylinder;

public class CylinderTest {
    public static void main(String[] args) {
        Cylinder cylinder = new Cylinder();
        System.out.println(cylinder);

        cylinder = new Cylinder(2.3, "yellow", 4.5);
        System.out.println(cylinder);
    }
}
