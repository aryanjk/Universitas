package Controller;

import Database.DbConnection;
import Model.Student;

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
}