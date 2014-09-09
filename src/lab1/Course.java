/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package lab1;

import javax.swing.JOptionPane;

/**
 *
 * @author Jacob
 */
public abstract class Course {
    
    private int courseNumber;
    protected String courseName;
    private int credits;
    
    public Course(int courseNumber, String courseName, int credits){
        this.courseName = courseName;
        this.courseNumber = courseNumber;
        this.credits = credits;
    }
    
    public void setCourseNumber(){
        this.courseNumber = courseNumber;
    }
    
    public int getCourseNumber(){
        return courseNumber;
    }
    
    public void setCourseName(){
        this.courseName = courseName;
    }
    
    public String getCourseName(){
        return courseName;
    }
    
    public int getCredits(){
        return credits;
    }
    
    public void setCredits(int credits) {
        if(credits < 0.5 || credits > 4.0) {
            JOptionPane.showMessageDialog(null,
                    "Error: credits must be in the range 0.5 to 4.0");
            System.exit(0);
        }
        this.credits = credits;
    }
    
}
