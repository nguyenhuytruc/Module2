package resizeable;

public class ResizeableTest {
    public static void main(String[] args) {
        double percent = (Math.random()*100) +1;
        Circle[] circles = new Circle[3];
        circles[0] = new Circle(3.5);
        circles[1] = new Circle(4.7);
        circles[2] = new Circle(5.4);

        System.out.println("Circle");
        for (Circle circle : circles ){
            circle.resizeable(percent);
        }
    }
}
