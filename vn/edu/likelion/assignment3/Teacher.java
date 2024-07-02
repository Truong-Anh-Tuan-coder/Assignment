package vn.edu.likelion.assignment3;

public class Teacher extends User{
    public Teacher(){

    }
    public Teacher(int id , String name, String dob, String CCCD,int classroomID, int age){
        super(id, name, dob, CCCD, classroomID, age);
    }
    //get object teacher
    public String toString() {
        return "Teacher ID: " + this.getId() +
                "\nTeacher Name: " + this.getName() +
                "\nTeacher date of birth: " + this.getDob() +
                "\nTeacher  age:" + this.getAge() +
                "\nTeacher's CCCD: " + this.getCCCD()+
        "\nClassroom " + Classroom.getClassRoom(this.getClassroomID())  ;   }
}
