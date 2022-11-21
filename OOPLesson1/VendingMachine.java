import java.util.ArrayList;
import java.util.List;

public class VendingMachine {

    private final List<Product> products = new ArrayList<>();

    public void addProduct(Product product) {
        System.out.printf("%s was added\n", product.toString());
        products.add(product);
    }

    public void showProducts() {
        System.out.println("There are following products in machine:");
        System.out.println(products.toString()
                .replace("[", "")
                .replaceAll("]", "")
                .replaceAll(", ", "\n"));
    }

}
