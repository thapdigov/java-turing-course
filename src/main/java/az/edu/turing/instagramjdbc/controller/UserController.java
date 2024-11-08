package az.edu.turing.instagramjdbc.controller;

import az.edu.turing.instagramjdbc.dto.UserDto;
import az.edu.turing.instagramjdbc.service.UserServiceImpl;

import java.util.List;

public class UserController {
    private final UserServiceImpl userService;

    public UserController(UserServiceImpl userService) {
        this.userService = userService;
    }

    public void insert(UserDto userDto) {
        userService.insert(userDto);
    }

    public void update(UserDto userDto) {
        userService.update(userDto);
    }

    public void delete(int id) {
        userService.delete(id);
    }

    public UserDto getUserDto(int id) {
        return userService.getUserDtoById(id);
    }

    public List<UserDto> getAllUserDtoList() {
        return userService.getAllUsers();
    }
}
