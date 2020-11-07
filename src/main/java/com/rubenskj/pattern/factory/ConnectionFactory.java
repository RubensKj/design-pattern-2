package com.rubenskj.pattern.factory;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {

    public Connection getConnection() {
        try {
            String url = new DatabaseFactory().getUrl();

            Connection connection = DriverManager.getConnection(url, "root", "123");

            return connection;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
