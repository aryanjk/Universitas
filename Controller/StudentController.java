package Controller;

import Database.DbConnection;

import Model.*;

import java.sql.ResultSet;

public class StudentController {
    DbConnection dbConnection;

    public int insertdetails(Student student) {
        String fname = student.getF_name();
        String lname = student.getL_name();
        String email = student.getEmail();
        String contact = student.getParent_contact();
        String parents_name = student.getParents_name();
        String parents_contact = student.getParent_contact();
        String pass = student.getPassword();
        String dob = student.getDob();
        String security_qn = student.getSecurity_qn();
        String security_ans = student.getSecurity_ans();

        String insertQuery = "insert into students(f_name,l_name,email,std_contact,parents_name,parent_contact,password,dob,security_qn,security_ans)"
                + "values('" + fname + "','" + lname + "','" + email + "','" + contact + "','" + parents_name + "','"
                + parents_contact + "','" + pass + "','" + dob + "','" + security_qn + "','" + security_ans + "')";
        dbConnection = new DbConnection();
        int result = dbConnection.manipulate(insertQuery);
        return result;
    }

    public ResultSet login(Student student) {
        String email = student.getEmail();
        String pass = student.getPassword();
        String selectQuery = "select * from student where email='" + email + "' and password='" + pass + "'";
        dbConnection = new DbConnection();
        ResultSet result = dbConnection.retrieve(selectQuery);
        return result;
    }

    public int changeStatus(Student student) {
        String updateQuery = "update student set status='" + "inactive" + "' where status='" + "active" + "'";
        dbConnection = new DbConnection();
        int result = dbConnection.manipulate(updateQuery);
        return result;

    }

    public int updateStatus(Student student) {
        String email = student.getEmail();
        String updateQuery = "update student set status='" + "active" + "' where email='" + email + "'";
        dbConnection = new DbConnection();
        int result = dbConnection.manipulate(updateQuery);
        return result;

    }
}