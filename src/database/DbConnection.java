package database;

import javax.swing.*;

import java.sql.*;

public class DbConnection {

    Connection connection;

    Statement statement;

    ResultSet resultSet;

    int value;
 public static Connection connectdb(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
          Connection   con=DriverManager.getConnection("jdbc:mysql://db4free.net:3306/universitas","universitas","30dc48eb");
            
            if(con!=null){
                System.out.println("Successfully connected");
            }
            
        }catch(Exception e){
            System.out.println(e);
            System.out.println("Not connected");
            
        }
        return null;
    }
    public DbConnection() {

        try {

            String username = "universitas";

            String password = "30dc48eb";

            Class.forName("com.mysql.cj.jdbc.Driver");

            connection = DriverManager.getConnection(

                    "jdbc:mysql://sql6.freesqldatabase.com:3306/universitas", username, password);

            if (connection != null) {

                System.out.println("Connected to database --> universitas");

            } else {

                System.out.println("Error connecting to database");

            }

            statement = connection.createStatement();

        } catch (Exception e) {

            e.printStackTrace();

        }

    }

    // Via the use of sql query

    // insert, update and delete

    public int manipulate(String query) {

        try {

            value = statement.executeUpdate(query);

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

            resultSet = statement.executeQuery(query);

        } catch (SQLException e) {

            e.printStackTrace();

        }

        return resultSet;

    }

    public static void main(String[] args) {

        DbConnection.connectdb();

    }

}