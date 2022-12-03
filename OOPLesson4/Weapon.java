public abstract class Weapon {
    private int damagePoints;
    private int range;

    public Weapon(int damage, int range) {
        this.damagePoints = damage;
        this.range = range;
    }

    public int getDamagePoints() {
        return damagePoints;
    }

    public int getRange() {
        return range;
    }
}
