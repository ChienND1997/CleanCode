package com.chiennd.cleancode.factory;

import com.chiennd.cleancode.dto.UserDto;
import com.chiennd.cleancode.entity.User;
import com.chiennd.cleancode.enums.UserType;
import com.chiennd.cleancode.mapper.UserMapper;

import lombok.RequiredArgsConstructor;

import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class UserFactory {

    private final UserMapper userMapper = new UserMapper();

    public User createUser(UserDto userDto) {
        User user = null;
        if (UserType.STUDENT.toString().equals(userDto.getMode())) {
            user = userMapper.convertToStudent(userDto);
        } else if (UserType.TEACHER.toString().equals(userDto.getMode())) {
            user = userMapper.convertToTeacher(userDto);
        }
        return user;
    }

}
