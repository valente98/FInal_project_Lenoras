package com.example.backend;

import java.sql.*;
public class JDBCConnection {
    public static Connection getDatabase() throws SQLException {
        return DriverManager.getConnection("jdbc:postgresql:Lenoras_DB", "basecamp", "localpassword");

    }
}


