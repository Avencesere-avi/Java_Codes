package HashSetExercise;

import java.util.Objects;

public class Book {

    private String name;
    private String author;
    private int pirce;


    public Book(String name, String author, int pirce) {
        this.name = name;
        this.author = author;
        this.pirce = pirce;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", author='" + author + '\'' +
                ", pirce=" + pirce +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Book book)) return false;
        return pirce == book.pirce && Objects.equals(name, book.name) && Objects.equals(author, book.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, author, pirce);
    }
}
