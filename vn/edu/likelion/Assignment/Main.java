package vn.edu.likelion.Assignment;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane;
import java.io.IOException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class Main {
    public static Scanner scanner =new Scanner(System.in);
    public static int choice;
    static ArrayList<Student> students;
    static ArrayList<Course> courses;
    static Course course;
    static Student student;



    public static void main(String[] args){
        addSampleData();
        course= new Course(courses,students);
        student = new Student(students);

        do {
            System.out.println("====Classroom management program====");
            System.out.println("1. Management course");
            System.out.println("2. Management student");
            System.out.println("3. Exit Application");
            System.out.print("Input your choice: ");
            choice = scanner.nextInt();
            switch (choice) {
                case 1: CourseMenu(); break;
                case 2: StudentMenu();break;
                case 3: break;
                default:
                    System.err.println("Invalid choice");
            }
        }while (choice != 3);
    }

    public static void CourseMenu(){
        do {
            System.out.println("====Course Menu ====");
            System.out.println("1. view all Course");
            System.out.println("2. Go Back");
            System.out.print("Input your choice: ");
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    FunctionInCourseMenu();
                    break;
                case 2:
                    choice = -1;
                    break;
                default:
                    System.out.println("Invalid choice");
            }
        }while(choice != -1);
    }
    public static void FunctionInCourseMenu(){
        do {
            course.getCourses();
            System.out.println("====Course Menu ====");
            System.out.print("1. view Course detail by ID \t\t");
            System.out.println("2. add new Course");
            System.out.print("3. update Course \t"); // update name of course and number of student.
            System.out.print("4. delete Course \t");
            System.out.println("5. go back");
            System.out.print("Input your choice: ");
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("Input STT of the Course to view detail: ");
                    choice = scanner.nextInt();
                    course.getCourseDetail(choice);
                    choice = 1;
                    try {
                        char c = (char) System.in.read(); // similiar with console.readkey in .net
                    }catch (IOException e){
                        System.out.println(e);
                    }
                    break;
                case 2:
                    System.out.print("Input courseID: ");
                    scanner.nextLine(); // for fix bug of scanner
                    course.setCourseID(scanner.nextLine());
                    System.out.print("Input Course name: ");
                    course.setCourseName(scanner.nextLine());
                    course.addCourse(course);
                    try {
                        char c = (char) System.in.read(); // similiar with console.readkey in .net
                    }catch (IOException e){
                        System.out.println(e);
                    }
                    break;
                case 3:
                    System.out.print("Input STT of the course you want update: ");
                    course.setSTT(scanner.nextInt());
                    scanner.nextLine();
                    System.out.print("Input update course name: ");

                    course.setCourseName(scanner.nextLine());
                    course.updateCourse(course);
                    break;
                case 4:
                    System.out.print("Input STT of the course you love delete: ");
                    course.deleteCourse(scanner.nextInt());
                    break;
                case 5:
                    choice = -1;
                    break;
                default:
                    System.out.println("Invalid choice");
            }
        }while (choice != -1); // still set -1 because its help escape faster -> more flexible

    }

    public static void StudentMenu(){
        System.out.println("====Student Menu ====");
        System.out.println("1. view all Student");
        System.out.println("2. Go Back");
        System.out.print("Input your choice: ");
        choice = scanner.nextInt();
        switch(choice){
            case 1: student.getStudent(); FunctionInStudentMenu(); break;
            case 2: choice = -1; break;
            default: System.out.println("Invalid choice");
        }
    }
    public static void FunctionInStudentMenu(){
        System.out.println("====Student Menu ====");
        System.out.print("1. Add student \t\t");
        System.out.println("2. update student");
        System.out.print("3. delete student \t\t");
        System.out.println("4. Go Back");
        System.out.print("Input your choice: ");
        choice = scanner.nextInt();
        switch (choice){
            case 1:
                System.out.print("Input new student ID:");
                student.setStudentID(scanner.nextLine());
                scanner.nextLine();
                System.out.print("name of new student: ");
                student.setStudentName(scanner.nextLine());
                System.out.print("age: ");
                student.setAge(scanner.nextInt());
                scanner.nextLine();
                System.out.print("course ");
                student.setCourseName(scanner.nextLine());
                student.addStudent(student);
                break;
            case 2:
                System.out.print("Input STT that is the student you want update: ");
                student.setSTT(scanner.nextInt());
                scanner.nextLine();
                System.out.print("update name: ");
                student.setStudentName(scanner.nextLine());
                System.out.print("update age: ");
                student.setAge(scanner.nextInt());
                scanner.nextLine();
                System.out.print("update course ");
                student.setCourseName(scanner.nextLine());
                student.updateStudent(student);
                break;
            case 3:
                System.out.print("input STT that the student you want delete: ");
                student.deleteStudent(scanner.nextInt());
                break;
            case 4: choice = -1; break;
            default: System.out.println("Invalid choice");
        }
    }
    public static void addSampleData(){
        //data sample for Courses
        courses = new ArrayList<>();
        courses.add(new Course(0,"Class 1", "Basic programming",3,"Started"));
        courses.add(new Course(1,"Class 2", "Advance programming",3,"Started"));
        courses.add(new Course(2,"Class 3", "Algorithm",3,"Started"));
        courses.add(new Course(3,"Class 4", "Professional practical",0,"Open Soon"));

        //data sample for Students
        students = new ArrayList<>();
        students.add(new Student(0,"StudentID : 1", "IS", 81, "1/1/1943","Basic programming"));
        students.add(new Student(1,"StudentID : 2", "IS-2", 80, "1/1/1944","Basic programming"));
        students.add(new Student(2,"StudentID : 3", "IS-3", 80, "1/1/1944","Basic programming"));
        students.add(new Student(3,"StudentID : 4", "IS-4", 78, "1/1/1946","Advance programming"));
        students.add(new Student(4,"StudentID : 5", "IS-8", 71, "1/1/1953","Advance programming"));
        students.add(new Student(5,"StudentID : 6", "IS-7", 79, "1/1/1945","Advance programming"));
        students.add(new Student(6,"StudentID : 7", "T-54 Model 1946", 78, "1/1/1946","Algorithm"));
        students.add(new Student(7,"StudentID : 8", "T-54 Model 1949", 75, "1/1/1949","Algorithm"));
        students.add(new Student(8,"StudentID : 9", "T-54A", 75, "1/1/1955","Algorithm"));




    }

}
