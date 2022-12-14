package model;

import java.util.ArrayList;
import java.util.List;

public class RepositoryFileSemikolon implements Repository {
    private UserMapper mapper = new UserMapper();
    private FileOperation fileOperation;

    private final String DIVIDER = ";";

    public RepositoryFileSemikolon(FileOperation fileOperation) {
        this.fileOperation = fileOperation;
    }

    @Override
    public List<User> getAllUsers() {
        List<String> lines = fileOperation.readAllLines();
        List<User> users = new ArrayList<>();
        for (String line : lines) {
            users.add(mapper.map(line,DIVIDER));
        }
        return users;
    }

    @Override
    public String CreateUser(User user) {

        List<User> users = getAllUsers();
        int max = 0;
        for (User item : users) {
            int id = Integer.parseInt(item.getId());
            if (max < id){
                max = id;
            }
        }
        int newId = max + 1;
        String id = String.format("%d", newId);
        user.setId(id);
        users.add(user);
        List<String> lines = new ArrayList<>();
        for (User item: users) {
            lines.add(mapper.map(item,DIVIDER));
        }
        fileOperation.saveAllLines(lines);
        return id;
    }

    @Override
    public void deleteUsers(List<User> deleteUsers) {
        List<User> users = getAllUsers();
        users.removeAll(deleteUsers);
        List<String> lines = new ArrayList<>();
        for (User item: users) {
            lines.add(mapper.map(item,DIVIDER));
        }
        fileOperation.saveAllLines(lines);
    }
}
