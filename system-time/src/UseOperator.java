import java.util.Scanner;

public class UseOperator {
    public static void main(String[] args) {
        float whidth;
        float height;
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter width: ");
        whidth = scanner.nextFloat();
        System.out.println("enter height: ");
        height = scanner.nextFloat();
        float area = whidth * height;
        System.out.println("area is: " + area);
    }
}
