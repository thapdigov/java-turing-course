package az.edu.turing.instagramjdbc.dao.impl;

import az.edu.turing.instagramjdbc.config.AbstractDao;
import az.edu.turing.instagramjdbc.dao.inter.UserDaoInterface;
import az.edu.turing.instagramjdbc.entity.User;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class UserDaoImpl extends AbstractDao implements UserDaoInterface {
    @Override
    public void insert(User user) {
        try (Connection connection = connect()) {
            PreparedStatement prepareStatement = connection.prepareStatement("insert into users (name,password,gender,email) values(?,?,?,?)");
            prepareStatement.setString(1, user.getUserName());
            prepareStatement.setString(2, user.getUserPassword());
            prepareStatement.setString(3, user.getUserGender());
            prepareStatement.setString(4, user.getUserEmail());
            int i = prepareStatement.executeUpdate();
            System.out.println(i + "row add!");


        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void update(User user) {
        try (Connection connection = connect()) {
            PreparedStatement prepareStatement = connection.prepareStatement("update users set name=?,password=? where id=?");
            prepareStatement.setString(1, user.getUserName());
            prepareStatement.setString(2, user.getUserPassword());
            prepareStatement.setInt(3, user.getUserId());
            int i = prepareStatement.executeUpdate();
            System.out.println(i + " row updated succesfuly!");


        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void delete(int id) {
        try (Connection connection = connect()) {
            PreparedStatement prepareStatement = connection.prepareStatement("delete from users where id=?");
            prepareStatement.setInt(1, id);
            int i = prepareStatement.executeUpdate();
            System.out.println(i + " row deleted succesfuly!");


        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public User getUserById(int id) {

        User user = null;
        try (Connection connection = connect()) {
            PreparedStatement prepareStatement = connection.prepareStatement("select  * from users where id=" + id);
            ResultSet rs = prepareStatement.executeQuery();
            while (rs.next()) {
                user = getUser(rs);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        return user;
    }

    @Override
    public List<User> getAllUsers() {

        List<User> userList = new ArrayList<>();
        try (Connection connection = connect()) {
            PreparedStatement prepareStatement = connection.prepareStatement("select  * from users");
            ResultSet rs = prepareStatement.executeQuery();
            while (rs.next()) {
                userList.add(getUser(rs));
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        return userList;
    }

    public User getUser(ResultSet rs) throws SQLException {
        int userId = rs.getInt("id");
        String userName = rs.getString("name");
        String userPassword = rs.getString("password");
        String userGender = rs.getString("gender");
        String userEmail = rs.getString("email");
        String userCategory = rs.getString("category");
        String userBio = rs.getString("bio");
        Integer userFollower = rs.getInt("followers");
        Integer userFollowing = rs.getInt("followers");
        Integer userPostCount = rs.getInt("post_count");
        return new User(userId, userName, userPassword, userGender, userEmail,
                userCategory, userBio, userFollower, userFollowing, userPostCount);
    }
}
