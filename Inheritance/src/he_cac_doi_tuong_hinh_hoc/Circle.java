package he_cac_doi_tuong_hinh_hoc;

public class Circle extends Shape {
    private double r = 1.0;

    public Circle(){

    }

    public Circle(double r) {
        this.r = r;
    }

    public Circle(String color, boolean filled, double r) {
        super(color, filled);
        this.r = r;
    }

    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }

    public double getArea(){
        return r * r * Math.PI;
    }

    public double getPerimeter(){
        return 2 * r * Math.PI;
    }

    @Override
    public String toString() {
        return "A Circle with radius = " + getR() + ", which is a subclass of " + super.toString();
    }
}
