package az.edu.turing.instagramjdbc;

import az.edu.turing.instagramjdbc.controller.UserController;
import az.edu.turing.instagramjdbc.dao.impl.UserDaoImpl;
import az.edu.turing.instagramjdbc.service.UserServiceImpl;

public class InstagramApp {
    public static void main(String[] args) {

        UserDaoImpl userDao = new UserDaoImpl();
        UserServiceImpl userService = new UserServiceImpl(userDao);
        UserController userController = new UserController(userService);

        System.out.println(userController.getAllUserDtoList());

    }
}
