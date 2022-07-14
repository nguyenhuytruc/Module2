public class InsertionSortByStep {
    public void insertionSort(int arr[]) {
        int valueToInsertion;
        int holePosition;
        int i;

        for (i = 1; i < arr.length; i++) {   //lặp qua tất cả các số
            valueToInsertion = arr[i];      //chọn một giá trị để chèn
            holePosition = i;               // chọn vị trí để chèn
            // kiểm tra xem số liền trước có lớn hơn giá trị được chèn không
            while (holePosition > 0 && arr[holePosition - 1] > valueToInsertion) {
                arr[holePosition] = arr[holePosition - 1];
                holePosition--;
                System.out.println("Di chuyển phần tử: " + arr[holePosition]);
            }
            if (holePosition != i) {
                System.out.println("Chèn phần tử: " + valueToInsertion + ", tại vị trí: " + holePosition);
                arr[holePosition] = valueToInsertion;   //chèn phần tử tại vị trí chèn
            }
            System.out.println("Vòng lặp thứ " + i);
            display(arr);
        }
    }
    public void display(int[]arr){
        int i;
        System.out.print("[");
        // duyệt qua các phần tử
        for (i = 0; i <arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.print("]\n");
    }

    public static void main(String[] args) {
        //khởi tạo mảng array
        int arr [] = {6, 7, 0, 2, 8, 1, 3, 9, 4, 5};

        InsertionSortByStep insertionSortByStep = new InsertionSortByStep();
        System.out.println("Mảng dữ liệu đầu vào: ");
        insertionSortByStep.display(arr);
        System.out.println("*********************");
        insertionSortByStep.insertionSort(arr);
        System.out.println("*********************");
        System.out.println("\nMảng sau khi đã sắp xếp: ");
        insertionSortByStep.display(arr);
    }
}

