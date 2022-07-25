package circle_and_cylinder;

public class Cylinder extends Circle{
    private double h = 1.0;

    public Cylinder(){

    }

    public Cylinder(double h) {
        this.h = h;
    }

    public Cylinder(double radius, String color, double h) {
        super(radius, color);
        this.h = h;
    }

    public double getH() {
        return h;
    }

    public void setH(double h) {
        this.h = h;
    }

    public double getCubicmeter(){
        return Math.PI * getRadius() * 2 * h;
    }

    @Override
    public String toString() {
        return "A height cylinder: " + getH() + " which is a subclass of" + super.toString() + ", Cubic meter:" + getCubicmeter();
    }
}
