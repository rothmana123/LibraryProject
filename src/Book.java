//Step 1: Define the Book Class
//Create a Book class with the following:
//
//Fields:
//title (String)
//author (String)
//yearPublished (int)
//isCheckedOut (boolean, defaults to false)
//Constructor: Initializes all fields except isCheckedOut (default it to false).

public class Book {

    // Field declarations
    String title;
    private String author;
    private int yearPublished;
    private boolean isCheckedOut;

    public Book(String title, String author, int yearPublished){
        this.title = title;
        this.author = author;
        this.yearPublished = yearPublished;
        this.isCheckedOut = false;
    }

    //Methods:
    //checkOut(): Marks the book as checked out (isCheckedOut becomes true).
    //returnBook(): Marks the book as returned (isCheckedOut becomes false).
    //printDetails(): Prints the title, author, yearPublished, and whether the book is currently checked out.
    public void checkOut(){
        this.isCheckedOut = true;
    }

    public void returnBook(){
        this.isCheckedOut = false;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getYearPublished() {
        return yearPublished;
    }

    public boolean isCheckedOut() {
        return isCheckedOut;
    }

    public void printDetails(){
        System.out.println(this.title + " " + this.author + " " + this.yearPublished + " " + this.isCheckedOut);
    }

    public static void main(String[] args) {
        Book book1 = new Book("Red Mars", "Kim Robinson", 1990);
        book1.printDetails();
    }
}

