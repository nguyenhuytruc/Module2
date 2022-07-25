package he_cac_doi_tuong_hinh_hoc;

public class RectangleTest {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        System.out.println(rectangle);

        rectangle = new Rectangle(2.4, 4.2);
        System.out.println(rectangle);

        rectangle = new Rectangle("orange" , true, 2.4, 5.6);
        System.out.println(rectangle);
    }
}
