public class Tiger extends Cats implements isHunter{

    public Tiger(){
        super("Tiger");
    }

    @Override
    public void eat(String foodName, int volume){
        System.out.printf("\nTiger eats %s in volume of %s", foodName, volume);
    }

    @Override
    public void hunt(Animal animal){
        System.out.printf("\nTiger hunts %s", animal.name);
        eat(animal.name, 10);
    }

}
