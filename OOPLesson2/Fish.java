abstract class Fish extends Animal{

    public Fish(String name, FeedType feedType){
        super(AnimalClass.PISCES, feedType, name);
    }

    public Fish(String name){
        this(name, FeedType.OMNIVORE);
    }
}
