package spring.practice;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import spring.practice.config.AppConfig;
import spring.practice.model.User;
import spring.practice.service.UserService;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context
                = new AnnotationConfigApplicationContext(AppConfig.class);
        UserService userService = context.getBean(UserService.class);
        User bob = new User();
        bob.setEmail("bob@gmail.com");
        bob.setPassword("password");
        userService.add(bob);
        userService.listUsers().forEach(System.out::println);
    }
}
