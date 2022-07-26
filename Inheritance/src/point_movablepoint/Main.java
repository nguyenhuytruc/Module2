package point_movablepoint;

public class Main {
    public static void main(String[] args) {
        Point point = new Point();
        point.setX(5.7f);
        point.setY(8.8f);
        point.setXY(122.3f, 44.3f);
        System.out.println(point);

        MovablePoint movablePoint = new MovablePoint();
        movablePoint.setX(3.4f);
        movablePoint.setY(4.5f);
        movablePoint.setSpeed(2.3f, 5.4f);
        System.out.println(movablePoint);
        System.out.println(movablePoint.move());

    }
}
