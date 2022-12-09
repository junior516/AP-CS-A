
// Book class
public class Book {
    private String title;
    private String author;

    // Constructor
    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    // Getters
    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    // Equals method
    public boolean equals(Book book2) {
        if (book2.getTitle().equals(title) && book2.getAuthor().equals(author)) {
            return true;
        } else {
            return false;
        }
    }

    // toString method
    public String toString() {
        return (title + ", by " + author);
    }
}
