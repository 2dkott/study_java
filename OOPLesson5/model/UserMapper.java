package model;

public class UserMapper {
    public String map(User user, String divider) {
        return String.format("%s,%s,%s,%s", user.getId(), user.getFirstName(), user.getLastName(), user.getPhone()).replace(",", divider);
    }

    public User map(String line, String divider) {
        String[] lines = line.split(divider);
        return new User(lines[0], lines[1], lines[2], lines[3]);
    }
}
