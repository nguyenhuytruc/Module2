import java.util.Scanner;

public class RemoveElementFromArray {
    public static void main(String[] args) {
        int n, i, c;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Nhập vào số phần tử của mảng: ");
            n = scanner.nextInt();
        } while (n <= 0);
        int array[] = new int[n];
        System.out.println("Nhập các phần tử cho mảng: ");
        for (i = 0; i < n; i++) {
            System.out.print("Nhập phần tử thứ " + i + " : ");
            array[i] = scanner.nextInt();
        }
        System.out.println("Nhập số muốn xóa: ");
        int k = scanner.nextInt(); //gán số nguyên muốn xóa là "k"
        for (c = i = 0; i < n; i++) {
            if (array[i] != k) {
                array[c] = array[i];
                c++;
            }
        }
        n = c;
        System.out.println("Mảng còn lại sau khi xóa phần tử " + k + " là: ");
        for (i = 0; i < n; i++) {
            System.out.print(array[i] + "\t");
        }
    }
}