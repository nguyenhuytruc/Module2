package Colorable;

public class SquareTest {
    public static void main(String[] args) {
        Square square = new Square();
        System.out.println(square);

        square = new Square(4.5);
        System.out.println(square);

        square = new Square(6.5, "yellow", false);
        System.out.println(square);
    }
}
