package com.example.Registration.service;

import com.example.Registration.dto.UserDto;
import com.example.Registration.entity.User;

import java.util.List;
import java.util.Optional;

public interface UserService {

    void saveUser(UserDto userDto);

    Optional<User> findById(Long id);

    User findByEmail(String email);

    List<UserDto> findAllUsers();

    void deleteById(Long id);
}
