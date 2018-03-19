package com.example.backend;

import org.springframework.web.bind.annotation.*;

import java.sql.*;

@RestController
public class managerControler {

    @GetMapping("/manager_login")
    public static boolean manager_login(String username, String password) throws SQLException {
        Connection conn = JDBCConnection.getDatabase();
        PreparedStatement preparedStatement = conn.prepareStatement("Select * from manager");
        boolean p;
        ResultSet resultSet = preparedStatement.executeQuery();
        if (username.equals(resultSet.getString("username")) && password.equals(resultSet.getString("Password"))){
            p = true;
        }else{
            p = false;
        }
        preparedStatement.close();
        return p;

    }

    @GetMapping("/food_input")
    public static void food_input(String item_name, String item_description, Double price){
        try{
            Connection conn = JDBCConnection.getDatabase();
            PreparedStatement preparedStatement = conn.prepareStatement("Insert Into food_items (item_name, item_description, item_price) " +
                    "Values(?, ?, ?");
            preparedStatement.setString(1, item_name);
            preparedStatement.setString(2, item_description);
            preparedStatement.setDouble(3, price);
            preparedStatement.execute();
            preparedStatement.close();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}
