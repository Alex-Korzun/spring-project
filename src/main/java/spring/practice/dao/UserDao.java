package spring.practice.dao;

import spring.practice.model.User;

public interface UserDao {
    void add(User user);

    List<User> listUsers();
}
