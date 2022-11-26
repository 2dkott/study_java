import java.util.ArrayList;
import java.util.List;

public class Zoo {

    private List<Animal> animals = new ArrayList<>();

    public void addAnimal(Animal animal) {
        animals.add(animal);
    }

    public List<isHunter> getHunters() {
        return animals.stream().filter(x -> x instanceof isHunter).map(x -> (isHunter) x).toList();
    }

    public List<Swimable> getSwimable() {
        return animals.stream().filter(x -> x instanceof Swimable).map(x -> (Swimable) x).toList();
    }

}
