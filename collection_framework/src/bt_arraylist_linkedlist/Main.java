package bt_arraylist_linkedlist;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ProductManager productManager = new ProductManager();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("---------------------------------------------------" +
                    "\n                                                            " +
                    "\n                            Menu                            " +
                    "\n                                                            " +
                    "\n                     1 Product list                         " +
                    "\n                     2 Product Add                          " +
                    "\n                     3 Product Edit                         " +
                    "\n                     4 Product Remove                       " +
                    "\n                     5 Product Search                       " +
                    "\n                     6 Product Sort (Ascending Price)       " +
                    "\n                     7 Product Sort (Descending Price)      " +
                    "\n                     8 Exit                                 " +
                    "\n------------------------------------------------------------" +
                    "\nType a number above by your choice:                          ");
            String choice = scanner.nextLine();

            switch (choice) {
                case "1":
                    productManager.renderProduct();
                    break;

                case "2":
                    productManager.addProduct();
                    break;

                case "3":
                    productManager.editProduct();
                    break;

                case "4":
                    productManager.removeProduct();
                    break;

                case "5":
                    productManager.searchProductByName();
                    break;

                case "6":
                    productManager.sortByPriceASC();
                    break;

                case "7":
                    productManager.sortByPriceDESC();

                case "8":
                    System.out.println("■ Exiting the application successfully!");
                    System.exit(0);

                default:
                    System.out.println("■ Invalid selected number, please try again!");

            }
        }
    }
}
