/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.SQLIntegrityConstraintViolationException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author nwjsh
 */
public class db {
    public Connection connection;
    Statement statement;
    ResultSet resultSet;
    int value;
    public static Connection getconnection() {
        try {          
            final String username = "root";
            final String password = "2002";
            Class.forName("com.mysql.cj.jdbc.Driver");
           Connection connection = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/universitas", username, password);         
            if (connection != null) {
                

                System.out.println("Connected to database --> Universitas Database");
                return connection;
                
              } else {

                System.out.println("Error connecting to database");

            }
            

            

        } catch (Exception e) {

            e.printStackTrace();

        }
        return null;
        

    }

    // Via the use of sql query

    // insert, update and delete

    public int manipulate(String query) {

        try {
            statement = connection.createStatement();

            value = statement.executeUpdate(query);

            connection.close();

        } catch (SQLIntegrityConstraintViolationException ex) {

            JOptionPane.showMessageDialog(null, "These details already exist!");

        } catch (SQLException e) {

            e.printStackTrace();

        }

        return value;

    }

    public ResultSet retrieve(PreparedStatement st){
        try {
            resultSet=st.executeQuery();
        }catch (SQLException e){
            e.printStackTrace();
        }
        return resultSet;
    }
    
    

    public static void main(String[] args) {

         DbConnection.getconnection();

    }

}

