package com.mjcuenca.arquitectura.config;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {

    private static final String URL =
        "jdbc:mysql://localhost:3306/arquitectura?useSSL=false&serverTimezone=UTC";
    private static final String USER = "mjcuenca";
    private static final String PASSWORD = "clave123";

    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(URL, USER, PASSWORD);
    }
}
