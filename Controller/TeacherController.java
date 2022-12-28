package Controller;

import Database.DbConnection;

import java.sql.ResultSet;

import Model.Teacher;
import view.teacher;

public class TeacherController {
    DbConnection dbConnection;

    public int insertdetails(teacher Teacher) {
        String fistname = Teacher.getFistname();
        String lastname = Teacher.getLastname();
        String contact = Teacher.getContact();
        String subject = Teacher.getSubject();
        

        String insertQuery = "insert into Teacher(fistname,lastname,contact,subject)"
                + "values('" + fistname + "','" + lastname + "','" + contact + "','" + subject + "')";
        dbConnection = new DbConnection();
        int result = dbConnection.manipulate(insertQuery);
        return result;
    }

    // public ResultSet login(teacher Teacher) {
    //     String fistname = Teacher.getFistname();
    //     String lastname = Teacher.getLastname();
    //     String selectQuery = "select * from Teacher where fistname='" + fistname + "' and lastname='" + lastname + "'";
    //     dbConnection = new DbConnection();
    //     ResultSet result = dbConnection.retrieve(selectQuery);
    //     return result;
    // }

    // public int changeStatus(Teacher Teacher) {
    //     String updateQuery = "update Teacher set status='" + "inactive" + "' where status='" + "active" + "'";
    //     dbConnection = new DbConnection();
    //     int result = dbConnection.manipulate(updateQuery);
    //     return result;

    // }

    // public int updateStatus(teacher Teacher) {
    //     String email = Teacher.getEmail();
    //     String updateQuery = "update Teacher set status='" + "active" + "' where email='" + email + "'";
    //     dbConnection = new DbConnection();
    //     int result = dbConnection.manipulate(updateQuery);
    //     return result;

    // }
}