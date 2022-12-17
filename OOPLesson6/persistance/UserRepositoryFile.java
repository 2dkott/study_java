package persistance;

import model.UserDoesntExistException;
import model.UserExistException;
import model.UserObject;
import model.UserNames;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class UserRepositoryFile implements UserRepository {
    private FileOperation fileOperation;

    private final String DIVIDER = ",";

    public UserRepositoryFile(FileOperation fileOperation) {
        this.fileOperation = fileOperation;
    }

    @Override
    public UserObject getUserByName(UserNames userNames){
        List<UserObject> users = getAllUsers();
        Optional<UserObject> resultUsers = users.stream().filter(user->user.getNames().equals(userNames)).findFirst();
        return resultUsers.orElseThrow(()->new UserDoesntExistException(userNames.getFullName()));
    }

    @Override
    public List<UserObject> getAllUsers() {
        List<String> lines = fileOperation.readAllLines();
        List<UserObject> users = new ArrayList<>();
        for (String line : lines) {
            users.add(UserObjectMapper.map(line,DIVIDER));
        }
        return users;
    }

    @Override
    public UserObject createUser(UserNames userNames) {
        try {
            getUserByName(userNames);
        } catch (UserDoesntExistException e){
            UserObject user = new UserObject(userNames);
            fileOperation.addLine(UserObjectMapper.map(user));
            return user;
        }
        throw new UserExistException(userNames.getFullName());
    }


}
