// 5.4 - BookAndPatronLab

// Part One
// Create a new class called Book.java to include the following:
// Data Fields:
// •	title
// •	author
// Constructor:
// •	Custom constructor that expects both a title and author
// Methods:
// •	Getter for title
// •	Getter for author
// •	A “.equals” method that expects a Book and returns true if the titles and authors match, false otherwise.
// •	A toString() method that displays the Book’s title and author.

package Unit5.BookAndPatronLab;

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

    public boolean equals(Book bookN) {
        if (bookN.getTitle().equals(title) && bookN.getAuthor().equals(author)) {
            return true;
        } else {
            return false;
        }
    }

    public String toString() {
        return (title + ", by " + author);
    }
}
