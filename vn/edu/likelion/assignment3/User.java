package vn.edu.likelion.assignment3;

public class User {
    private int id;
    private String name;
    private int age;
    private String dob;
    private String CCCD;
    private int classroomID;
    public User(){

    }
    // constructor for get sample data
    public User( int id,String name,String dob,String CCCD,int classroomID,int age){
        this.id = id;
        this.name=name;
        this.dob = dob;
        this.CCCD = CCCD;
        this.classroomID = classroomID;
        this.age = age;
    }
    // getter setter ID
    public void setId(int id){
        this.id = id;
    }
    public int getId(){
        return this.id;
    }
    // getter setter Name
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return this.name;
    }
    // getter setter Age
    public void setAge(int age){
        this.age = age;
    }
    public int getAge(){
        return this.age;
    }
    // getter setter dob
    public void setDob(String dob){
        this.dob = dob;
    }
    public String getDob(){
        return this.dob;
    }
    // getter setter CCCD
    public void setCCCD(String cccd){
        this.CCCD = cccd;
    }
    public String getCCCD(){
        return this.CCCD;
    }
    // getter setter classroomID
    public void setClassroomID( int classroomID){
        this.classroomID = classroomID;
    }
    public int getClassroomID(){
        return this.classroomID;
    }
    // tạm thời bỏ role :D
}
