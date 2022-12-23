package me.whiteship.designpatterns._02_structural_patterns._07_bridge._03_java;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcExample {
    public static void main(String[] args) throws ClassNotFoundException {
        Class.forName("org.h2.Driver");

        try (Connection connection = DriverManager.getConnection("jdbc:h2:mem:~/test", "sa", "")) {
            String sql =  "CREATE TABLE  ACCOUNT " +
                    "(id INTEGER not NULL, " +
                    " email VARCHAR(255), " +
                    " password VARCHAR(255), " +
                    " PRIMARY KEY ( id ))";

            Statement statement = connection.createStatement();
            statement.execute(sql);

        } catch (SQLException e) {
            throw new RuntimeException();
        }
    }
}
