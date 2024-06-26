package vn.edu.likelion.Assignment2;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class main {
    static ArrayList<Book> ListBook = new ArrayList<Book>();
    static ArrayList<Borrower> ListBorrower = new ArrayList<Borrower>();
    static ArrayList<BorrowerBook> ListborrowerBook = new ArrayList<BorrowerBook>();
    static Scanner scanner = new Scanner(System.in);

    static int choice;
    public static void main( String[] args){
        SampleData();
        Book book = new Book(ListBook);
        Borrower borrower = new Borrower(ListBorrower);
        BorrowerBook borrowerBook = new BorrowerBook(ListborrowerBook);
        do {

            try {
                char c = (char) System.in.read(); // similiar with console.readkey in .net
            }catch (IOException e){
                System.out.println(e);
            }
            System.out.println("1. View all borrower");

            System.out.println("2. add borrower");
            System.out.println("3. update borrower ");
            System.out.println("4. View all book");
            System.out.println("5. add new book");
            System.out.println("6. update book");
            System.out.println("7. remove book");
            System.out.println("8. View history borrow book");
            System.out.println("9. loan request");
            System.out.println("10. return request");
            System.out.println("11. end program");
            System.out.print("input your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 1:
                    Borrower.getListBorrower();
                    break;
                case 2:
                    addNewBorrower(borrower);
                    break;
                case 3:
                    updateBorrower(borrower);
                    break;
                case 4:
                    Book.getListBook();
                    break;
                case 5:
                    addNewBook(book);
                    break;
                case 6:
                    updateBook(book);
                    break;
                case 7:
                    deleteBook(book);
                    break;
                case 8:
                    BorrowerBook.ListBorrowerBook();
                    break;
                case 9:
                    loanRequest(borrower, book, borrowerBook);
                    break;
                case 10:
                    returnBook(borrowerBook);
                    break;
                case 11:
                    break;
                default:
                    System.out.println("Invalid input");
            }
        }while(choice != 11);


        //view
        // book - borrower - book borrower- done
        //add section



        //update section



        //delete

        // add book borrower. --done

        //return book borrower


    }
    public static void returnBook(BorrowerBook borrowerBook){
//        Book.getListBook();
//        Borrower.getListBorrower();
        BorrowerBook.ListBorrowerBook();
        System.out.print("input id for return: ");
        borrowerBook.returnBook(borrowerBook,scanner.nextInt());

        BorrowerBook.ListBorrowerBook();
    }
    public static void loanRequest(Borrower borrower,Book book,BorrowerBook borrowerBook){

        System.out.print("Input ID of person making book loan request: ");
        borrower.setID(scanner.nextInt());
        scanner.nextLine();
        System.out.print("Input ID of book the person want to loa: ");
        book.setID(scanner.nextInt());
        scanner.nextLine();
        borrowerBook.makeLoan(borrowerBook,book.getBook(book.getID()), borrower.getBorrower(borrower.getID()));
        BorrowerBook.ListBorrowerBook();
    }
    //add
    //add new borrower
    public static void addNewBorrower(Borrower borrower){

        System.out.print("input name borrower: ");
        borrower.setName(scanner.nextLine());
        System.out.print("input age borrower: ");
        borrower.setAge(scanner.nextInt());
        borrower.addElement(borrower);
        borrower.getListBorrower();
    }
    //add new book
    public static void addNewBook(Book book){

        System.out.print("input name book: ");
        book.setName(scanner.nextLine());
        System.out.print("input name of author: ");
        book.setAuthorName(scanner.nextLine());
        System.out.print("Input SL book: ");
        book.setSL(scanner.nextInt());
        scanner.nextLine();
        book.addElement(book);
        Book.getListBook();
    }
    //update
    // update book
    public static void updateBook(Book book){
        Book.getListBook();
        System.out.print("input ID of the book you want to modify: ");
        book.setID(scanner.nextInt());
        scanner.nextLine();
        System.out.print("Input new name for book:");
        book.setName(scanner.nextLine());
        System.out.print("Input new name for author");
        book.setAuthorName(scanner.nextLine());
        System.out.print("input new SL :");
        book.setSL(scanner.nextInt());
        book.updateElement(book);

        Book.getListBook();
    }

    // update borrower
    public static void updateBorrower(Borrower borrower){
        Borrower.getListBorrower();
        System.out.print("input ID of the Borrower you want to modify: ");
        borrower.setID(scanner.nextInt());
        scanner.nextLine();
        System.out.print("Input new name for borrower :");
        borrower.setName(scanner.nextLine());
        System.out.print("Input new age for borrower ");
        borrower.setAge(scanner.nextInt());
        borrower.updateElement(borrower);

        Borrower.getListBorrower();
    }
    //delete
    public static void deleteBook(Book book){

        Book.getListBook();
        System.out.print("Input ID book for delete: ");
        book.deleteElement(scanner.nextInt());
        Book.getListBook();
    }
    //auto generate sample data
    public static void SampleData(){
        for(int i = 0; i <10 ; i++){
            ListBook.add(new Book(i,"Book " + i, "Author "+ i, 5+i ));
        }

        for(int i = 0 ; i < 5 ; i++){
            ListBorrower.add( new Borrower(i,"Borrower "+ i ,15+i));
        }
        ListborrowerBook.add( new BorrowerBook(0, "Book 1", " Borrower 1", " 1/1/2020" ,"1/1/2021", 1,"Returned"));

        ListborrowerBook.add( new BorrowerBook(1, "Book 2", " Borrower 3", " 1/1/2020" ,"", 1,"Borrowing"));
    }
}
