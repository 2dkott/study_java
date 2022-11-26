public class Chicken extends Bird implements Flyable{

    public Chicken(){
        super("Chicken", FeedType.HERBIVORE);
    }

    @Override
    public void eat(String foodName, int volume) {
        System.out.printf("\nChicken eats %s in volume of %s", foodName, volume);
    }

    @Override
    public String fly() {
        return "9 km/h";
    }

}
