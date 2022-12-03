public abstract class Protection {
    private int points;
    private int damageRate;

    public Protection(int damageRate, int points) {
        this.points = points;
        this.damageRate =damageRate;
    }

    abstract int useProtection();

    public int getDamageRate() {
        return damageRate;
    }

    public int getPoints() {
        return points;
    }

    protected void setPoints(int points){
        this.points = points;
    }
}
