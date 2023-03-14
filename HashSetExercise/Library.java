package HashSetExercise;

import java.util.HashSet;
import java.util.Scanner;

public class Library {

    HashSet<Book> hs = new HashSet<>();


//    public Library()
//    {
//        hs=new HashSet<>();
//    }

    public boolean addBook(Book b)
    {
        return hs.add(b);
    }

    public int getBookCount()
    {
        return hs.size();
    }

    public HashSet<Book> getAllBooks()
    {
        return hs;
    }






}
