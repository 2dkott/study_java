public class Helmet extends Protection{


    public Helmet(int points) {
        super(5, points);
    }

    public Helmet() {
        this(15);
    }

    @Override
    public int useProtection() {
        int temp = getPoints();
        setPoints(getPoints()-getDamageRate());
        return temp;
    }

    @Override
    public String toString(){
        return String.format("Helmet(%s)", getPoints());
    }
}
