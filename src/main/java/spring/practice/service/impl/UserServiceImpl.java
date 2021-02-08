package spring.practice.service.impl;

import org.springframework.stereotype.Service;
import spring.practice.dao.UserDao;
import spring.practice.model.User;
import spring.practice.service.UserService;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    private UserDao userDao;

    public UserServiceImpl(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public void add(User user) {
        userDao.add(user);
    }

    @Override
    public List<User> listUsers() {
        return userDao.listUsers();
    }
}
