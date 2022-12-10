package model;

import java.util.Objects;

public class User {
    private String id = "";
    private String firstName;
    private String lastName;
    private String phone;

    public User(String firstName, String lastName, String phone) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.phone = phone;
    }

    public User(String id, String firstName, String lastName, String phone) {
        this(firstName, lastName, phone);
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public int hashCode(){
        return Objects.hash(firstName,lastName,phone,id);
    }

    @Override
    public boolean equals(Object o){
        if(o instanceof User){
            return ((User) o).firstName.equals(firstName) && ((User) o).lastName.equals(lastName) && ((User) o).phone.equals(phone);
        }
        return false;
    }

    @Override
    public String toString() {
        return String.format("Идентафикатор: %s\nИмя: %s,\nФамилия: %s,\nТелефон: %s", id, firstName, lastName, phone);
    }
}
