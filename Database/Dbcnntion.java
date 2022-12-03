/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Database;
import java.sql.*;

/**
 *
 * @author ujjwalpariyar
 */
public class Dbcnntion {
    public Connection con;
            
    public static Connection connectdb(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://db4free.net:3306/universitas","universitas","Universitas121");
            
            if(con!=null){
                System.out.println("Successfully connected");
            }
            
        }catch(Exception e){
            System.out.println(e);
            System.out.println("Not connected");
            
        }
        return null;
    }
    public static void main(String[] args) {
        Dbcnntion.connectdb();
    }
    
    
    
}
