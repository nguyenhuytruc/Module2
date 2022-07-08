import java.util.Scanner;

public class FirstPrime {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Nhập n số nguyên tố: ");
        int n = scanner.nextInt();
        System.out.printf("%d Số nguyên tố đầu tiên là: \n", n);
        int count = 0;
        int i = 2;
        while (count < n){
            if(isPrime(i)){
                System.out.println(i + " ");
                count++;
            }
            i++;
        }
    }
    public static  boolean isPrime(int n){
        if(n < 2){
            return false;
        }
        int checkPrime = (int)Math.sqrt(n);
        for (int i = 2; i <= checkPrime; i++){
            if (n % i == 0){
                return false;
            }
        }
        return true;
    }
}
