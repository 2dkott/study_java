import java.util.List;

public class Lesson2 {

    public static void main(String[] args) {
        Zoo zoo = new Zoo();
        zoo.addAnimal(new Chicken());
        zoo.addAnimal(new Penguin());
        zoo.addAnimal(new Anchovy());
        zoo.addAnimal(new Tiger());

        List<isHunter> hunters = zoo.getHunters();
        hunters.stream().forEach(hunter -> {
            hunter.hunt(new Anchovy());
        });

        List<Swimable> swimableAnimals = zoo.getSwimable();
        swimableAnimals.forEach(animal -> {
            System.out.printf("\n Speed of swim of %s is %s", ((Animal)animal).getName(), animal.getSwimSpeed());
        });
    }
}