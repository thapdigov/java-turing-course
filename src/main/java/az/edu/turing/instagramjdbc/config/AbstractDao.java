package az.edu.turing.instagramjdbc.config;

import az.edu.turing.instagramjdbc.dao.impl.UserDaoImpl;
import az.edu.turing.instagramjdbc.dao.inter.UserDaoInterface;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class AbstractDao {


    public static UserDaoInterface getUserDao() {
        return new UserDaoImpl();
    }

    public static Connection connect() throws SQLException {
        return DriverManager.getConnection("jdbc:postgresql://localhost:5432/instagram", "postgres", "Behruz1978");
    }
}
