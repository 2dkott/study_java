package model;

import java.util.Objects;
import java.util.UUID;

public class Identifier {

    private final UUID id;

    public Identifier(String id) {
        this.id = UUID.fromString(id);
    }

    public Identifier(UUID id) {
        this.id = id;
    }

    public Identifier() {
        this.id = IdHandler.generateId();
    }

    @Override
    public String toString(){
        return id.toString();
    }

    @Override
    public int hashCode(){
        return Objects.hash(id);
    }

    @Override
    public boolean equals(Object o){
        if(o instanceof Identifier){
            return o.hashCode()==this.hashCode();
        }
        return false;
    }

}
