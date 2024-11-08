package az.edu.turing.instagramjdbc.service;

import az.edu.turing.instagramjdbc.dto.UserDto;

import java.util.List;

public interface UserServiceInterface {
    void insert(UserDto user);

    void update(UserDto user);

    void delete(int id);

    UserDto getUserDtoById(int id);

    List<UserDto> getAllUsers();
}
