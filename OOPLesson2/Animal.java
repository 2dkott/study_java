public abstract class Animal {

    protected AnimalClass animalClass;
    protected String name;
    protected FeedType feedType;


    public Animal(AnimalClass animalClass, FeedType feedType, String name) {
        this.animalClass = animalClass;
        this.feedType = feedType;
        this.name = name;
    }

    abstract void eat(String foodName, int volumn);

    public AnimalClass getAnimalClass() {
        return animalClass;
    }

    public String getName() {
        return name;
    }

    public FeedType getFeedType() {
        return feedType;
    }
}
