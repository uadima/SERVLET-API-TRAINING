package com.epam.yevheniy.chornenky.market.place.db;

import com.epam.yevheniy.chornenky.market.place.exceptions.DatabaseException;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {

    private ConnectionFactory() {
    }

    public static Connection getConnection()  {
        // Initialize all the information regarding
        // Database Connection
        String dbDriver = "com.mysql.jdbc.Driver";
        String dbURL = "jdbc:mysql:// localhost:3306/";
        // Database name to access
        String dbName = "market";
        String dbUsername = "root";
        String dbPassword = "12345678";

        try {
            Class<?> aClass = Class.forName(dbDriver);
            Connection con = DriverManager.getConnection(dbURL + dbName, dbUsername, dbPassword);
            return con;
        } catch (ClassNotFoundException | SQLException e) {
            throw new DatabaseException();
        }
    }
}
