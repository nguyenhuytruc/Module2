public class FindMinValue {
    public static void main(String[] args) {
        //khai báo một mảng numberArr sau đó khởi tạo các giá trị cho các phần tử.
        double[] numberArr = { 12.3, -4, 10, 4.24, 2, 71, -2, -6 };
        //gán giá trị của phần tử đầu tiên cho min, sau đó dùng min so sánh với các phần tử còn lại trong mảng.
        double min = numberArr[0];
        //in các phần tử trong mảng ra màn hình
        System.out.println("\n\nCác phần tử trong mảng là: ");
        for(double i : numberArr){
            System.out.print(i + ", ");
        }
        //dùng vòng lặp for duyệt các phần tử trong mảng. so sánh min với từng phần tử nếu số nào nhỏ hơn min thì gán nó cho min.
        // cứ lặp như vậy cho đến hết các phần tử thì min sẽ là giá trị lớn nhất trong mảng
        for (double num: numberArr) {
            if(min > num)
                min = num;
        }
        System.out.printf("\nSố nhỏ nhất trong mảng là: %.2f", min);
    }
}
