/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.SQLIntegrityConstraintViolationException;
import javax.swing.JOptionPane;

/**
 *
 * @author nwjsh
 */
public class DbConnection {

    public Connection connection;

    PreparedStatement pst;

    ResultSet resultSet;

    int value;

    public DbConnection() {

        try {

            String username = "universitas";

            String password = "30dc48eb";

            Class.forName("com.mysql.cj.jdbc.Driver");

            connection = DriverManager.getConnection(

                    "jdbc:mysql://db4free.net :3306/universitas", username, password);

            if (connection != null) {

                System.out.println("Connected to database");

            } else {

                System.out.println("Error connecting to database");

            }

            pst = connection.prepareStatement("select * from user where username=? and password=?");

        } catch (Exception e) {

            e.printStackTrace();

        }

    }

    // Via the use of sql query

    // insert, update and delete

    public int manipulate(String query) {

        try {

            value = pst.executeUpdate(query);

            connection.close();

        } catch (SQLIntegrityConstraintViolationException ex) {

            JOptionPane.showMessageDialog(null, "These details already exist!");

        } catch (SQLException e) {

            e.printStackTrace();

        }

        return value;

    }

    public ResultSet retrieve(String query) {

        try {

            resultSet = pst.executeQuery(query);

        } catch (SQLException e) {

            e.printStackTrace();

        }

        return resultSet;

    }

    public Boolean checkLogin(String uname, String pwd) {
        try {

            pst.setString(1, uname); // this replaces the 1st "?" in the query for username
            pst.setString(2, pwd); // this replaces the 2st "?" in the query for password
            // executes the prepared statement
            resultSet = pst.executeQuery();
            if (resultSet.next()) {
                System.out.print("Success");
                // TRUE if the query founds any corresponding data
                return true;
            } else {
                System.out.print("Failed");

                return false;
            }
        } catch (Exception e) {
            // TODO Auto-generated catch block
            System.out.println("error while validating" + e);
            return false;
        }
    }

    public static void main(String[] args) {

        new DbConnection();

    }

}
