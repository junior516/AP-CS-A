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

    private boolean hasBorrowed(Book book) {
        if ((book != null) && (book1.equals(book) || book2.equals(book) || book3.equals(book))) {
            return true;
        } else {
            return false;
        }
    }

    public void returnBook(Book book) {
        if (book != null) {
            if (book1.getTitle() == book.getTitle()) {
                System.out.println("You returned: " + book1.getTitle());
                book1 = null;
            } else if (book2.getTitle() == book.getTitle()) {
                System.out.println("You returned: " + book2.getTitle());
                book2 = null;
            } else if (book3.getTitle() == book.getTitle()) {
                System.out.println("You returned: " + book3.getTitle());
                book3 = null;
            } else {
                System.out.println("This book has not been borrowed.");
            }
        }
    }

    public void borrowBook(Book book) {
        if (hasBorrowed(book)) {
            System.out.println("You have already borrowed this book.");
        } else if (book1 == null) {
            book1 = book;
            System.out.println("You have successfully borrowed: " + book1.getTitle());
        } else if (book2 == null) {
            book2 = book;
            System.out.println("You have successfully borrowed: " + book2.getTitle());
        } else if (book3 == null) {
            book3 = book;
            System.out.println("You have successfully borrowed: " + book3.getTitle());
        } else {
            System.out.println("You have already borrowed 3 books.");
        }
    }

    public String toString() {
        System.out.println("Patron name: " + name + "\nBooks borrowed:");
        String output = "";
        if (book1 != null) {
            output += book1.getTitle() + "\n,";
        }
        if (book2 != null) {
            output += book2.getTitle() + "\n,";
        }
        if (book3 != null) {
            output += book3.getTitle() + "\n";
        }
        if (output == "") {
            output = "No books borrowed.";
        }
        return output;
    }
}
