public abstract class Warrior <T extends Weapon, E extends Protection>{
    private T weapon;
    private E protection;
    private int healthPoints;
    private boolean isAlive = true;
    private String name;

    public Warrior(String name, int healthPoints, T weapon, E protection) {
        this.weapon = weapon;
        this.protection = protection;
        this.healthPoints = healthPoints;
        this.name = name;
    }

    public T getWeapon() {
        return weapon;
    }

    public E getProtection() {
        return protection;
    }

    public boolean isAlive() {
        return isAlive;
    }

    public int getHealthPoints() {
        return healthPoints;
    }

    public String getName() {
        return name;
    }

    public static int calculateDamageAnProtection(int protectionPoints, int damagePoints){
        int points = protectionPoints - damagePoints;
        return points > 0 ? 0 : -points;
    }


    public void getDamage(int damagePoints){
        if(!isAlive) return;
        healthPoints = healthPoints - calculateDamageAnProtection(protection.useProtection(), damagePoints);
        if(healthPoints<=0){
            isAlive = false;
            System.out.print(" Воин умер!");
        }
    }

    protected void baseAttack(Warrior warrior, int distance){
        if(!warrior.isAlive()) return;
        if(distance > weapon.getRange()) return;
        System.out.printf("\n%s атакует %s", this, warrior.toString());
        warrior.getDamage(weapon.getDamagePoints());
    }

    public abstract void attack(Warrior warrior, int distance);
}
