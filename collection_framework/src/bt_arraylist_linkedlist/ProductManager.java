package bt_arraylist_linkedlist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class ProductManager {
    Scanner sc = new Scanner(System.in);
    private ArrayList<Product> products= new ArrayList<>();

    public ProductManager(){
        products.add(new Product(10000, "Tesla", 10, 100));
        products.add(new Product(10001, "Volvo", 7, 99));
        products.add(new Product(10002, "BMW", 4, 150));
        products.add(new Product(10003, "Mercedes", 6, 110));
        products.add(new Product(10004, "Honda CRV", 2, 30));
        products.add(new Product(10005, "Ferrari Limited :)))", 1, 200));
    }
    public void renderProduct(){
        System.out.printf("\n\t%-16s %-36s %-26s %s\n\n", "Product ID", "Product Name", "Product Quantity", "Product Price");
        for (Product product : products)
            System.out.printf("\t%-16s %-36s %-26d $%.2f\n", product.getId(), product.getName(), product.getQuantity(), product.getPrice());
        System.out.println();
    }
    public  void addProduct(){
        renderProduct();
        System.out.println("Input product name: ");
        String name = sc.nextLine();

        System.out.println("Input product quantity: ");
        int quantity = Integer.parseInt(sc.nextLine());

        System.out.println("Input product price: ");
        double price = Double.parseDouble(sc.nextLine());
        products.add(0,new Product(System.currentTimeMillis() % 1000, name, quantity, price));

        renderProduct();
        System.out.println("\n■ Product added successfully!");
    }
    public void editProduct(){
        renderProduct();

        System.out.println("Input product ID to edit: ");
        int productId = Integer.parseInt(sc.nextLine());

        for (Product product : products) {
            if (productId == product.getId()) {
                System.out.print("■ Product: " + product + "\n■ Input a new product name: ");
                String newProductName = sc.nextLine();

                System.out.print("■ Input a new product quantity: ");
                int newProductQuantity = Integer.parseInt(sc.nextLine());

                System.out.print("■ Input a new product price: ");
                double newProductPrice = Double.parseDouble(sc.nextLine());

                product.setName(newProductName);
                product.setQuantity(newProductQuantity);
                product.setPrice(newProductPrice);
            }
        }
        renderProduct();
        System.out.println("\n■ Product edited successfully!");
    }
    public void removeProduct(){
        renderProduct();


        System.out.print("■ Type a product id to remove: ");
        int productId = Integer.parseInt(sc.nextLine());

        products.removeIf(product -> productId == product.getId());

        renderProduct();
        System.out.println("\n■ Product removed successfully!");
    }
    public void searchProductByName(){
        renderProduct();
        System.out.println("Input product name to search: ");
        String productName = sc.nextLine();
        int flag = 0;
        for (Product product : products) {
            if (product.getName().contains(productName)) {
                System.out.printf("\t%-16s %-36s %-26d $%.2f\n", product.getId(), product.getName(), product.getQuantity(), product.getPrice());
                flag++;
            }
        }
        if (flag ==0) System.out.println("Product not found! ");
    }
    public void sortByPriceASC() {
        Collections.sort(this.products, new Comparator<Product>() {

            public int compare(Product o1, Product o2) {
                if (o1.getPrice() > o2.getPrice()){
                    return 1;
                } else if (o1.getPrice() < o2.getPrice())
                {
                    return -1;
                }else return 0;
            }
        });
        renderProduct();
    }
    public void sortByPriceDESC() {
        Collections.sort(this.products, new Comparator<Product>() {
            @Override
            public int compare(Product o1, Product o2) {
                if (o2.getPrice() > o1.getPrice()){
                    return 1;
                } else if (o2.getPrice() < o1.getPrice())
                {
                    return -1;
                }else return 0;
            }
        });
        renderProduct();
    }
}
