package LibraryMgmt;

import java.util.HashSet;
import java.util.Iterator;

public class UseLibrary {

    public static void main(String[] args) {

        Book b1 = new Book("Let us C" , "Kanetkar", 480);
        Book b2 = new Book("Let us C" , "Kanetkar", 480);
        Book b3 = new Book("Let us C++" , "Kanetkar", 480);

        Library library = new Library();

        library.addBook(b1);
        library.addBook(b2);
        library.addBook(b3);

        System.out.println("Total book added in the Library " +library.bookCount());

        HashSet<Book> hs = library.getAllBooks();

        Iterator <Book> it = hs.iterator();

        while (it.hasNext())
        {
            Book d = it.next();
            System.out.println(d);

        }
    }
}
