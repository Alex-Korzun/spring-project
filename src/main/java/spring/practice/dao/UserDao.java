package spring.practice.dao;

import spring.practice.model.User;
import java.util.List;

public interface UserDao {
    void add(User user);

    List<User> listUsers();
}
