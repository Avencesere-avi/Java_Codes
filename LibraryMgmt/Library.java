package LibraryMgmt;

import java.util.HashSet;

public class Library {

    HashSet<Book> hs = new HashSet<>();

    public boolean addBook(Book b)
    {
       return hs.add(b);
    }

    public int bookCount()
    {
        return hs.size();

    }

    public HashSet<Book> getAllBooks() {
        return hs;
    }
}
