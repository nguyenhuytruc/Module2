package Colorable;

public class ColorableTest {
    public static void main(String[] args) {
        Square[] squares = new Square[2];
        squares[0] = new Square(4.5,"pink",false);
        squares[1] = new Square(5.6);

        for (Square square : squares){
            System.out.println(square.getColor());
        }
    }
}
