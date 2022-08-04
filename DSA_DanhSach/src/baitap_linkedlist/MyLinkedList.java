package baitap_linkedlist;

public class MyLinkedList {
    public class Node{
        Node next;
        Object data;

        public Node(Object data) {
            this.data = data;
        }

        public Object getData() {
            return data;
        }
    }

    private Node head;
    private int numOfNodes;

    public void addFirst(Object data){
        Node temp = head;
        head = new Node(data);
        head.next = temp;
        numOfNodes++;
    }

    public void addLast(Object data){
        Node temp = head;
        while (temp.next != null){
            temp = temp.next;
        }
        temp.next = new Node(data);
        numOfNodes++;
    }

    public void add(int index, Object data){
        Node temp = head;
        Node holder;
        for (int i = 0; i < index -1 && temp.next != null; i++){
            temp = temp.next;
        }
        holder = temp.next;
        temp.next = new Node(data);
        temp.next.next = holder;
        numOfNodes ++;

    }

    public Object get(int index){
        Node temp = head;
        for (int i = 0; i < index; i++){
            temp = temp.next;
        }
        return temp.data;
    }

    public void printList(){
        Node temp = head;
        while (temp != null){
            System.out.println(temp.data);
            temp = temp.next;
        }
    }

    public int size(){
        return numOfNodes;
    }

    public Object remove(int index){
        if (index < 0 || index > numOfNodes){
            throw new IllegalArgumentException("Error index: " + index);
        }
        Node temp = head;
        Object data;

        if (index == 0){
            data = temp.data;
            head = head.next;
            numOfNodes--;
        }else {
            for (int i = 0; i < index -1 && temp.next != null; i++){
                temp = temp.next;
            }
            data = temp.next.data;
            temp.next = temp.next.next;
            numOfNodes--;
        }
        return data;
    }

    public boolean remove(Object data) {
        if (head.data.equals(data)) {
            remove(0);
            return true;
        } else {
            Node temp = head;
            while (temp.next != null) {
                if (temp.next.data.equals(data)) {
                    temp.next = temp.next.next;
                    numOfNodes--;
                    return true;
                }
                temp = temp.next;
            }
        }
        return false;
    }

    public boolean contains(Object data){
        Node temp = head;
        while (temp.next != null){
            if (temp.data.equals(data)){
                return true;
            }
            temp = temp.next;
        }
        return false;
    }

    public int indexOf(Object data){
        Node temp = head;
        for (int i = 0; i < numOfNodes; i++){
            if (temp.getData().equals(data)){
                return i;
            }
            temp = temp.next;
        }
        return -1;
    }
}
