package com.chiennd.cleancode.service;

import com.chiennd.cleancode.factory.UserFactory;
import com.chiennd.cleancode.mapper.UserMapper;
import lombok.RequiredArgsConstructor;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.chiennd.cleancode.dto.UserDto;
import com.chiennd.cleancode.dto.UserResponseDto;
import com.chiennd.cleancode.entity.User;
import com.chiennd.cleancode.error.ErrorCodes;
import com.chiennd.cleancode.error.ServiceRuntimeException;
import com.chiennd.cleancode.repo.UserRepository;

@Service
@RequiredArgsConstructor
public class UserService {

	private final UserRepository userRepository;
	private final UserFactory userFactory;
	private final UserMapper userMapper;

	public User findByEmail(String email) {
		return userRepository.findByEmail(email).orElse(null);
	}

	@Transactional()
	public UserResponseDto createUser(UserDto userDto) throws RuntimeException {
		if (findByEmail(userDto.getEmail()) == null) {
			User user = userFactory.createUser(userDto);
			User createdUser = userRepository.save(user);
			UserResponseDto userResponse = userMapper.convertToUserResponseDto(createdUser);
			return userResponse;
		} else {
			throw new ServiceRuntimeException(HttpStatus.BAD_REQUEST, ErrorCodes.USER_E001,
					"Email has already been taken");
		}
	}

}
