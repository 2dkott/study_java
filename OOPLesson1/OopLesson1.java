import java.util.*;

public class OopLesson1 {

    public static void main(String[] args) {
        VendingMachine vendingMachine = new VendingMachine();

        vendingMachine.addProduct(new Product("Chocolate", 800));
        vendingMachine.addProduct(new Product("Pepsi", 2023));
        vendingMachine.addProduct(new Product("Banana", 630));

        vendingMachine.showProducts();
    }
}
