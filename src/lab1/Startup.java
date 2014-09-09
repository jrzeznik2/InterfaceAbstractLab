/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package lab1;

/**
 *
 * @author Jacob
 */
public class Startup {
    public static void main(String[] args) {
         
        //this architecture is good in that it creates abstraction
        //and inheritance for the methods/properties that all the classes
        //have in common to eliminate copy/pasting as well as mitigate mistakes
        //in writing and re-writing the code
        
        //the negative of this architecture is that there aren't enough
        //properties/methods to make this efficient for inheritance.
        //Prerequisties are shared in the Java classes, it'd be better to have
        //a Java class and have Advanced and IntroTo inherit, but those 
        //subclasses would have to be empty because there are no other
        //properties
        
        Course course1 = new AdvancedJavaCourse("Advanced Java", 111111, 4, "Intro to Java");
        Course course2 = new IntroJavaCourse("Intro to Java", 111112, 4, "Intro to Programming");
        Course course3 = new IntroToProgrammingCourse("Intro to Programming", 111113, 3);
        
        //The Liskov Substitution Principle is useful depending on the situation
        //if all of the constructors of the inheriting classes are the same,
        //you can just have a constructor in the abstract class and use this
        //and this would call for that principle but if the constructors are
        //different, I don't think it'd be as useful to use.
                
        System.out.println("CourseName: " + course1.getCourseName() 
                + ", CourseNumber: " + course1.getCourseNumber() 
                + ", Credits: " + course1.getCredits());
        
        System.out.println("CourseName: " + course2.getCourseName() 
                + ", CourseNumber: " + course2.getCourseNumber() 
                + ", Credits: " + course2.getCredits());
        
        System.out.println("CourseName: " + course3.getCourseName() 
                + ", CourseNumber: " + course3.getCourseNumber() 
                + ", Credits: " + course3.getCredits());
        
     }
}
