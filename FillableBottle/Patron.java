// 5.4 - BookAndPatronLab

// Part Two
// Create a new class called Patron.java to include the following:
// Data Fields:
// •	name
// •	book1, book2, book3 (all of the Book type as described above)
// Constructor:
// •	Custom constructor that expects the name, but initializes the Book variables to null.

package Unit5.BookAndPatronLab;

public class Patron {
    private String name;
    private Book book1;
    private Book book2;
    private Book book3;

    public Patron(String name) {
        this.name = name;
        book1 = null;
        book2 = null;
        book3 = null;
    }

    // • A method to determine whether a patron has borrowed a book (based on its
    // title and author)
    // o Give this method private visibility – it will only be accessed from the
    // Patron class.
    // o Be sure not to test any null books for equality with other books!

    private boolean hasBorrowed(Book book) {
        if (book1 == book || book2 == book || book3 == book) {
            return true;
        } else {
            return false;
        }
    }

    // • A method to return a book (based on its title)
    // o Be sure not to attempt to compare titles of null books

    public void returnBook(Book book) {
        if (book1 == book) {
            System.out.println("You have successfully returned: " + book1);
            book1 = null;
        } else if (book2 == book) {
            System.out.println("You have successfully returned: " + book2);
            book2 = null;
        } else if (book3 == book) {
            System.out.println("You have successfully returned: " + book3);
            book3 = null;
        } else {
            System.out.println("You have not borrowed this book");
        }
    }

    // • A method to borrow a book (given a title and author)
    // o If 3 books have already been borrowed, output a message saying so.
    // o If the patron has already has the same book checked out, do not let them
    // borrow a duplicate.

    public void borrowBook(Book book) {
        if (book1 == null) {
            book1 = book;
            System.out.println("You have successfully borrowed: " + book1);
        } else if (book2 == null) {
            book2 = book;
            System.out.println("You have successfully borrowed: " + book2);
        } else if (book3 == null) {
            book3 = book;
            System.out.println("You have successfully borrowed: " + book3);
        } else if (hasBorrowed(book)) {
            System.out.println("You have already borrowed this book.");
        } else {
            System.out.println("You have already borrowed 3 books.");
        }
    }

    // • A toString() method to display the patron’s name and three books.

    public String toString() {
        if (book1 == null && book2 == null && book3 == null) {
            return "Patron " + name + " has not borrowed any books.";
        } else if (book2 == null && book3 == null) {
            return "Patron " + name + " has borrowed:" + "\n" + "Book 1: " + book1;
        } else if (book3 == null) {
            return "Patron " + name + " has borrowed:" + "\n" + "Book 1: " + book1 + "\n" + "Book 2: " + book2;
        } else {
            return "Patron " + name + " has borrowed:" + "\n" + "Book 1: " + book1 + "\n" + "Book 2: " + book2 + "\n"
                    + "Book 3: " + book3;
        }
    }
}
