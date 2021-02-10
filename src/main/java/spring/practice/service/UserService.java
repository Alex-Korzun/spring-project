package spring.practice.service;

import java.util.List;
import spring.practice.model.User;

public interface UserService {
    void add(User user);

    List<User> listUsers();

    User get(Long id);
}
