public class Chocolate extends Product{

    private final String color;
    public Chocolate(String color) {
        super("Chocolate", 2000);
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    @Override
    public String toString() {
        return String.format("%s %s (Cals:%s)", getColor(), getName(), getCalories());
    }
}
