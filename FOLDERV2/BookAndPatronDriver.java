


public class BookAndPatronDriver {
    public static void main(String[] args) {
        Patron joeBiden = new Patron("Joe Biden");

        Book book1 = new Book("The Art of War", "Sun Tzu");
        Book book2 = new Book("The Prince", "Niccolo Machiavelli");
        Book book3 = new Book("The Bible", "God");
        Book book4 = new Book("The Lord of the Rings", "J.R.R. Tolkien");

        System.out.println(joeBiden);


        joeBiden.borrowBook(book1);
        joeBiden.borrowBook(book2);
        joeBiden.borrowBook(book3);
        System.out.println(joeBiden);


        joeBiden.returnBook(book1);
        joeBiden.returnBook(book2);
        joeBiden.returnBook(book3);
        System.out.println(joeBiden);


        joeBiden.borrowBook(book1);
        joeBiden.borrowBook(book2);
        joeBiden.borrowBook(book3);
        joeBiden.borrowBook(book4);

     
        joeBiden.returnBook(book4);


        joeBiden.borrowBook(book1);
    }
}
