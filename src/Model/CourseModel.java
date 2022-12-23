/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author nwjsh
 */
public class CourseModel {
    private String Course_Name;
    private int Course_Code;
    private int Course_Duration;
    private String Course_Description;
    
    public void setCourse_Name(String Course_Name){
        this.Course_Name = Course_Name;
        
    }
    
    
    public String getCourse_Name(){
        return this.Course_Name= Course_Name;
    }
    
    
    public void setCourse_Codee(int Course_Codee){
        this.Course_Code = Course_Codee;
        
    }
    
    public int getCourse_Code(){
        return this.Course_Code= Course_Code;
    }
    
    public void setCourse_Duration(int Course_Duration){
        this.Course_Duration = Course_Duration;
        
    }
    
    public int getCourse_Duration(){
        return this.Course_Duration= Course_Duration;
    }
    
    public void setCourse_Description(String Course_Description){
        this.Course_Description = Course_Description;
        
    }
    
    public String getCourse_Description(){
        return this.Course_Description= Course_Description;
    }
    
    public CourseModel(String Course_Name,int Course_Code, int Course_Duration, String Course_Description){
        this.Course_Name = Course_Name;
        this.Course_Code = Course_Code;
        this.Course_Duration = Course_Duration;
        this.Course_Description =  Course_Description;
    
    }
             
}
