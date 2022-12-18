package model;

import model.IdHandler;

import java.util.Objects;
import java.util.UUID;

public class NoteIdentifier {

    private final UUID id;

    public static NoteIdentifier of(String id){
        return new NoteIdentifier(UUID.fromString(id));
    }

    private NoteIdentifier(UUID id) {
        this.id = id;
    }

    public NoteIdentifier() {
        this.id = UUID.randomUUID();;
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
        if(o instanceof NoteIdentifier){
            return o.hashCode()==this.hashCode();
        }
        return false;
    }

}
