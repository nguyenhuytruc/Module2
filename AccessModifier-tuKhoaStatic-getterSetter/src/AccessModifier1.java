public class AccessModifier1 {
    private String name = "Truc";
    private String classes = "C0522K1";

    AccessModifier1(){

    }

    @Override
    public String toString() {
        return "name: " + name + " class: " + classes;
    }

    public void setName(String name){
        this.name = name;
    }
    public void setClasses(String classes){
        this.classes = classes;
    }

    public static void main(String[] args) {
        AccessModifier1 std = new AccessModifier1();
        std.setName("Huy Truc");
        std.setClasses("C0522K1 PRO");
        System.out.println(std);
    }
}
