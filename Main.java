package Biblioteca;

public class Main {
    public static void main(String[] args)
    {
        var library = new Library();
        var book = new Libro();
        book.setNombre("Harry Potter");
        library.addBook(book);
        library.searchBook("Harry Potter");
        library.removeBook(book);
        library.searchBook("Harry Potter");
    }
}
