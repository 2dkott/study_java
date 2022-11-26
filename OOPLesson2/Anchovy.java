public class Anchovy extends Fish implements Swimable {

    String speed = "5 km/h";
    public Anchovy(){
        super("Anchovy");
    }

    @Override
    public void eat(String foodName, int volume){
        System.out.printf("\nAnchovy eats %s in volume of %s", foodName, volume);
    }

    @Override
    public void swim(){
        //Jus swim
    }

    @Override
    public String getSwimSpeed() {
        return speed;
    }
}
