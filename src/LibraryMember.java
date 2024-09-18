//Create a LibraryMember class to represent people who check out books:
//
//Fields:
//name (String)
//memberID (int)
//checkedOutBooks (ArrayList of Book objects)
//Constructor: Initializes the member’s name and ID. The checkedOutBooks list starts as empty.

import java.util.ArrayList;

public class LibraryMember {
    private String name;
    private int memberID;
    private ArrayList<Book> checkedOutBooks;

    public LibraryMember(String name, int memberID) {
        this.name = name;
        this.memberID = memberID;
        this.checkedOutBooks = new ArrayList<>();
    }

    //Methods:
    //borrowBook(Book book): Adds a book to the checkedOutBooks list, if it is not already checked out.
    //returnBook(Book book): Removes the book from the checkedOutBooks list and marks it as returned.
    //printMemberDetails(): Prints the member’s name, ID, and the titles of any books they currently have checked out.
    public void borrowBook(Book book) {
        //checkedOutBooks.add(book);
        // Check if the book is already checked out
        if (!book.isCheckedOut()) {
            checkedOutBooks.add(book);
            book.checkOut();  // Mark the book as checked out
            System.out.println(name + " borrowed " + book.getTitle());
        } else {
            System.out.println(book.getTitle() + " is already checked out.");
        }
    }
    public String getName() {
        return name;
    }
    public ArrayList<Book> getCheckedOutBooks() {
        return checkedOutBooks;
    }
    public void returnBook(Book book) {
        checkedOutBooks.remove(book);
    }

    //    public void printMemberDetails(){
//        System.out.println(this.name + " " + this.memberID + " ");
//        for (int i = 0; i < checkedOutBooks.size(); i++){
//            Book book = checkedOutBooks.get(i);
//            System.out.println(book.title);
//        }
//    }
    public void printMemberDetails() {
        System.out.println("Member Name: " + this.name);
        System.out.println("Member ID: " + this.memberID);
        System.out.println("Books Checked Out:");
        for (Book book : checkedOutBooks) {
            System.out.println("- " + book.getTitle());
        }
    }

        public static void main (String[]args){
            // Create some book objects
            Book book1 = new Book("Red Mars", "Kim Stanley Robinson", 1990);
            Book book2 = new Book("Green Mars", "Kim Stanley Robinson", 1992);

            // Create a library member
            LibraryMember member = new LibraryMember("Lindsey", 123);

            // Borrow and return books
            member.borrowBook(book1);
            member.borrowBook(book2);
            member.printMemberDetails();

            member.returnBook(book1);
            member.printMemberDetails();
        }
    }


