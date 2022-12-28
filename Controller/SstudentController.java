package Controller;


import java.sql.*;
import java.sql.SQLException;

import Database.DbConnection;
import Model.std;

public class SstudentController {
   
    DbConnection db = new DbConnection();
    Connection con=DbConnection.getconnection();
    PreparedStatement st;

    public int insertdetails(std student) {
        String fname=student.getF_name();
        String lname=student.getL_name();
        String email=student.getEmail();
        int std_contact=student.getStd_contact();
        String parent_name=student.getParents_name();
        String parent_c=student.getParent_contact();
        String pass=student.getPassword();
        String dob=student.getDob();
        String sq=student.getSecurity_qn();
        String sans=student.getSecurity_ans();
        try{
            String query = "insert into student values('"+fname+"','"+lname+"','"+email+"','"+std_contact+"','"+parent_name+"','"+parent_c+"','"+pass+"','"+dob+"','"+sq+"','"+sans+"')";
            
            st=con.prepareStatement(query);

        st.executeUpdate();
        
    }catch(SQLException e){
            e.printStackTrace();
           
        }  
        return 0;
    }
        // public ResultSet login(std student) {
        //     String email = student.getEmail();
        //     String pass = student.getPassword();
        //     String selectQuery = "select * from students where email='" + email + "' and password='" + pass + "'";
        //     DbConnection = new dbConnection();
        //     ResultSet result = DbConnection.retrieve(selectQuery);
        //     return result;
        }