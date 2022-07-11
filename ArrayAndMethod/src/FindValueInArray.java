import java.util.Scanner;

public class FindValueInArray {
    public static void main(String[] args) {
        String [] students = {"Trúc","Sang","Nhật","Huy","Kiện"};
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập tên học sinh: ");
        String input_name = scanner.nextLine();
        boolean isExist = false;
        for (int i = 0; i < students.length; i++){
            if(students[i].equals(input_name)){
                System.out.println("Vị trí của sinh viên trong danh sách " + input_name + " là: " + i);
                isExist = true;
                break;
            }
        }
        if(!isExist){
            System.out.println("Không tìm thấy " + input_name + " trong danh sách");
        }
    }
}
