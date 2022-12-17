package persistance;

import model.UserNames;
import model.UserObject;

import java.util.List;

public interface UserRepository {
    List<UserObject> getAllUsers();
    UserObject getUserByName(UserNames userNames);
    UserObject createUser(UserNames userNames);
}
