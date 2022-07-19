import java.util.Scanner;

public class QuadraticEquation {
    private double a, b, c;

    public QuadraticEquation() {

    }

    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }

    public double getDiscriminant() {
        return (b * b) - (4 * a * c);
    }

    public String getResult() {
        double delta = getDiscriminant();
        if (delta > 0) {
            return "Result: x1= " + (-b + Math.sqrt(delta)) / (2 * a) + " , x2= " + (-b - Math.sqrt(delta)) / (2 * a);
        } else if (delta == 0) {
            return "Result: x1=x2= " + -b / (2 * a);
        } else {
            return "Result: The equation has no real roots";
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a # 0: ");
        double a = scanner.nextDouble();
        System.out.println("Enter b: ");
        double b = scanner.nextDouble();
        System.out.println("Enter c: ");
        double c = scanner.nextDouble();
        QuadraticEquation quadraticEquation = new QuadraticEquation(a, b, c);
        System.out.println("Enter: " + quadraticEquation.getA() + " * X2 + " + quadraticEquation.getB() + " * X + " + quadraticEquation.getC() + " = 0");
        System.out.println("Dental= " + quadraticEquation.getDiscriminant() + ". " + quadraticEquation.getResult());
    }
}
