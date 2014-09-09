package lab1;

/**
 * Describe responsibilities here.
 *
 * @author      your name goes here
 * @version     1.00
 */
public class IntroJavaCourse extends Course {
  
    private String prerequisites;

    public IntroJavaCourse(String courseName, int courseNumber, int Credits, String prerequisites) {
        super(courseNumber, courseName, Credits);
        this.getCourseName();
        this.getCourseNumber();
        this.getCredits();
        this.prerequisites = prerequisites;
    }
    

    public String getPrerequisites() {
        return prerequisites;
    }

    public void setPrerequisites(String prerequisites) {
        this.prerequisites = prerequisites;
    }

}
