package persistance;

import model.Identifier;
import model.UserNames;
import model.UserObject;

public class UserObjectMapper {

    public static UserObject map(String userString, String divider){
        String[] record = userString.split(divider);
        return UserObject.of(new Identifier(record[0]), new UserNames(record[1],record[2]));
    }

    public static String map(UserObject userObject){
        return String.format("%s,%s,%s",
                userObject.getIdentifier().toString(),
                userObject.getNames().getFirstName(),
                userObject.getNames().getLastName());
    }
}
