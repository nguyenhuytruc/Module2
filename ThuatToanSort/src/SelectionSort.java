public class SelectionSort {
    static double[] list = {14.5, 4.2, 5, 76, 12.2, 4.1, 10, -2.2};

    public static void selectionSort(double[] list) {
        for (int i = 0; i < list.length - 1; i++) {
            double currentMin = list[i];
            int currentMinIdex = i;

            for (int j = i + 1; j < list.length; j++) {
                if (currentMin > list[j]) {
                    currentMin = list[j];
                    currentMinIdex = j;
                }
            }
            if (currentMinIdex != i) {
                list[currentMinIdex] = list[i];
                list[i] = currentMin;
            }
        }
    }

    public static void main(String[] args) {
        selectionSort(list);
        for (int i = 0; i < list.length; i++)
        System.out.println(list[i] + " ");
    }
}