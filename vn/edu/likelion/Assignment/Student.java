package vn.edu.likelion.Assignment;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;

public class Student {
    private int STT;
    private String StudentID;
    private String StudentName;
    private int Age;
    private String DateJoined;
    private String CourseName; // can use to compare and link 2 list ?
    ArrayList<Student> students;

    //Constructor
    public Student() {
    }
    public Student(ArrayList<Student> students) {
        this.students =students;
    }
    public Student(int STT, String ID, String name, int age, String dateJoined, String courseName ) {
        this.STT = STT;
        this.StudentID = ID;
        this.StudentName = name;
        this.Age = age;
        this.DateJoined= dateJoined;
        this.CourseName = courseName;
    }

    //@function view all student
    public void getStudent (){
        for(var student: students){
            System.out.print(student.getSTT() + "\t \t");
            System.out.print(student.getStudentID() + "\t \t");
            System.out.print(student.getStudentName() + "\t \t");
            System.out.print(student.getAge() + "\t \t");
            System.out.print(student.getDateJoined() + "\t \t");
            System.out.println(student.getCourseName() + "\t \t");
        }
    }
    //@function add student
    public void addStudent(Student student){
        student.setSTT(students.size());
        students.add(student.getSTT(),student);
    }
    //@function update student
    public void updateStudent(Student student){
        for( var item: students){
            if(student.getSTT() == item.getSTT()){
                student.setStudentID(item.getStudentID());
                student.setDateJoined(item.getDateJoined());
            }
        }
        students.set(student.getSTT(), student );
    }
    //@function delete student
    public void deleteStudent( int STT){
        students.remove(STT);
    }
    //Getter Setter section.

    public String getCourseName() {
        return CourseName;
    }

    public void setCourseName(String courseName) {
        CourseName = courseName;
    }

    public String getDateJoined() {
        return DateJoined;
    }

    public void setDateJoined(String dateJoined) {
        DateJoined = dateJoined;
    }

    public int getAge() {
        return Age;
    }

    public void setAge(int age) {
        Age = age;
    }

    public String getStudentName() {
        return StudentName;
    }

    public void setStudentName(String studentName) {
        StudentName = studentName;
    }

    public String getStudentID() {
        return StudentID;
    }

    public void setStudentID(String studentID) {
        StudentID = studentID;
    }

    public int getSTT() {
        return STT;
    }

    public void setSTT(int STT) {
        this.STT = STT;
    }
}
