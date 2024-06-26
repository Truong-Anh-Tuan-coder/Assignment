package vn.edu.likelion.Assignment2;

import com.sun.tools.jconsole.JConsoleContext;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class BorrowerBook {

    public int ID;
    public String BookName;
    public String BorrowerName;
    public String Dateborrowed;
    public String DateTimeReturn;
    public int SL;
    public String status; //Borrowing | returned
    private static ArrayList<BorrowerBook> ListborrowerBook;
    DateTimeFormatter formatter =  DateTimeFormatter.ofPattern("dd/MM/yyyy");
    String todaytime = LocalDate.now().format(formatter);


    public BorrowerBook(int ID, String BookName, String BorrowerName, String Dateborrowed, String DateTimeReturn, int SL, String Status){
        this.ID = ID;
        this.BookName = BookName;
        this.BorrowerName = BorrowerName;
        this.Dateborrowed = Dateborrowed;
        this.DateTimeReturn = DateTimeReturn;
        this.SL = SL;
        this.status =Status;
    }
    public BorrowerBook(ArrayList<BorrowerBook> listborrowerBook){
        BorrowerBook.ListborrowerBook = listborrowerBook;
    }

    public void makeLoan(BorrowerBook borrowerBook,Book book,Borrower borrower ){
         borrowerBook.setID(BorrowerBook.ListborrowerBook.size());
        borrowerBook.setBookName(book.getName());
        borrowerBook.setBorrowerName(borrower.getName());
        borrowerBook.setDateborrowed(todaytime);
        borrowerBook.setDateTimeReturn("");
        borrowerBook.setStatus("Borrowing");
        BorrowerBook.ListborrowerBook.add(borrowerBook);
    }
    public void returnBook(BorrowerBook borrowerBook,int id){
        borrowerBook= BorrowerBook.ListborrowerBook.get(id);
        borrowerBook.setDateTimeReturn(todaytime);
        borrowerBook.setStatus("Returned");
        BorrowerBook.ListborrowerBook.set(id, borrowerBook);
    }
    static void ListBorrowerBook(){

        for(var item : BorrowerBook.ListborrowerBook){
            System.out.println(item.getID() + " " + item.getBookName() + " " + item.getBorrowerName()
            + " " + item.status + " " + item.getDateborrowed() + " "+ item.getDateTimeReturn());
        }
    }
    public void setID(int ID){
        this.ID = ID;
    }
    public int getID(){ return this.ID;}
    public void setBookName(String bookName){
        this.BookName = bookName;
    }
    public String getBookName(){ return this.BookName;}
    public void setBorrowerName(String borrowerName){
        this.BorrowerName = borrowerName;
    }
    public String getBorrowerName() { return this.BorrowerName;}
    public void setDateborrowed(String Datetime){
        this.Dateborrowed = Datetime;
    }
    public String getDateborrowed(){
        return this.Dateborrowed;
    }
    public void setDateTimeReturn(String dateTimeReturn){
        this.DateTimeReturn = dateTimeReturn;
    }
    public String getDateTimeReturn(){

        return this.DateTimeReturn;
    }
    public void setSL(int sl){
        this.SL = sl;
    }
    public int getSL (){
        return this.SL;
    }
    public void setStatus(String status){
        this.status = status;
    }
    public String getStatus() {
        return this.status;
    }
}
