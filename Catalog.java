import java.util.ArrayList;

class Book {
    String title;
    String author;
    String publisher;
    int yearPublished;
    String ISBN;

   
    public Book(String title, String author, String publisher, int yearPublished, String ISBN) {
        this.title = title;
        this.author = author;
        this.publisher = publisher;
        this.yearPublished = yearPublished;
        this.ISBN = ISBN;
    }
}

public class Catalog {
    ArrayList<Book> catalog = new ArrayList<>(); // ArrayList to store Book objects

   
    public void addBook(String title, String author, String publisher, int yearPublished, String ISBN) {
        Book newBook = new Book(title, author, publisher, yearPublished, ISBN);
        catalog.add(newBook); 
    }

    
    public void displayBooks() {
        for (Book book : catalog) {
            System.out.println("Title: " + book.title);
            System.out.println("Author: " + book.author);
            System.out.println("Publisher: " + book.publisher);
            System.out.println("Year Published: " + book.yearPublished);
            System.out.println("ISBN: " + book.ISBN);
            System.out.println("------------------------");
        }
    }

   
    public static void main(String[] args) {
        Catalog library = new Catalog(); // Create a new Catalog object (Library)
        
        
        library.addBook("oceanic", "F. bee ", "Scribner", 1999, "97807");
        library.addBook("oceans", "jeffer", "J.B. jeff.", 1999, "0061");
        
        
        library.displayBooks();
    }
}
