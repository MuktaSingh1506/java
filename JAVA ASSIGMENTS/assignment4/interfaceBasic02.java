package assignment4;

interface Printable {
    static final int maxPages = 1000;
    public static void readPages() {
        for (int i = 0; i < maxPages; i++) {
            System.out.print(i+" ");
        }
    }
    public void displayType();
}

class Book implements Printable {
    @Override
    public void displayType() {
        System.out.println("I am a book");
    }
}

class Magazine implements Printable {
    @Override
    public void displayType() {
        System.out.println("I am a Magazine");
    }
}

public class interfaceBasic02 {
    public static void main(String[] args) {
        Book b1 = new Book();
        b1.displayType();

        Magazine m1 = new Magazine();
        m1.displayType();
    }
}
