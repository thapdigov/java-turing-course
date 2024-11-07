package az.edu.turing.instagramjdbc.dao.inter;

import az.edu.turing.instagramjdbc.entity.User;

import java.util.List;

public interface UserDaoInterface {

    void insert(User user);

    void update(User user);

    void delete(int id);

    User getUserById(int id);

    List<User> getAllUsers();


}
