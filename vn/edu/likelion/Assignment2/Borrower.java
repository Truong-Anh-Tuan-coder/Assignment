package vn.edu.likelion.Assignment2;

import jdk.dynalink.beans.StaticClass;

import java.util.ArrayList;

public class Borrower extends SuperClass implements  _InterFace
{
    public int Age;
    static ArrayList<Borrower> ListBorrower;

    //Constructor section
    public Borrower(){

    }
    public Borrower(ArrayList<Borrower> List){
        Borrower.ListBorrower = List;
    }
    public Borrower (int ID, String Name, int Age ){
        this.ID = ID;
        this.Name = Name;
        this.Age = Age;
    }
    //interface inherited section

    public void updateElement(Borrower borrower) {
        Borrower.ListBorrower.set(borrower.getID(), borrower);

    }

    public void addElement(Borrower borrower) {
        borrower.setID(Borrower.ListBorrower.size());
        Borrower.ListBorrower.add(borrower);

    }
    public static void getListBorrower(){
        for(var item: ListBorrower){
            System.out.println(item.ID +" "+ item.Name + " " + item.Age);
        }
    }

    // getter setter section.
    public void setAge(int Age)
    {
        this.Age = Age;
    }
    public int getAge()
    {
        return this.Age;
    }

    public void setID(int ID){ this.ID = ID ;}
    public int getID() { return this.ID;}
    public void setName(String Name){ this.Name= Name;}
    public String getName() { return this.Name;}

    public Borrower getBorrower(int ID){
        return Borrower.ListBorrower.get(ID);
    }

}
