package com.mjcuenca.arquitectura.util;

import java.sql.Connection;

public class TestConnection {
    public static void main(String[] args) {
        try (Connection conn = DatabaseConnection.getConnection()) {
            if (conn != null) {
                System.out.println("Conexión exitosa!");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}