/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sorted_billing;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
public class ConnectionClass {
    private static ConnectionClass single_instance = null;
    public Connection connection;

    ConnectionClass() throws SQLException {
        try {
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/sorted_billing", "root", "");
            if (connection != null) {
                System.out.println("connected");

                String statement = "CREATE TABLE IF NOT EXISTS signUp(id INT NOT NULL AUTO_INCREMENT, "
                        + "fname VARCHAR(255),"
                        + "lname VARCHAR(255),"
                        + "phoneno VARCHAR (255), "
                        + "email VARCHAR(255), "
                        + "pass VARCHAR(255), "
                        + "gender VARCHAR(255),"
                        + "PRIMARY KEY (id))";
                
                PreparedStatement preparedStatement = connection.prepareStatement(statement);
                preparedStatement.execute();
                
                if (connection != null) {
                System.out.println("connected");

                String statement2 = "CREATE TABLE IF NOT EXISTS signUpemp(id INT NOT NULL AUTO_INCREMENT, "
                        + "fname VARCHAR(255),"
                        + "lname VARCHAR(255),"
                        + "phoneno VARCHAR (255),"
                        + "email VARCHAR(255),"
                        + "storeid VARCHAR(255),"
                        + "pass VARCHAR(255), "
                        + "salary VARCHAR(255),"
                        + "gender VARCHAR(255),"
                        + "PRIMARY KEY (id))";
                
                 PreparedStatement preparedStatement2 = connection.prepareStatement(statement2);
                preparedStatement2.execute();
                 if (connection != null) {
                System.out.println("connected");

                String statement3 = "CREATE TABLE IF NOT EXISTS store(id INT NOT NULL AUTO_INCREMENT, "
                        + "store name VARCHAR(255),"
                        + "storetype VARCHAR(255),"
                        + "PRIMARY KEY (id))";
                
                 PreparedStatement preparedStatement3 = connection.prepareStatement(statement3);
                preparedStatement2.execute();
                if (connection != null) {
                System.out.println("connected");

                String statement4 = "CREATE TABLE IF NOT EXISTS inventory(id INT NOT NULL AUTO_INCREMENT, "
                        + "Catagory VARCHAR(255),"
                        + "item VARCHAR(255),"
                        + "Qty VARCHAR(255),"
                        + "price VARCHAR(255),"
                        + "PRIMARY KEY (id))";
            PreparedStatement preparedStatement4 = connection.prepareStatement(statement4);
                preparedStatement4.execute();

                }}}}} catch (SQLException ex) {
            Logger.getLogger(ConnectionClass.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public static ConnectionClass getInstance() throws SQLException {
        if (single_instance == null) {
            single_instance = new ConnectionClass();
        }
        return single_instance;
    }
}

