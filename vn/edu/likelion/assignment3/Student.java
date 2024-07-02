package vn.edu.likelion.assignment3;

public class Student extends User {
    private String excuse;
    public Student(){

    }

    public Student(int id , String name, String dob, String CCCD,int classroomID, int age, String excuse){
        super(id, name, dob, CCCD, classroomID, age);
        this.excuse = excuse;
    }
    @Override
    public String toString() {
         return "studentID: " + this.getId() +
                 "\tStudent name: " + this.getName() +
                 "\tStudent date of birth: " + this.getDob() +
                 "\tStudent age: " + this.getAge() +
                 "\tStudent's CCCD " + this.getCCCD() +
                 "\tClassroom " + Classroom.getClassRoom(this.getClassroomID()) +
                 "\tReason left: " + getExcuse();
    }
    //getter setter for excuse
    public void setExcuse(String excuse){
        this.excuse = excuse;
    }
    public String getExcuse(){
        return this.excuse;
    }
}
