package br.com.cicero.db.utils;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author cicero
 */
public class ConnectionUtils {

    private static Connection connection = null;

    public static Connection getConnection() throws SQLException {

        if (connection == null || connection.isClosed()) {
            String dbURL = "jdbc:mysql://localhost:3306/jdbc_test";

            Properties properties = new Properties();
            properties.put("user", "root");
            properties.put("password", "root");

            connection = DriverManager.getConnection(dbURL, properties);
        }

        return connection;
    }

}
