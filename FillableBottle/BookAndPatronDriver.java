// Driver for Book and Patron classes
public class BookAndPatronDriver {

    // Main method
    public static void main(String[] args) {
        // Patron object creation
        Patron myPatron = new Patron("Jacob James");
        // Creation of 3 book objects
        Book myBook = new Book("Percy Jackson", "Rick Riordan");
        Book myBook2 = new Book("The Lord of the Rings", "J.R.R. Tolkien");
        Book myBook3 = new Book("Harry Potter", "J.K. Rowling");
        // Borrowing books
        myPatron.borrowBook(myBook);
        myPatron.borrowBook(myBook2);
        // Returning books
        myPatron.returnBook(myBook);
        myPatron.returnBook(myBook2);
        // Borrowing same book again
        myPatron.borrowBook(myBook);
        // Borrowing 3rd book
        myPatron.borrowBook(myBook3);
        // Testing if patron can borrow book of same name
        myPatron.borrowBook(myBook);
        // Displaying patron information
        System.out.println(myPatron.toString());
    }
}
