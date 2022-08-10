package bt_arraylist_linkedlist;

public class Product {
    private String name;
    private long id;
    private int quantity;
    private double price;

    public Product(long id, String name, int quantity, double price) {
        this.id = id;
        this.name = name;
        this.quantity = quantity;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", quantity=" + quantity +
                ", price=" + price +
                '}';
    }
}
