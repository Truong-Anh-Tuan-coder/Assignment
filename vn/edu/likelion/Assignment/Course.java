package vn.edu.likelion.Assignment;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane;
import java.io.Console;
import java.util.ArrayList;

public class Course {
    //Course Fields
    public int STT;
    public String CourseID;
    public String CourseName;
    public int numberStudentInCourse;
    public String CourseStatus;
    ArrayList<Student> students;
    ArrayList<Course> Courses;

    public Course() {

    }
    // this constructor is not going use due to it make code more harder and longer.
    public Course(int STT, String CourseID, String CourseName
            , int numberStudentInCourse, String CourseStatus) {
        this.STT = STT;
        this.CourseID = CourseID;
        this.CourseName = CourseName;
        this.numberStudentInCourse = numberStudentInCourse;
        this.CourseStatus = CourseStatus;
    }
    public Course(ArrayList<Course>  Courses, ArrayList<Student> students) {
        this.Courses = Courses;
        this.students = students;
    }

    //@function: send list of courses.
    public void getCourses(){
        System.out.print("STT \t\t");
        System.out.print("CourseID\t\t");
        System.out.print("Course Name\t\t");
        System.out.print("Total Student\t\t");
        System.out.println("Status\t\t");
        for(Course c : Courses){
            System.out.print(c.getSTT()+ "\t\t");
            System.out.print(c.getCourseID()+ "\t\t\t");
            System.out.print(c.getCourseName()+ "\t\t\t");
            System.out.print(c.getNumberStudentInCourse()+ "\t\t");
            System.out.println(c.CourseStatus+ "\t\t");
        }
    }
    //@function: send list of courses detail
    public void getCourseDetail(int STT){
        Course course = new Course();
        String courseName;
        Boolean check = false;
        try {
            courseName = Courses.get(STT).getCourseName(); // this is where arraylist is extremely painful.
            System.out.print("CourseID\t\t");
            System.out.print("Course Name\t\t");
            System.out.println("Students\t\t");
            for(Course c : Courses){
                for(Student s : students){
                    if(s.getCourseName() == c.getCourseName() && c.getSTT() == STT){
                        System.out.print(c.getCourseID()+ "\t\t");
                        System.out.print(c.getCourseName()+"\t\t");
                        System.out.println(s.getStudentName()+ "\t\t");
                    }else if(s.getCourseName() != c.getCourseName() && c.getSTT() == STT ){
                        if(s.getCourseName().isEmpty()){


                        course.setCourseID(c.getCourseID());
                        course.setCourseName(c.getCourseName());
                        check = true;
                        }
                    }
                }
            }
            if(check){
                System.out.print(course.CourseID + "\t\t");
                System.out.print(course.CourseName+"\t\t");

                System.out.println("No student added");
                check = false;
            }
        }catch(IndexOutOfBoundsException e){
            System.err.println("Not found any course at STT: " +STT);
        }


//        for(int course = 0; course < Courses.size() ; course++){
//            if(Courses.get(course).getSTT() == STT){
//                for(int student = 0; student < students.size() ; student++ ){
//                    if(Courses.get(course).getCourseName() == students.get(student).getCourseName()){
//                    System.out.print(Courses.get(course).getSTT()+ "\t\t");
//                    System.out.print(Courses.get(course).getCourseName()+"\t\t");
//                    System.out.println(students.get(student).getStudentName()+ "\t\t");
//                }
//            }
//            }
//        }

    }
    // Getter Setter section.
    public void addCourse(Course course){
        course.setSTT(Courses.size());
        Courses.add(course);
    }
    public void updateCourse(Course course){
        for(var item: Courses){
            if(item.getSTT() == course.getSTT()){
                course.setCourseID(item.getCourseID());
            }
        }
        Courses.set(course.getSTT(),course);
    }
    public void deleteCourse(int STT){
        Courses.remove(STT);
    }
    public int getSTT() {
        return STT;
    }

    public void setSTT(int STT) {
        this.STT = STT;
    }

    public String getCourseID() {
        return CourseID;
    }

    public void setCourseID(String courseID) {
        CourseID = courseID;
    }

    public String getCourseName() {
        return CourseName;
    }

    public void setCourseName(String courseName) {
        CourseName = courseName;
    }

    public ArrayList<Student> getStudents() {
        return students;
    }

    public void setStudents(ArrayList<Student> students) {
        this.students = students;
    }
    public int getNumberStudentInCourse() {
        return this.numberStudentInCourse;
    }
    public void setNumberStudentInCourse(int numberStudentInCourse) {
        this.numberStudentInCourse = numberStudentInCourse;
    }


}
