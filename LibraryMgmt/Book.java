package LibraryMgmt;

import java.util.Objects;

public class Book {

    private String bookname;
    private String author;
    private int price;

    @Override
    public String toString() {
        return "Book{" +
                "bookname='" + bookname + '\'' +
                ", author='" + author + '\'' +
                ", price=" + price +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Book book)) return false;
        return price == book.price && Objects.equals(bookname, book.bookname) && Objects.equals(author, book.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(bookname, author, price);
    }

    public Book(String bookname, String author, int price) {
        this.bookname = bookname;
        this.author = author;
        this.price = price;
    }
}
