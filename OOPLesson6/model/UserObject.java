package model;

public class UserObject{

    final private Identifier identifier;
    final private UserNames names;

    public UserObject(UserNames names){
        this(new Identifier(), names);
    }

    private UserObject(Identifier identifier, UserNames names){
        this.names = names;
        this.identifier = identifier;
    }

    public static UserObject of(Identifier identifier, UserNames names){
        return new UserObject(identifier, names);
    }

    public Identifier getIdentifier() {
        return identifier;
    }

    public UserNames getNames() {
        return names;
    }

    @Override
    public String toString(){
        return String.format("Пользователь '%s'(id:%s)", names.getFullName(), identifier.toString());
    }



}
