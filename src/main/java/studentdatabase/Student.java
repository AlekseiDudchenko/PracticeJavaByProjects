package studentdatabase;

import constants.Constants;

import java.util.HashSet;
import java.util.Set;

public class Student {

    private String firstName;
    private String lastName;
    private int id;
    private String gradeYear;
    private Set<Course> courses = new HashSet<>();
    private static int number = 0;

    public Student(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
        id = ++number;
        gradeYear = Constants.FRESHMEN;
    }

    public void setGradeYear(String gradeYear){
        this.gradeYear = gradeYear;
    }

    public String getGradeYear(){
        return gradeYear;
    }

    public void addCourse(Course course){
        courses.add(course);
    }

    public int getTotalTuition(){
        int totalTuition = 0;
        for (Course cours: courses) {
         totalTuition += cours.getCost();
        }
        return totalTuition;
    }

    public Set<Course> getEnrolledCourses(){
        return courses;
    }

    public int getNumberOfEnrolledCourses(){
        return courses.size();
    }
}
