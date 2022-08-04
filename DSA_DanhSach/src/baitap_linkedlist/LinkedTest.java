package baitap_linkedlist;

public class LinkedTest {
    public static void main(String[] args) {
        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.addFirst("Nguyễn");
        myLinkedList.add(1, "Huy");
        myLinkedList.add(2, "Trúc");
        myLinkedList.add(3,"C0522K1");
        myLinkedList.add(4,"CODE GYM");
        myLinkedList.addLast("Huế");

        myLinkedList.remove(2);
        myLinkedList.remove("CODE GYM");

        myLinkedList.printList();

        System.out.println( myLinkedList.contains("Huy"));

        System.out.println(myLinkedList.indexOf("Huy"));

        System.out.println("\n" + myLinkedList.get(2));

        System.out.println("size: " + myLinkedList.size());
    }
}
