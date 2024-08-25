package Biblioteca;

public class Main {
    public static void main(String[] args)
    {
        var library = new Library();
        var author = new Autor();
        author.setNombre("J.K. Rowling");
        author.setEdad(15);

        var book = new Libro();
        book.setNombre("Harry Potter");
        book.setCategoria("Fantasy");
        book.setAutor(author);

        library.addBook(book);
        library.searchBook("Harry Potter");
        library.removeBook(book);
        library.searchBook("Harry Potter");
    }
}
