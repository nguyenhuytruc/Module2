public class StaticMethod {
    private int rollno;
    private String name;
    private static String college = "C0522K1";

    //constructor to initialize the variable
    StaticMethod(int r, String n) {
        rollno = r;
        name = n;
    }

    //static method to change the value of static variable
    static void change() {
        college = "CODEGYM";
    }

    //method to display values
    void display() {
        System.out.println(rollno + " " + name + " " + college);
    }

    public static void main(String[] args) {
            StaticMethod.change(); //calling change method

            //creating objects
            StaticMethod s1 = new StaticMethod(111, "Truc");
            StaticMethod s2 = new StaticMethod(222, "Huy");
            StaticMethod s3 = new StaticMethod(333, "Nguyen");

            //calling display method
            s1.display();
            s2.display();
            s3.display();
    }
}
