public class Product {

    private final String name;
    private final int calories;

    public Product(String name, int calories) {
        this.calories = calories;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getCalories() {
        return calories;
    }

    @Override
    public String toString() {
        return String.format("Product %s(Cals:%s)", name, calories);
    }

}
