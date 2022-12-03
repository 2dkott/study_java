public class Shild extends Protection{
    private final int weight;

    public Shild(int points, int weight) {
        super(2, points);
        this.weight = weight;
    }

    public Shild() {
        super(2,200);
        this.weight = 10;
    }

    @Override
    public int useProtection() {
        int temp = getPoints();
        setPoints(getPoints()-getDamageRate());
        return temp;
    }

    public int getWeight() {
        return weight;
    }
}
