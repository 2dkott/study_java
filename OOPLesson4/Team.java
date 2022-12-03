import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

public class Team <T extends Warrior> implements Iterable<T> {

    List<T> members = new ArrayList<>();

    public void add(T warrior){
        members.add(warrior);
    }

    @Override
    public Iterator<T> iterator() {
        return members.iterator();
    }

    public <E extends Warrior> void attack(int distance, Team<E> enemyTeam){
        members.stream().filter(T::isAlive).forEach(warrior -> {

            List<E> enemiesAlive = enemyTeam.members.stream().filter(E::isAlive).toList();

            if(!enemiesAlive.isEmpty()){
                int randomEnemy;
                if (enemiesAlive.size()==1) randomEnemy = 0;
                else randomEnemy = new Random().nextInt(enemiesAlive.size()-1);
                warrior.attack(enemiesAlive.get(randomEnemy), distance);
            }
        });
    }

    public String getAlive(){
        return String.format("\nКол-во выживших войнов: \n%s",members.stream().filter(T::isAlive).toList().toString());
    }

}
