package az.edu.turing.instagramjdbc;

import az.edu.turing.instagramjdbc.config.AbstractDao;
import az.edu.turing.instagramjdbc.entity.User;

import java.util.List;

public class InstagramApp {
    public static void main(String[] args) {

        User user = new User(3,"davud", "6336");



       List<User> userList= AbstractDao.getUserDao().getAllUsers();
        System.out.println(userList);

    }
}
