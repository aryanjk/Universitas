/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package database;
import java.sql.*;


public class DbConnection {
    public Connection con;
            
    public static void main(String[] args){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://sql6.freesqldatabase.com:3306/sql6580070","sql6580070","6VVrAkhI5w");
            
            if(con!=null){
                System.out.println("Successfully connected");
            }
            
        }catch(Exception e){
            System.out.println(e);
            System.out.println("Not connected");
            
        }
    }
    
    
    
}