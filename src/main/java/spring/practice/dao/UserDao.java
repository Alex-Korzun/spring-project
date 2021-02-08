package spring.practice.dao;

import java.util.List;
import spring.practice.model.User;

public interface UserDao {
    void add(User user);

    List<User> listUsers();
}
