package View;

import javax.swing.JOptionPane;

import Controller.StudentController;
import Model.Student;

public class test {
    public static void main(String[] args) {
        Student s1 = new Student( );
        StudentController sc  = new StudentController();
        int result = sc.insertdetails(s1);
        if(result>0){
            JOptionPane.showMessageDialog(null, "Registered Successfully");
        }else{
            
            JOptionPane.showMessageDialog(null, "Registered insSuccessfully");
        }
    }
}
