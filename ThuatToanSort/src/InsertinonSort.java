public class InsertinonSort {
    void insertionSort(int[] arr) {
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            int key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
    }

    static void prinArray(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n; i++)
            System.out.print(arr[i] + " ");
        System.out.println();
    }

    public static void main(String[] args) {
        int [] arr = {13, 23, 5, 10, 12};
        System.out.println("Mảng ban đầu là: ");
        prinArray(arr);
        InsertinonSort ob = new InsertinonSort();
        ob.insertionSort(arr);
        System.out.println("Mảng sau khi sắp xếp: ");
        prinArray(arr);
    }
}
