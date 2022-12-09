// 5.4 - BookAndPatronLab

// Part Three
// Create a driver that instantiates a Patron and tests the borrowBook, returnBook and toString methods of Patron.

package Unit5.BookAndPatronLab;

public class BookAndPatronDriver {
    public static void main(String[] args) {
        Patron joeBiden = new Patron("Joe Biden");

        Book book1 = new Book("The Art of War", "Sun Tzu");
        Book book2 = new Book("The Prince", "Niccolo Machiavelli");
        Book book3 = new Book("The Bible", "God");
        Book book4 = new Book("The Lord of the Rings", "J.R.R. Tolkien");

        // Tests toString method
        System.out.println(joeBiden);

        // Tests borrowBook method
        joeBiden.borrowBook(book1);
        joeBiden.borrowBook(book2);
        joeBiden.borrowBook(book3);
        System.out.println(joeBiden);

        // Tests returnBook method
        joeBiden.returnBook(book1);
        joeBiden.returnBook(book2);
        joeBiden.returnBook(book3);
        System.out.println(joeBiden);

        /* TESTING FOR ERRORS */

        // Tests for error when trying to borrow more than 3 books
        joeBiden.borrowBook(book1);
        joeBiden.borrowBook(book2);
        joeBiden.borrowBook(book3);
        joeBiden.borrowBook(book4);

        // Tests for error when trying to return a book that hasn't been checked out
        joeBiden.returnBook(book4);

        // Tests for error when trying to borrow a book that has already been checked out
        joeBiden.borrowBook(book1);
    }
}
