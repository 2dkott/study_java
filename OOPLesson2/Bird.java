public abstract class Bird extends Animal{

    public Bird(String name, FeedType feedType){
        super(AnimalClass.AVES, feedType, name);
    }

    public Bird(String name){
        this(name, FeedType.OMNIVORE);
    }
}
