import java.util.Scanner;

public class CurrencyConversion {
    public static void main(String[] args) {
        double vnd = 23000;
        double usd;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the amount USD: ");
        usd = scanner.nextDouble();
        double exchange = usd * vnd;
        System.out.println("Gía trị VNĐ: " + exchange);
    }
}
