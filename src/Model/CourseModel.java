/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 *
 * @author nwjsh
 */
public class CourseModel {

    public CourseModel(JTextField Course_Name1, JTextField Course_Code1, JTextField Course_Duration1, JTextArea Course_Description1) {
    }
    private static String Course_Name;
    private static String Course_Code;
    private static String Course_Duration;
    private static String Course_Description;

    public static String getCourse_Name() {
        return Course_Name;
    }
    public static String getCourse_Code() {
        return Course_Code;
    }
    public static String getCourse_Duration() {
        return Course_Duration;
    }
    public static String getCourse_Description() {
        return Course_Description;
    }
    public void setCourse_Name(String course_Name) {
        this.Course_Name = course_Name;
    }
    public void setCourse_Code(String course_Code) {
        this.Course_Code = course_Code;
    }
    public void setCourse_Duration(String course_Duration) {
        this.Course_Duration = course_Duration;
    }
    public void setCourse_Description(String course_Description) {
        this.Course_Description = course_Description;
    }
    public CourseModel(String course_Name, String course_Code, String course_Duration, String course_Description) {
        this.Course_Name = course_Name;
        this.Course_Code = course_Code;
        this.Course_Duration = course_Duration;
        this.Course_Description = course_Description;
    }

    

    

    



   
    
}
