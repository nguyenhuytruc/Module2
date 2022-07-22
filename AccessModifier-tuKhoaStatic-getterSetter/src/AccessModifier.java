public class AccessModifier {
    private double radius = 1.0;
    private String color = "red";
    AccessModifier(){

    }
    AccessModifier(double radius){
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }
    public double getArea(){
        return radius * radius * 3.14;
    }

    public static void main(String[] args) {
        AccessModifier circle = new AccessModifier(1.3);
        System.out.println(circle.getArea());
        System.out.println(circle.getRadius());
    }
}
