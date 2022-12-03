public class Lesson4 {

    public static void main(String[] args){

        Team<Paladin> redPaladinsTeam = new Team<>();
        redPaladinsTeam.add(new Paladin("Первый"));
        redPaladinsTeam.add(new Paladin("Второй"));
        redPaladinsTeam.add(new Paladin("Третий"));
        redPaladinsTeam.add(new Paladin("Четвертый"));

        Team<Archer> blueArchersTeam = new Team<>();
        blueArchersTeam.add(new Archer("Первый"));
        blueArchersTeam.add(new Archer("Второй"));
        blueArchersTeam.add(new Archer("Третий"));
        blueArchersTeam.add(new Archer("Четвертый"));
        blueArchersTeam.add(new Archer("Пятиый"));
        blueArchersTeam.add(new Archer("Шестрой"));

        int startDistance = 80;
        while (startDistance > 0){
            blueArchersTeam.attack(startDistance, redPaladinsTeam);
            redPaladinsTeam.attack(startDistance, blueArchersTeam);
            startDistance -= 1;
        }

        System.out.print(redPaladinsTeam.getAlive());
        System.out.print(blueArchersTeam.getAlive());

    }
}
