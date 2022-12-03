import java.util.Random;

public class Paladin extends Warrior<Sword, Shild>{

    public Paladin(String name, int healthPoints, Sword weapon, Shild protection) {
        super(name, healthPoints, weapon, protection);
    }

    public Paladin(String name){
        this(name, new Random().nextInt(200, 250),
                new Sword(new Random().nextInt(200, 250), 1),
                new Shild(new Random().nextInt(300, 400), 20));
    }

    @Override
    public void getDamage(int damagePoints) {
        System.out.printf("\n%s получил урон: %s", this, damagePoints);
        super.getDamage(damagePoints);
    }

    @Override
    public void attack(Warrior warrior, int distance) {
        baseAttack(warrior, distance);
    }

    @Override
    public String toString() {
        return String.format("%s Паладин(Здоровье:%s Меч:%s Защита:%s)", getName(), getHealthPoints(), getWeapon().getDamagePoints(),
                getProtection().getPoints());
    }
}
