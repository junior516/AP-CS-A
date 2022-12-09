
public class Book {
    private String title;
    private String author;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public boolean equals(Book book2) {
        if (book2.getTitle().equals(title) && book2.getAuthor().equals(author)) {
            return true;
        } else {
            return false;
        }
    }

    public String toString() {
        return (title + ", " + author);
    }
}
