package database;
import java.sql.*;

/**
 *
 * @author ujjwalpariyar
 */
public class DbConnection{
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
        DbConnection.connectdb();
    }
    
    
    
}