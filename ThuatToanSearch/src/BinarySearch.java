public class BinarySearch {
    static int [] list = {3, 5, 7, 9, 11, 13, 14, 56, 62, 76, 89};
    static int binarySearch(int [] list, int key){
        int low = 0;
        int hight = list.length -1;
        while (hight >= low){
            int mid = (low + hight) / 2;
            if(key < list[mid])
                hight = mid - 1;
            else if (key == list[mid])
                return mid;
            else low = mid + 1;
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println(binarySearch(list,3));
        System.out.println(binarySearch(list,5));
        System.out.println(binarySearch(list,76));
    }
}
