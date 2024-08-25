package Biblioteca;

import java.util.ArrayList;
import java.util.List;

public class Library {
    private List<Libro> books;
    public Library(){
        this.books = new ArrayList<>();
    }

    public void addBook(Libro book){
        books.add(book);
    }

    public void removeBook(Libro book){
        books.remove(book);
    }

    public void searchBook(String name){
        var wasFound = false;
        for (Libro book : books) {
            if (book.getNombre().equals(name)) {
                System.out.println("Book found: " + book.getNombre());
                wasFound = true;
                break;
            }
        }
        if (!wasFound) {
            System.out.println("Book not found");
        }
    }

}
