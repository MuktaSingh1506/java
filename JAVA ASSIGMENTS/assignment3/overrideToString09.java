package assignment3;

import java.util.Date;

class Book {
    private String name;
    private String author;
    private String ISBN;
    private Date publishDate;

    Book(String n, String a, String I, Date p) {
        name = n;
        author = a;
        ISBN = I;
        publishDate = p;
    }

    @Override
    public String toString() {
        return "Name:" + name + " Author:" + author + " ISBN:" + ISBN + " PublishDate" + publishDate.toString();
    }
}

public class overrideToString09 {
    public static void main(String[] args) {
        Book a = new Book("Harry Potter", "J.K. Rowling", "9876543210", new Date());
        System.out.println(a.toString());
    }
}
