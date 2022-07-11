import java.awt.*;
import java.util.ArrayList;
import java.util.Arrays;

public class MoveElementFromArray {
    public static void main(String[] args) {
        // Tạo mảng
        String[] arr = {"12", "23" , "34", "45", "56"};

        // In mảng ban đầu
        System.out.println("Old arr:\n"
                + Arrays.toString(arr));

        // Lấy độ dài mảng ban đầu
        int N = arr.length;

        /*Tạo một mảng mới cùng tên có độ dài N+1 và copy mảng ban đầu */
        arr = Arrays.copyOf(arr, N + 1);

        //Thêm 1 phần tử vào mảng mới
        arr[N] = "65";

        // In mảng kết quả
        System.out.println("New arr:\n"
                + Arrays.toString(arr));
    }
}

