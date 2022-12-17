package model;

import java.util.Objects;

public class UserNames {

    final private String firstName;
    final private String lastName;

    public UserNames(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public static UserNames ofFullName(String fullName, String divider){
        String[] fullNameRecord = fullName.split(divider);
        return new UserNames(fullNameRecord[0],fullNameRecord[1]);
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getFullName(){
        return String.format("%s %s", firstName, lastName);
    }

    @Override
    public int hashCode(){
        return Objects.hash(firstName,lastName);
    }

    @Override
    public boolean equals(Object o){
        if(o instanceof UserNames){
            return o.hashCode()==this.hashCode();
        }
        return false;
    }

}
