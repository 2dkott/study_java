import java.util.Random;

public class Archer extends Warrior<Bow, Helmet>{

    private int minDistance = 2;

    public Archer(String name, Bow weapon, Helmet protection) {
        super(name, 100, weapon, protection);
    }

    public Archer(String name) {
        super(name, new Random().nextInt(20, 100),
                new Bow(new Random().nextInt(20, 50), new Random().nextInt(80, 100)),
                new Helmet(new Random().nextInt(5, 15)));
    }

    @Override
    public void attack(Warrior warrior, int distance) {
        if(minDistance > distance) return;
        baseAttack(warrior, distance);
    }

    @Override
    public void getDamage(int damagePoints) {
        System.out.printf("\n%s получил урон: %s", this, damagePoints);
        super.getDamage(damagePoints);
    }

    @Override
    public String toString() {
        return String.format("%s Лучнник(Здоровье:%s Лук:%s Защита:%s)", getName(), getHealthPoints(), getWeapon().getDamagePoints(),
                getProtection().getPoints());
    }
}
