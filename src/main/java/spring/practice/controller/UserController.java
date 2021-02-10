package spring.practice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import spring.practice.dto.UserResponseDto;
import spring.practice.model.User;
import spring.practice.service.UserService;
import spring.practice.service.impl.UserMapper;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/user")
public class UserController {
    private final UserService userService;
    private final UserMapper userMapper;

    @Autowired
    public UserController(UserService userService, UserMapper userMapper) {
        this.userService = userService;
        this.userMapper = userMapper;
    }

    @GetMapping("/{userId}")
    public UserResponseDto get(@PathVariable Long userId) {
        return userMapper.toDto(userService.get(userId));
    }

    @GetMapping()
    public List<UserResponseDto> getAll() {
        return userService.listUsers()
                .stream()
                .map(userMapper::toDto)
                .collect(Collectors.toList());
    }

    @GetMapping("/inject")
    public void inject() {
        User bob = new User();
        bob.setEmail("bob@gmail.com");
        User alice = new User();
        alice.setEmail("alice@gmail.com");
        User john = new User();
        john.setEmail("john.gmail.com");
        User kyle = new User();
        kyle.setEmail("kyle@gmail.com");
    }
}
