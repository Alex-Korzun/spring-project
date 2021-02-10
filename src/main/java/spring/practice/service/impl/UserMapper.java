package spring.practice.service.impl;

import org.springframework.stereotype.Component;
import spring.practice.dto.UserResponseDto;
import spring.practice.model.User;

@Component
public class UserMapper {
    public UserResponseDto toDto(User user) {
        UserResponseDto dto = new UserResponseDto();
        dto.setId(user.getId());
        dto.setEmail(user.getEmail());
        return dto;
    }

    public User fromDto(UserResponseDto userResponseDto) {
        User user = new User();
        user.setId(userResponseDto.getId());
        user.setEmail(userResponseDto.getEmail());
        return user;
    }
}
