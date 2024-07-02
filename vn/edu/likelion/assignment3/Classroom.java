package vn.edu.likelion.assignment3;

import day12.People;

import java.security.PublicKey;
import java.util.ArrayList;
import java.util.Scanner;

public class Classroom {
    public int id;
    public String name;
    public String status;
    static Scanner scanner = new Scanner(System.in);

    static ArrayList<Student> students;
    static ArrayList<Teacher> teachers;
    static ArrayList<Classroom> classrooms;

    public Classroom(){

    }
    public Classroom(int id , String name, String status){
        this.id = id;
        this.name =  name;
        this.status = status;
    }
    public Classroom(ArrayList<Student> students, ArrayList<Teacher> teachers,  ArrayList<Classroom> classrooms){
        this.students = students;
        this.teachers = teachers;
        this.classrooms = classrooms ;
    }
    //getter id
    public void setId(int id){
        this.id= id;
    }
    public int getId(){
        return this.id;
    }
    // getter setter name
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return this.name;
    }
    public String getStatus(){
        return this.status;
    }

    public ArrayList<Student> getStudents(){
        return this.students;
    }
    public ArrayList<Teacher> getTeachers(){
        return this.teachers;
    }
    public ArrayList<Classroom> getCassrooms() {
        return this.classrooms;
    }
    static String getTeacherName(int id){
        for(var item : teachers){
            if(item.getId() == id){
                return item.getName();
            }
        }
        return "";
    }
    static public String getClassRoom(int id){
        for(var item: classrooms){
            if(item.getId() == id){
                return item.getName();
            }
        }
        return "";
    }
    public static void getClasses(){
        for( var item :  classrooms){
            System.out.println(item.toString() + "\tTeacher: "+ getTeacherName(item.getId()));
        }
    }
    public static void getStudentList(){
        for(var item: students) {
            System.out.println(item.toString());
        }
    }
    public String toString(){
        return "ClassroomID: " +getId() + "\tClassroom name: "+ getName() + "\tClassroom status: " + getStatus();
    }
    public String getNameTeacher(int id){
        for( var item: teachers){
            if (item.getId() == id){
                return item.getName();
            }
        }
        return "";
    }
    public static void updateStudent(int id){
        Student student = students.get(id);
        System.out.println(student.toString());
        System.out.print("input new name: ");
        student.setName(scanner.nextLine());

        System.out.print("input new dob: ");
        student.setName(scanner.nextLine());

        System.out.print("input new age: " );
        student.setName(scanner.nextLine());

        System.out.print("input new CCCD: ");
        student.setCCCD(scanner.nextLine()); ;
        students.set(id, student);
        Classroom.getStudentList();
    }
    public static void addStudent(){
        Student student = new Student();
        System.out.print("input name: ");
        student.setName(scanner.nextLine());

        System.out.print("input dob: ");
        student.setDob(scanner.nextLine());

        System.out.print("input age: " );
        student.setAge(scanner.nextInt());
        scanner.nextLine();

        System.out.print("input CCCD: ");
        student.setCCCD(scanner.nextLine()); ;
        student.setId(students.size()+1);
        student.setExcuse("");
        students.add(student);

        Classroom.getStudentList();
    }
    public static void assignToClass(){
        int classId = 0;
        Student student = new Student();
        getClasses();
        System.out.print("Input your class you want to join: ");
        classId = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Input you student ID: ");
        student = students.get(scanner.nextInt());
        student.setClassroomID(classId);
        students.set(student.getId()-1, student);
        getClassdetail(classId);
    }
    public static void getClassdetail(int id){
        System.out.println("Student in Class: " + getClassRoom(id));
        for( var item: students){
            if(item.getClassroomID() == id){
                System.out.println(item.toString());
            }
        }
    }
    public static void getTruancyStudent(){
        for (var item: students){
            if(item.getExcuse().length() > 0){
                System.out.println(item.toString());
            }
        }
    }
}
