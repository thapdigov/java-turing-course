package az.edu.turing.instagramjdbc.config;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public abstract class AbstractDao {

    public static Connection connect() throws SQLException {
        return DriverManager.getConnection("jdbc:postgresql://localhost:5432/instagram", "postgres", "Behruz1978");
    }
}
