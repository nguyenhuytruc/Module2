package baitap_arraylist;
public class Test {
    public static class Student {
        private int id;
        private String name;

        public Student() {
        }

        public Student(int id, String name) {
            this.id = id;
            this.name = name;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }

    public static void main(String[] args) {
        Student student = new Student(1, "huy truc");
        Student student1 = new Student(2, "nguyen huy truc");
        Student student2 = new Student(3, "truc nguyen huy");
        Student student3 = new Student(4, "ht nguyen");
        Student student4 = new Student(5, "truc hn");
        Student student5 = new Student(6, "TRUC");

        MyArrayList<Student> studentMyArrayList = new MyArrayList<>();
        studentMyArrayList.add(student);
        studentMyArrayList.add(student1);
        studentMyArrayList.add(student2);
        studentMyArrayList.add(student3);
        studentMyArrayList.add(student4);
        studentMyArrayList.add(student5, 2);
        studentMyArrayList.size();
        System.out.println("size hiện tại là: " +studentMyArrayList.size());
        System.out.println();

        System.out.println(studentMyArrayList.get(3).getName());
        System.out.println();

        System.out.println(studentMyArrayList.indexOf(student3));
        System.out.println();

        System.out.println(studentMyArrayList.contains(student));
        System.out.println();

        studentMyArrayList.remove(3);

        for (int i = 0; i < studentMyArrayList.size(); i++) {
            Student student0 = (Student) studentMyArrayList.elements[i];
            System.out.println(student0.getId());
            System.out.println(student0.getName());

        }
    }
}
