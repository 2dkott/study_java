public class Penguin extends Bird implements Swimable, isHunter{

    private String swimSpeed = "9 km/h";
    public Penguin() {
        super("Penguin");
    }

    @Override
    public void eat(String foodName, int volume) {
        System.out.printf("\nPenguin eats %s in volume of %s", foodName, volume);
    }

    @Override
    public void swim() {
        //Jus swim
    }

    @Override
    public String getSwimSpeed() {
        return swimSpeed;
    }

    @Override
    public void hunt(Animal animal) {
        System.out.printf("\bPenguin hunts %s", animal.name);
        eat(animal.name, 1);
    }

}
