/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;
import Database.db;
import Model.CourseModel;
/**
 *
 * @author nwjsh
 */
public class CourseController {
    db db;
    public int insertDetails(CourseModel user){
    String Course_Name = user.getCourse_Name();
    String Course_Code = user.getCourse_Code();
    String Course_Duration = user.getCourse_Duration();
    String Course_Description = user.getCourse_Description();
    
    String insertQuery = "insert into add_course(Course_Name,Course_Code,Course_Duration,Course_Description)" + "values('"+Course_Name+"','"+Course_Code+"','"+Course_Duration+"','"+Course_Description+"')";  
    db = new db();
    int result = db.manipulate(insertQuery);
    return result;
     }

         
}
