package lab1;

import javax.swing.JOptionPane;

/**
 * Describe responsibilities here.
 *
 * @author      your name goes here
 * @version     1.00
 */
public class AdvancedJavaCourse extends Course {

    private String prerequisites;

    public AdvancedJavaCourse(String courseName, int courseNumber, int Credits, String prerequisites) {
        super(courseNumber, courseName, Credits);
        this.getCourseName();
        this.getCourseNumber();
        this.getCredits();
        this.prerequisites = prerequisites;
    }

    public String getCapitalizedCourseName() {
        return this.courseName.toUpperCase();
    }


    public String getPrerequisites() {
        return prerequisites;
    }

    public void setPrerequisites(String prerequisites) {
        if(prerequisites == null || prerequisites.length() == 0) {
            JOptionPane.showMessageDialog(null,
                    "Error: prerequisites cannot be null of empty string");
            System.exit(0);
        }
        this.prerequisites = prerequisites;
    }
    
    
}