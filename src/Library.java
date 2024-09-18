import java.util.ArrayList;

public class Library {
    private String libraryName;
    private ArrayList<Book> bookList;
    private ArrayList<LibraryMember> members;

    // Constructor
    public Library(String name) {
        this.libraryName = name;
        this.bookList = new ArrayList<>();
        this.members = new ArrayList<>();
    }

    // Methods

    // Adds a new book to the library's collection
    public void addBook(Book book) {
        bookList.add(book);
        System.out.println(book.getTitle() + " has been added to the library.");
    }

    // Registers a new library member
    public void registerMember(LibraryMember member) {
        members.add(member);
        System.out.println(member.getName() + " has been registered as a library member.");
    }

    // Prints a list of all books, including their status (checked out or not)
    public void printLibraryBooks() {
        System.out.println("Books in the library:");
        for (Book book : bookList) {
            System.out.println(book.getTitle() + " - Checked Out: " + (book.isCheckedOut() ? "Yes" : "No"));
        }
    }

    // Prints a list of all members and the number of books they have checked out
    public void printMembers() {
        System.out.println("Library Members:");
        for (LibraryMember member : members) {
            System.out.println(member.getName() + " has checked out " + member.getCheckedOutBooks().size() + " books.");
        }
    }

    // Main method for testing
    public static void main(String[] args) {
        // Create library
        Library myLibrary = new Library("City Library");

        // Create books
        Book book1 = new Book("Red Mars", "Kim Stanley Robinson", 1990);
        Book book2 = new Book("Green Mars", "Kim Stanley Robinson", 1992);

        // Add books to library
        myLibrary.addBook(book1);
        myLibrary.addBook(book2);

        // Create members
        LibraryMember member1 = new LibraryMember("Alice", 123);
        LibraryMember member2 = new LibraryMember("Bob", 456);

        // Register members in library
        myLibrary.registerMember(member1);
        myLibrary.registerMember(member2);

        // Print library books and members
        myLibrary.printLibraryBooks();
        myLibrary.printMembers();

        // Borrowing books
        member1.borrowBook(book1);
        member2.borrowBook(book2);

        // Print library books and members after borrowing
        System.out.println("\nAfter borrowing:");
        myLibrary.printLibraryBooks();
        myLibrary.printMembers();
    }
}
