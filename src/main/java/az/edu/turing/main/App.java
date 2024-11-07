package az.edu.turing.main;

import java.sql.*;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        try {

            Connection conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/instagram", "postgres", "Behruz1978");
           /* Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery("select id,name from users");
          /*  while (rs.next()) {
                System.out.println(rs.getInt("ID") + "." + rs.getString("NAME"));
            }
//            Statement st = conn.createStatement();
//            ResultSet resultSet = st.executeQuery("select*from users");
//            while (resultSet.next()) {
//                int user_id=resultSet.getInt("id");
//                int*/
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }


    }
}
