package az.edu.turing.instagramjdbc.service;

import az.edu.turing.instagramjdbc.dao.impl.UserDaoImpl;
import az.edu.turing.instagramjdbc.dto.UserDto;
import az.edu.turing.instagramjdbc.entity.User;

import java.util.ArrayList;
import java.util.List;

public class UserServiceImpl implements UserServiceInterface {

    private final UserDaoImpl userDao;

    public UserServiceImpl(UserDaoImpl userDao) {
        this.userDao = userDao;
    }

    @Override
    public void insert(UserDto userDto) {
        User user = convertEntity(userDto);
        userDao.insert(user);


    }

    @Override
    public void update(UserDto userDto) {
        User user = convertEntity(userDto);
        userDao.update(user);
    }

    @Override
    public void delete(int id) {
        userDao.delete(id);

    }

    @Override
    public UserDto getUserDtoById(int id) {
       return convertDto(userDao.getUserById(id));
    }

    @Override
    public List<UserDto> getAllUsers() {
        List<User> userList = userDao.getAllUsers();
        List<UserDto> userDtoList = new ArrayList<>();
        for (User user : userList) {
            userDtoList.add(convertDto(user));
        }
        return userDtoList;
    }

    public User convertEntity(UserDto userDto) {
        User user = new User();
        user.setUserId(userDto.getUserId());
        user.setUserName(userDto.getUserName());
        user.setUserBio(userDto.getUserBio());
        user.setUserFollower(userDto.getUserFollower());
        user.setUserFollowing(userDto.getUserFollower());
        user.setUserPostCount(userDto.getUserPostCount());
        return user;
    }

    public UserDto convertDto(User user) {
        UserDto userDto = new UserDto();
        if (user != null) {
            userDto.setUserId(user.getUserId());
            userDto.setUserName(user.getUserName());
            userDto.setUserBio(user.getUserBio());
            userDto.setUserFollower(user.getUserFollower());
            userDto.setUserFollowing(user.getUserFollower());
            userDto.setUserPostCount(user.getUserPostCount());
        } else {
            System.out.println("User not found!");
        }
        return userDto;
    }
}