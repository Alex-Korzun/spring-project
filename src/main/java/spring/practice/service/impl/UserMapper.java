package spring.practice.service.impl;

import spring.practice.dto.UserResponseDto;
import spring.practice.model.User;

public class UserMapper {
    public static UserResponseDto toDto(User user) {
        UserResponseDto dto = new UserResponseDto();
        dto.setId(user.getId());
        dto.setEmail(user.getEmail());
        return dto;
    }

    public static User fromDto (UserResponseDto userResponseDto) {
        User user = new User();
        user.setId(userResponseDto.getId());
        user.setEmail(userResponseDto.getEmail());
        return user;
    }
}
