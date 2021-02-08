package spring.practice;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import spring.practice.config.AppConfig;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context
                = new AnnotationConfigApplicationContext(AppConfig.class);

    }
}
