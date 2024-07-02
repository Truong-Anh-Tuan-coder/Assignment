package vn.edu.likelion.assignment3;

import java.io.Console;
import java.util.ArrayList;
import java.util.Scanner;

public class main {
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args){
        // sample data
        ArrayList<Teacher> teachers = new ArrayList<>();
        ArrayList<Student> students = new ArrayList<>();
        ArrayList<Classroom> classrooms = new ArrayList<>();

        // sample data
        teachers.add(new Teacher(1,"Sophus Brygida","1/1/2000","xxxxx2",1,25));
        teachers.add(new Teacher(2,"Amin Munyaradzi","1/1/2000","xxxxx3",2,25));
        teachers.add(new Teacher(3,"Phoebus Búi","1/1/2000","xxxxx5",3,25));

        students.add(new Student(1,"Demetra Daliborka","1/1/2000","xxxxx2",1,25,""));
        students.add(new Student(2,"Morvarid Ilargi","1/1/2000","xxxxx2",1,25,""));
        students.add(new Student(3,"Gershom Shakur","1/1/2000","xxxxx2",1,25,""));
        students.add(new Student(4,"Markos Naji","1/1/2000","xxxxx2",1,25,""));
        students.add(new Student(5,"Efthimia Natàlia","1/1/2000","xxxxx2",1,25,""));
        students.add(new Student(6,"Sandra Erdmann","1/1/2000","xxxxx2",1,25,""));
        students.add(new Student(7,"Boston Timothei","1/1/2000","xxxxx2",1,25,""));
        students.add(new Student(8,"Milada Arik","1/1/2000","xxxxx2",1,25,""));
        students.add(new Student(9,"Suze Kavi","1/1/2000","xxxxx2",1,25,""));
        students.add(new Student(10,"Elizabet Anakletos","1/1/2000","xxxxx2",1,25,""));
        students.add(new Student(11,"Maimunah Jocosa","1/1/2000","xxxxx2",2,25,"Tao buồn nghỉ"));
        students.add(new Student(12,"Vijay Philippa","1/1/2000","xxxxx2",2,25,"Tao thich :D"));

        students.add(new Student(13,"Priya Yosif","1/1/2000","xxxxx2",2,25,"ngủ chưa đã :D"));

        classrooms.add(new Classroom(1, "programming","Close"));
        classrooms.add(new Classroom(2, "advanced programming","Open"));
        classrooms.add(new Classroom(3, "data structure", "Open"));
        Classroom classroom = new Classroom(students, teachers, classrooms);

        System.out.println("1. Create student account");// done
        System.out.println("2. Update student account"); // done
        System.out.println("3. view available class"); // done
        System.out.println("4. Assign to class"); // got a bug.  need debug abit
        System.out.println("5. Truancy students");
        System.out.println("6. students of teacher");



        System.out.print("input your choice: " );
        int choice = scanner.nextInt();
        switch (choice){
            case 1: Classroom.addStudent(); break;
            case 2:
                Classroom.getStudentList();
                System.out.print("input your choice: " );
                Classroom.updateStudent(  scanner.nextInt()-1);
                break;
            case 3: Classroom.getClasses(); break;
            case 4: Classroom.assignToClass();break;
            case 5: Classroom.getTruancyStudent(); break;
            case 6: break;
        }
    }
}
