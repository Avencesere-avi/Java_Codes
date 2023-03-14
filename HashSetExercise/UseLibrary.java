package HashSetExercise;

import java.security.spec.RSAOtherPrimeInfo;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

public class UseLibrary {
    public static void main(String[] args) {

        Book b1 = new Book("Let us C" , "Kanetkar" , 560);
        Book b2 = new Book("Let us C++" , "Kanetkar" , 560);
        Book b3 = new Book("Learning Java" , "Meymar" , 750);
        Book b4 = new Book("Let us C" , "Kanetkar" , 560);
        Book b5 = new Book("Learning Java" , "Meymar" , 750);

        Library library = new Library();
        System.out.println("Book1 Added" +library.addBook(b1));
        System.out.println("Book2 Added" +library.addBook(b2));
        System.out.println("Book3 Added" +library.addBook(b3));
        System.out.println("Book4 Added" +library.addBook(b4));
        System.out.println("Book5 Added" +library.addBook(b5));


        System.out.println("Total book is Library " +library.getBookCount());
//
        HashSet<Book> hs = library.getAllBooks();

        Iterator<Book> it = hs.iterator();

        while (it.hasNext())
        {
            Book b = it.next();
            System.out.println(b);
        }
    }
}
