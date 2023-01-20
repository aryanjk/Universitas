package controller;


import Model.*;
import database.DbConnection;

import java.sql.ResultSet;

public class StudentController {
    private DbConnection dbConnection;

    public int insertdetails(Student student) {
        String fname = student.getF_name();
        String lname = student.getL_name();
        String email = student.getEmail();
        String contact = student.getParent_contact();
        String parents_name = student.getParents_name();
        String parents_contact = student.getParent_contact();
        String pass = student.getPassword();
        String dob = student.getDob();
        String gender = student.getGender();
        String security_ans = student.getSecurity_ans();

        String insertQuery = "insert into students(f_name,l_name,email,std_contact,parents_name,parent_contact,password,dob,gender,security_ans)"
                + "values('" + fname + "','" + lname + "','" + email + "','" + contact + "','" + parents_name + "','"
                + parents_contact + "','" + pass + "','" + dob + "','" + gender + "','" + security_ans + "')";
        setDbConnection(new DbConnection());
        int result = getDbConnection().manipulate(insertQuery);
        return result;
    }

    public ResultSet login(Student student) {
        String email = student.getEmail();
        String pass = student.getPassword();
        String selectQuery = "select * from students where email='" + email + "' and password='" + pass + "'";
        setDbConnection(new DbConnection());
        ResultSet result = getDbConnection().retrieve(selectQuery);
        return result;
    }

    public int changeStatus(Student student) {
        String updateQuery = "update student set status='" + "inactive" + "' where status='" + "active" + "'";
        setDbConnection(new DbConnection());
        int result = getDbConnection().manipulate(updateQuery);
        return result;

    }
    public int delete(){
        String query = "delete from students where status='"+"active"+"'";
        dbConnection = new DbConnection();
        int result = dbConnection.manipulate(query);
        return result;
    }


    public int updateStatus(Student student) {
        String email = student.getEmail();
        String updateQuery = "update student set status='" + "active" + "' where email='" + email + "'";
        setDbConnection(new DbConnection());
        int result = getDbConnection().manipulate(updateQuery);
        return result;

    }

    /**
     * @return the dbConnection
     */
    public DbConnection getDbConnection() {
        return dbConnection;
    }

    /**
     * @param dbConnection the dbConnection to set
     */
    public void setDbConnection(DbConnection dbConnection) {
        this.dbConnection = dbConnection;
    }
}